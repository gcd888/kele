// 红果 App 端搜索金标脚本（Node）：
//   模式 A（live）  ：从 hongguo.cjs 截取签名算法块原样执行；先匿名注册全新设备
//                     （DeviceRegister 协议，蓝本 kotlin-tv/core/DeviceRegister.kt），
//                     再用新设备真实请求 /reading/bookapi/search/tab/v，验证全链路今天可用。
//   模式 B（golden）：seeded PRNG + 固定时钟（cjs 原固定设备号），产出平台无关签名金标 golden.json，
//                     供 Java 移植逐字节比对（test/TestMain.java）。
// 用法：node golden.mjs [live|golden|both]   默认 both
import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import zlib from 'node:zlib';

const CJS_PATH = 'E:/HelloWorld/project/guoju/case/hongguoTV-tsukiyo/server/vendor/hongguo.cjs';
const OUT_DIR = import.meta.dirname;
const mode = (process.argv[2] || 'both').toLowerCase();

const src = fs.readFileSync(CJS_PATH, 'utf8');
function slice(start, end) {
  const a = src.indexOf(start);
  if (a < 0) throw new Error('start marker not found: ' + start);
  const b = src.indexOf(end, a);
  if (b < 0) throw new Error('end marker not found: ' + end);
  return src.slice(a, b);
}
const partA = slice('const SITE =', '// ---------- 官网 SSR 数据');
const partB = slice('function appSearchParams', 'function videoModelUrl');

// axios 兼容壳（drpy 运行时注入物）：fetch 实现 {status, data, headers} 契约
const axios = async (url, opts = {}) => {
  const ctrl = new AbortController();
  const timer = setTimeout(() => ctrl.abort(), opts.timeout || 20000);
  try {
    const resp = await fetch(url, { headers: opts.headers || {}, method: opts.method || 'GET', body: opts.body, signal: ctrl.signal });
    const text = await resp.text();
    if (process.env.HG_DEBUG) {
      console.error('[debug] ' + (opts.method || 'GET') + ' ' + url.slice(0, 120)
        + ' -> status=' + resp.status + ' len=' + text.length
        + ' ct=' + (resp.headers.get('content-type') || '')
        + ' head=[' + text.slice(0, 200).replace(/\s+/g, ' ') + ']');
    }
    return { status: resp.status, data: text, headers: resp.headers };
  } finally {
    clearTimeout(timer);
  }
};

// 可替换设备号：cjs 的固定设备今天已失效（200+0 字节软拒），live 模式注入注册的新设备
function prepareLib(deviceId, installId) {
  let code = partA;
  if (deviceId) {
    code = code
      .replace("iid: '1905892595382586'", "iid: '" + installId + "'")
      .replace("device_id: '1905892595378490'", "device_id: '" + deviceId + "'");
    if (code.includes('1905892595382586') || code.includes('1905892595378490')) {
      throw new Error('device replace failed');
    }
  }
  return new Function('axios', 'crypto', code + '\n' + partB + `
    return { signedAppGet, appSearchPage, appSearchParams, pythonUrlEncode,
             xGorgon, helios, buildMedusa, hashF13, branchOf, sm3, md5, getIv,
             APP_SEARCH_API: APP_SEARCH_API, APP_UA: APP_UA, APP_DEVICE: APP_DEVICE, DEVICE: DEVICE };
  `)(axios, crypto);
}

const KW = '季爷今天真香了吗第九季';

// ---------------- 设备注册（DeviceRegister.kt 1:1 移植） ----------------
const REG_HOST = 'https://log5-applog-lf.fqnovel.com';
const REG_PATH = '/service/2/device_register/';
const REG_QUERY = '?tt_data=a&cronet_version=8d40f833_2026-03-03&ttnet_version=4.2.243.31-douyin&use_store_region_cookie=1';
const MAGIC = Buffer.from([0x74, 0x63, 0x05, 0x10, 0x00, 0x00]);
const KDF_SALT = Buffer.from(
  '4dd4c2e6b83162090e52b3c7a6733ba41cb2462b829ab58a196b39db57177524f49baf7f08e8d68d26a72e37c1a95a2f1f05a51892aef2949732b62a38aadd58', 'hex');

function ttEncrypt(data) {
  const rnd = crypto.randomBytes(32);
  const derived = crypto.createHash('sha512')
    .update(Buffer.concat([crypto.createHash('sha512').update(rnd).digest(), KDF_SALT])).digest();
  const body = Buffer.concat([crypto.createHash('sha512').update(data).digest(), data]);
  const padding = 16 - (body.length % 16);
  const padded = Buffer.concat([body, Buffer.alloc(padding, padding)]);
  const cipher = crypto.createCipheriv('aes-128-cbc', derived.subarray(0, 16), derived.subarray(16, 32));
  cipher.setAutoPadding(false);
  return Buffer.concat([MAGIC, rnd, cipher.update(padded), cipher.final()]);
}

function regPayload(now) {
  const uuid = () => crypto.randomUUID();
  const json = {
    magic_tag: 'ss_app_log',
    header: {
      display_name: '红果免费短剧',
      update_version_code: 73932,
      manifest_version_code: 73932,
      app_version_minor: '7.3.9.32',
      aid: 8662,
      channel: '69310258a',
      package: 'com.phoenix.read',
      app_version: '7.3.9.32',
      version_code: 73932,
      sdk_version: '3.7.0-rc.34-fanqie-xiaoshuo',
      sdk_target_version: 29,
      git_hash: '3a88f4e',
      os: 'Android',
      os_version: '12',
      os_api: 32,
      device_model: '25053RT47C',
      device_brand: 'Redmi',
      device_manufacturer: 'Redmi',
      cpu_abi: 'arm64-v8a',
      release_build: 'b5e187f',
      density_dpi: 520,
      display_density: 'mdpi',
      resolution: '1280x2772',
      language: 'zh',
      timezone: 8,
      access: 'wifi',
      not_request_sender: 0,
      carrier: 'CHINA MOBILE',
      mcc_mnc: '46000',
      rom: 'eng.root.20231116.160340',
      rom_version: 'W528JS release-keys',
      cdid: uuid(),
      sig_hash: '56a962410c494bbaf0b58dba20cae56f',
      openudid: uuid().replace(/-/g, '').slice(0, 16),
      clientudid: uuid(),
      ipv6_list: [],
      region: 'CN',
      tz_name: 'Asia/Shanghai',
      tz_offset: 28800,
      sim_region: 'cn',
      sim_serial_number: [],
      oaid_may_support: false,
      req_id: uuid(),
      device_platform: 'android',
      custom: { account_region_src: 'fallback', host_bit: 64, account_region: 'cn', dragon_device_type: 'phone' },
      pre_installed_channel: '',
      apk_first_install_time: now,
      is_system_app: 0,
      sdk_flavor: 'china',
      guest_mode: 0,
    },
    _gen_time: now,
  };
  return ttEncrypt(zlib.gzipSync(Buffer.from(JSON.stringify(json), 'utf8')));
}

async function registerDevice() {
  const now = Date.now();
  const body = regPayload(now);
  const headers = {
    'User-Agent': 'com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3)',
    'Content-Type': 'application/octet-stream;tt-data=a',
    'log-encode-type': 'gzip',
    'x-ss-dp': '8662',
    'x-ss-req-ticket': String(now),
    'x-vc-bdturing-sdk-version': '4.0.3.cn',
    'lc': '101',
    'sdk-version': '2',
    'passport-sdk-version': '5051452',
    'x-neptune': '-8|50:51:59:30:40:47:49:39',
    'x-ss-stub': crypto.createHash('md5').update(body).digest('hex').toUpperCase(),
  };
  const resp = await axios(REG_HOST + REG_PATH + REG_QUERY, { method: 'POST', body, headers });
  let json = null;
  try { json = JSON.parse(resp.data); } catch { /* ignore */ }
  if (!json) throw new Error('register: 非 JSON 响应 len=' + resp.data.length);
  const deviceId = String(json.device_id_str ?? json.device_id ?? '');
  const installId = String(json.install_id_str ?? json.install_id ?? '');
  if (!deviceId || !installId || deviceId === '0' || installId === '0') {
    throw new Error('register: 服务端拒绝 device_id=' + deviceId + ' body=' + resp.data.slice(0, 200));
  }
  console.log('[register] OK device_id=' + deviceId + ' install_id=' + installId + ' new_user=' + json.new_user);
  return { deviceId, installId };
}

// ---------------- 模式 A：live 实证（注册新设备 → 搜索） ----------------
async function live() {
  const { deviceId, installId } = await registerDevice();
  const lib = prepareLib(deviceId, installId);
  console.log('[live] GET', lib.APP_SEARCH_API);
  const t0 = Date.now();
  const data = await lib.signedAppGet(lib.appSearchParams(KW, 11, 20, {}, 1));
  const tabs = Array.isArray(data.search_tabs) ? data.search_tabs : (data.data?.search_tabs || []);
  const tab = tabs.find((t) => Number(t?.tab_type) === 11) || {};
  const names = [];
  const cells = Array.isArray(tab.data) ? tab.data : [];
  for (const cell of cells) {
    const items = [cell, ...((typeof cell?.lynx_data === 'string'
      ? (JSON.parse(cell.lynx_data)?.cell_data || []) : []))];
    for (const it of items) {
      const v = Array.isArray(it?.video_data) ? it.video_data.find((x) => x && typeof x === 'object') : it?.video_data;
      const title = it?.search_high_light?.title?.text || v?.title || it?.cell_name;
      const id = v?.series_id || it?.book_id || it?.search_result_id;
      if (id && title) names.push(String(title) + '#' + id);
    }
  }
  console.log('[live] cost=' + (Date.now() - t0) + 'ms code=' + data.code + ' tab11 items=' + names.length);
  console.log('[live] titles:', names.join(' | '));
  const hit = names.some((n) => n.includes('第九季'));
  console.log(hit ? '[live] PASS：搜到第九季' : '[live] FAIL：未搜到第九季');
  if (!hit) process.exitCode = 1;
}

// ---------------- 模式 B：golden 金标（cjs 原固定设备号，仅验证算法位级一致性） ----------------
function golden() {
  const lib = prepareLib(null, null);
  const FIXED_MS = 1792982400000; // khronos=1792982400
  const randSeq = [];
  let seed = 0x5eed1234 >>> 0;
  const prng = () => { // mulberry32：可复现，重跑脚本产出同一份金标
    seed = (seed + 0x6D2B79F5) >>> 0;
    let t = seed;
    t = Math.imul(t ^ (t >>> 15), t | 1);
    t ^= t + Math.imul(t ^ (t >>> 7), t | 61);
    return ((t ^ (t >>> 14)) >>> 0) / 4294967296;
  };
  const realRandom = Math.random;
  const realNow = Date.now;
  Math.random = () => { const v = prng(); randSeq.push(v); return v; };
  Date.now = () => FIXED_MS;
  let headers, query, url, khronos, ticket;
  try {
    khronos = Math.floor(Date.now() / 1000);
    ticket = Date.now();
    const values = { ...lib.appSearchParams(KW, 11, 20, {}, 1), ts: String(khronos), _rticket: String(ticket) };
    query = lib.pythonUrlEncode(values);
    url = `${lib.APP_SEARCH_API}?${query}`;
    const random = Math.floor(Math.random() * 65536);                       // random #1（gorgon）
    const be32b = Buffer.alloc(4); be32b.writeUInt32BE(khronos >>> 0);
    const le32b = Buffer.alloc(4); le32b.writeUInt32LE(khronos >>> 0);
    headers = {
      'User-Agent': lib.APP_UA, Accept: 'application/json; charset=utf-8,application/x-protobuf',
      'x-ss-req-ticket': String(ticket), 'x-tt-request-tag': 't=0;n=0', 'sdk-version': '2',
      'passport-sdk-version': '50561', 'x-xs-from-web': '0', 'x-khronos': String(khronos),
      'x-ladon': be32b.toString('base64'),
      'x-argus': le32b.toString('base64'),
      'x-gorgon': lib.xGorgon(query, null, khronos, random),
      'x-helios': lib.helios(khronos),                                      // random #2（helios 内部 1 次）
      'x-medusa': lib.buildMedusa(url, null, khronos),                      // random #3..#7（medusa 内部 5 次）
      'x-tt-dt': '',
    };
  } finally {
    Math.random = realRandom;
    Date.now = realNow;
  }
  const out = {
    cjs: CJS_PATH,
    keyword: KW, tabType: 11, page: 1,
    khronos, ticket, query, url, appUa: lib.APP_UA,
    appDevice: lib.APP_DEVICE, device: lib.DEVICE,
    randoms: randSeq, headers,
    sm3abc: crypto.createHash('sm3').update('abc').digest('hex'),
  };
  const outPath = path.join(OUT_DIR, 'golden.json');
  fs.writeFileSync(outPath, JSON.stringify(out, null, 2));
  console.log('[golden] khronos=' + khronos + ' randoms=' + randSeq.length);
  console.log('[golden] x-gorgon=' + headers['x-gorgon']);
  console.log('[golden] x-helios=' + headers['x-helios']);
  console.log('[golden] x-medusa=' + headers['x-medusa'].slice(0, 48) + '...(' + headers['x-medusa'].length + ' chars)');
  console.log('[golden] wrote ' + outPath);
  console.log('[golden] sm3(abc)=' + out.sm3abc);
}

if (mode === 'live' || mode === 'both') await live();
if (mode === 'golden' || mode === 'both') golden();
