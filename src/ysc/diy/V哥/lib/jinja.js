/*!
 * Jinja Templating for JavaScript v0.1.8
 * https://github.com/sstur/jinja-js
 *
 * This is a slimmed-down Jinja2 implementation [http://jinja.pocoo.org/]
 *
 * In the interest of simplicity, it deviates from Jinja2 as follows:
 * - Line statements, cycle, super, macro tags and block nesting are not implemented
 * - auto escapes html by default (the filter is "html" not "e")
 * - Only "html" and "safe" filters are built in
 * - Filters are not valid in expressions; `foo|length > 1` is not valid
 * - Expression Tests (`if num is odd`) not implemented (`is` translates to `==` and `isnot` to `!=`)
 *
 * Notes:
 * - if property is not found, but method '_get' exists, it will be called with the property name (and cached)
 * - `{% for n in obj %}` iterates the object's keys; get the value with `{% for n in obj %}{{ obj[n] }}{% endfor %}`
 * - subscript notation `a[0]` takes literals or simple variables but not `a[item.key]`
 * - `.2` is not a valid number literal; use `0.2`
 *
 */
/*global require, exports, module, define */

(function (global, factory) {
    typeof exports === 'object' && typeof module !== 'undefined' ? factory(exports) :
        typeof define === 'function' && define.amd ? define(['exports'], factory) :
            (global = typeof globalThis !== 'undefined' ? globalThis : global || self, factory(global.jinja = {}));
})(this, (function (jinja) {
    "use strict";
    var STRINGS = /'(\\.|[^'])*'|"(\\.|[^"'"])*"/g;
    var IDENTS_AND_NUMS = /([$_a-z][$\w]*)|([+-]?\d+(\.\d+)?)/g;
    var NUMBER = /^[+-]?\d+(\.\d+)?$/;
    //non-primitive literals (array and object literals)
    var NON_PRIMITIVES = /\[[@#~](,[@#~])*\]|\[\]|\{([@i]:[@#~])(,[@i]:[@#~])*\}|\{\}/g;
    //bare identifiers such as variables and in object literals: {foo: 'value'}
    var IDENTIFIERS = /[$_a-z][$\w]*/ig;
    var VARIABLES = /i(\.i|\[[@#i]\])*/g;
    var ACCESSOR = /(\.i|\[[@#i]\])/g;
    var OPERATORS = /(===?|!==?|>=?|<=?|&&|\|\||[+\-\*\/%])/g;
    //extended (english) operators
    var EOPS = /(^|[^$\w])(and|or|not|is|isnot)([^$\w]|$)/g;
    var LEADING_SPACE = /^\s+/;
    var TRAILING_SPACE = /\s+$/;

    var START_TOKEN = /\{\{\{|\{\{|\{%|\{#/;
    var TAGS = {
        '{{{': /^('(\\.|[^'])*'|"(\\.|[^"'"])*"|.)+?\}\}\}/,
        '{{': /^('(\\.|[^'])*'|"(\\.|[^"'"])*"|.)+?\}\}/,
        '{%': /^('(\\.|[^'])*'|"(\\.|[^"'"])*"|.)+?%\}/,
        '{#': /^('(\\.|[^'])*'|"(\\.|[^"'"])*"|.)+?#\}/
    };

    var delimeters = {
        '{%': 'directive',
        '{{': 'output',
        '{#': 'comment'
    };

    var operators = {
        and: '&&',
        or: '||',
        not: '!',
        is: '==',
        isnot: '!='
    };

    var constants = {
        'true': true,
        'false': false,
        'null': null
    };

    function Parser() {
        this.nest = [];
        this.compiled = [];
        this.childBlocks = 0;
        this.parentBlocks = 0;
        this.isSilent = false;
    }

    Parser.prototype.push = function (line) {
        if (!this.isSilent) {
            this.compiled.push(line);
        }
    };

    Parser.prototype.parse = function (src) {
        this.tokenize(src);
        return this.compiled;
    };

    Parser.prototype.tokenize = function (src) {
        var lastEnd = 0, parser = this, trimLeading = false;
        matchAll(src, START_TOKEN, function (open, index, src) {
            //here we match the rest of the src against a regex for this tag
            var match = src.slice(index + open.length).match(TAGS[open]);
            match = (match ? match[0] : '');
            //here we sub out strings so we don't get false matches
            var simplified = match.replace(STRINGS, '@');
            //if we don't have a close tag or there is a nested open tag
            if (!match || ~simplified.indexOf(open)) {
                return index + 1;
            }
            var inner = match.slice(0, 0 - open.length);
            //check for white-space collapse syntax
            if (inner.charAt(0) === '-') var wsCollapseLeft = true;
            if (inner.slice(-1) === '-') var wsCollapseRight = true;
            inner = inner.replace(/^-|-$/g, '').trim();
            //if we're in raw mode and we are not looking at an "endraw" tag, move along
            if (parser.rawMode && (open + inner) !== '{%endraw') {
                return index + 1;
            }
            var text = src.slice(lastEnd, index);
            lastEnd = index + open.length + match.length;
            if (trimLeading) text = trimLeft(text);
            if (wsCollapseLeft) text = trimRight(text);
            if (wsCollapseRight) trimLeading = true;
            if (open === '{{{') {
                //liquid-style: make {{{x}}} => {{x|safe}}
                open = '{{';
                inner += '|safe';
            }
            parser.textHandler(text);
            parser.tokenHandler(open, inner);
        });
        var text = src.slice(lastEnd);
        if (trimLeading) text = trimLeft(text);
        this.textHandler(text);
    };

    Parser.prototype.textHandler = function (text) {
        this.push('write(' + JSON.stringify(text) + ');');
    };

    Parser.prototype.tokenHandler = function (open, inner) {
        var type = delimeters[open];
        if (type === 'directive') {
            this.compileTag(inner);
        } else if (type === 'output') {
            var extracted = this.extractEnt(inner, STRINGS, '@');
            //replace || operators with ~
            extracted.src = extracted.src.replace(/\|\|/g, '~').split('|');
            //put back || operators
            extracted.src = extracted.src.map(function (part) {
                return part.split('~').join('||');
            });
            var parts = this.injectEnt(extracted, '@');
            if (parts.length > 1) {
                var filters = parts.slice(1).map(this.parseFilter.bind(this));
                this.push('filter(' + this.parseExpr(parts[0]) + ',' + filters.join(',') + ');');
            } else {
                this.push('filter(' + this.parseExpr(parts[0]) + ');');
            }
        }
    };

    Parser.prototype.compileTag = function (str) {
        var directive = str.split(' ')[0];
        var handler = tagHandlers[directive];
        if (!handler) {
            throw new Error('Invalid tag: ' + str);
        }
  