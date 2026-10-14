<template>
  <view class="section">
    <view class="toolbar">
      <view class="btn btn--primary btn--sm" @tap="openSourceForm()">+ 新增源</view>
      <text class="toolbar__hint">共 {{ sources.length }} 个源</text>
    </view>

    <!-- 表格 -->
    <view class="card table">
      <view class="table__row table__row--head src-grid">
        <text>名称</text><text>解析器</text><text>优先级</text><text>类型</text><text>状态</text><text>操作</text>
      </view>
      <view v-if="!sources.length" class="table__empty">
        <text>暂无源配置</text>
      </view>
      <view v-for="s in sources" :key="s.id" class="table__row src-grid">
        <text class="cell-strong" :title="s.url">{{ s.name }}</text>
        <text>{{ s.request_type }}</text>
        <text>{{ s.priority }}</text>
        <text>{{ s.source_type === 'html' ? 'HTML' : 'API' }}</text>
        <text class="cell-badge" :class="healthCls(s)">{{ healthLabel(s) }}</text>
        <view class="cell-actions">
          <text class="cell-link" @tap="openSourceForm(s)">编辑</text>
          <text class="cell-link" @tap="toggleSource(s)">{{ s.status === 1 ? '停用' : '启用' }}</text>
          <text class="cell-link" @tap="delSource(s)">删除</text>
        </view>
      </view>
    </view>
    <text v-if="testRowMsg" class="inline-msg" :class="{ 'cell-bad': testRowFail }">{{ testRowMsg }}</text>

    <!-- 编辑表单 -->
    <view v-if="srcFormOpen" class="card form">
      <text class="form__title">{{ srcForm.id ? '编辑源 #' + srcForm.id : '新增源' }}</text>
      <view class="form__grid">
        <view class="field">
          <text class="field__label">名称 *</text>
          <input class="field__input" v-model="srcForm.name" />
          <text v-if="formErrors.name" class="field__error">{{ formErrors.name }}</text>
        </view>
        <view class="field">
          <text class="field__label">URL 模板 *（{kw}/{page} 占位）</text>
          <input class="field__input" v-model="srcForm.url" />
          <text v-if="formErrors.url" class="field__error">{{ formErrors.url }}</text>
        </view>
        <view class="field">
          <text class="field__label">请求方法</text>
          <picker :range="methodOptions" :value="methodIdx" @change="onMethodChange">
            <view class="field__input">{{ srcForm.method }}</view>
          </picker>
        </view>
        <view class="field">
          <text class="field__label">解析器</text>
          <picker :range="REQUEST_TYPES" :value="requestTypeIdx" @change="onRequestTypeChange">
            <view class="field__input">{{ srcForm.request_type }}</view>
          </picker>
        </view>
        <view class="field">
          <text class="field__label">源类型</text>
          <picker :range="sourceTypeOptions" :value="sourceTypeIdx" @change="onSourceTypeChange">
            <view class="field__input">{{ srcForm.source_type }}</view>
          </picker>
        </view>
        <view class="field">
          <text class="field__label">超时 (ms)</text>
          <input class="field__input" v-model="srcForm.timeout_ms" type="number" />
        </view>
        <view class="field">
          <text class="field__label">优先级</text>
          <input class="field__input" v-model="srcForm.priority" type="number" />
        </view>
        <view class="field">
          <text class="field__label">状态</text>
          <picker :range="statusOptions" :value="statusIdx" @change="onStatusChange">
            <view class="field__input">{{ srcForm.status === 1 ? '启用' : '停用' }}</view>
          </picker>
        </view>
        <view class="field form__span2">
          <text class="field__label">请求头 headers（JSON，可空）</text>
          <textarea class="field__textarea" v-model="srcForm.headers" />
          <text v-if="formErrors.headers" class="field__error">{{ formErrors.headers }}</text>
        </view>
        <view class="field form__span2">
          <text class="field__label">请求体模板 body_template（JSON，可空）</text>
          <textarea class="field__textarea" v-model="srcForm.body_template" />
          <text v-if="formErrors.body_template" class="field__error">{{ formErrors.body_template }}</text>
        </view>
        <view class="field form__span2">
          <text class="field__label">结果数组路径 result_paths（JSON 数组，可空）</text>
          <textarea class="field__textarea" v-model="srcForm.result_paths" />
          <text v-if="formErrors.result_paths" class="field__error">{{ formErrors.result_paths }}</text>
        </view>
        <view class="field form__span2">
          <text class="field__label">字段映射 field_map（JSON 对象，可空）</text>
          <textarea class="field__textarea" v-model="srcForm.field_map" />
          <text v-if="formErrors.field_map" class="field__error">{{ formErrors.field_map }}</text>
        </view>
      </view>
      <view class="form__actions">
        <view class="btn btn--primary" @tap="saveSource">保存</view>
        <view class="btn" @tap="testCurrentSource">测试连通</view>
        <view class="btn" @tap="srcFormOpen = false">取消</view>
        <text v-if="srcTestMsg" class="form__test-msg" :class="srcTestFail ? 'form__test-msg--err' : ''">{{ srcTestMsg }}</text>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { computed, onMounted, reactive, ref } from 'vue';
import { ApiError, request } from '../../../api/client';
import type { ApiConfigEntity, SourceTestResult } from '../../../types';

const emit = defineEmits<{ (e: 'loaded'): void; (e: 'changed'): void }>();

const sources = ref<ApiConfigEntity[]>([]);

const REQUEST_TYPES = ['declarative', 'generic_html', 'generic_json', 'searchApi1', 'searchApi2', 'searchApi3', 'searchApi4', 'xiaozi', 'zhuiju', 'woog', 'kkv'];
const methodOptions = ['GET', 'POST'];
const sourceTypeOptions = ['api', 'html'];
const statusOptions = ['启用', '停用'];

function toast(t: string) {
  uni.showToast({ title: t, icon: 'none', duration: 2200 });
}

async function loadSources() {
  try {
    sources.value = (await request<ApiConfigEntity[]>('/admin/sources')) || [];
  } catch (e) {
    toast((e as Error)?.message || '源列表加载失败');
  } finally {
    emit('loaded');
  }
}

function healthLabel(s: ApiConfigEntity): string {
  if (s.status === 0) return '停用';
  if (s.enabled === 0) return '熔断';
  return '正常';
}

function healthCls(s: ApiConfigEntity): string {
  if (s.status === 0) return 'cell-badge--off';
  if (s.enabled === 0) return 'cell-badge--bad';
  return 'cell-badge--ok';
}

// ===== 表单 =====

const srcFormOpen = ref(false);
const srcTestMsg = ref('');
const srcTestFail = ref(false);
const formErrors = reactive<Record<string, string>>({});
const srcForm = reactive({
  id: 0,
  name: '',
  url: '',
  method: 'GET',
  request_type: 'declarative',
  headers: '',
  body_template: '',
  result_paths: '',
  field_map: '',
  source_type: 'api',
  timeout_ms: '15000',
  priority: '100',
  status: 1,
});

const methodIdx = computed(() => Math.max(0, methodOptions.indexOf(srcForm.method)));
const requestTypeIdx = computed(() => Math.max(0, REQUEST_TYPES.indexOf(srcForm.request_type)));
const sourceTypeIdx = computed(() => Math.max(0, sourceTypeOptions.indexOf(srcForm.source_type)));
const statusIdx = computed(() => (srcForm.status === 1 ? 0 : 1));

function onMethodChange(e: { detail: { value: string | number } }) {
  srcForm.method = methodOptions[Number(e.detail.value)] || 'GET';
}
function onRequestTypeChange(e: { detail: { value: string | number } }) {
  srcForm.request_type = REQUEST_TYPES[Number(e.detail.value)] || 'declarative';
}
function onSourceTypeChange(e: { detail: { value: string | number } }) {
  srcForm.source_type = sourceTypeOptions[Number(e.detail.value)] || 'api';
}
function onStatusChange(e: { detail: { value: string | number } }) {
  srcForm.status = Number(e.detail.value) === 0 ? 1 : 0;
}

function openSourceForm(s?: ApiConfigEntity) {
  srcTestMsg.value = '';
  Object.keys(formErrors).forEach((k) => delete formErrors[k]);
  if (s) {
    Object.assign(srcForm, {
      id: s.id,
      name: s.name,
      url: s.url,
      method: s.method,
      request_type: s.request_type || 'declarative',
      headers: s.headers || '',
      body_template: s.body_template || '',
      result_paths: s.result_paths || '',
      field_map: s.field_map || '',
      source_type: s.source_type || 'api',
      timeout_ms: String(s.timeout_ms ?? 15000),
      priority: String(s.priority ?? 100),
      status: s.status ?? 1,
    });
  } else {
    Object.assign(srcForm, {
      id: 0, name: '', url: '', method: 'GET', request_type: 'declarative',
      headers: '', body_template: '', result_paths: '', field_map: '',
      source_type: 'api', timeout_ms: '15000', priority: '100', status: 1,
    });
  }
  srcFormOpen.value = true;
}

type JsonField = [string, string, 'array' | 'object'];

function validateSourceForm(): boolean {
  Object.keys(formErrors).forEach((k) => delete formErrors[k]);
  if (!srcForm.name.trim()) formErrors.name = '名称必填';
  if (!srcForm.url.trim()) formErrors.url = 'URL 必填';
  const jsonFields: JsonField[] = [
    ['headers', srcForm.headers, 'object'],
    ['body_template', srcForm.body_template, 'object'],
    ['result_paths', srcForm.result_paths, 'array'],
    ['field_map', srcForm.field_map, 'object'],
  ];
  for (const [key, raw, kind] of jsonFields) {
    const text = (raw || '').trim();
    if (!text) continue;
    try {
      const parsed = JSON.parse(text);
      if (kind === 'array' && !Array.isArray(parsed)) {
        formErrors[key] = '需为 JSON 数组';
      } else if (kind === 'object' && (typeof parsed !== 'object' || parsed === null || Array.isArray(parsed))) {
        formErrors[key] = '需为 JSON 对象';
      }
    } catch (err) {
      formErrors[key] = 'JSON 格式错误：' + ((err as Error).message || '解析失败');
    }
  }
  return Object.keys(formErrors).length === 0;
}

async function saveSource() {
  if (!validateSourceForm()) {
    toast('表单校验未通过，请检查标红字段');
    return;
  }
  const payload = {
    name: srcForm.name.trim(),
    url: srcForm.url.trim(),
    method: srcForm.method,
    request_type: srcForm.request_type,
    headers: srcForm.headers.trim(),
    body_template: srcForm.body_template.trim(),
    result_paths: srcForm.result_paths.trim(),
    field_map: srcForm.field_map.trim(),
    source_type: srcForm.source_type,
    timeout_ms: Number(srcForm.timeout_ms) || 15000,
    priority: Number(srcForm.priority) || 100,
    status: srcForm.status,
  };
  try {
    if (srcForm.id) {
      await request('/admin/sources/' + srcForm.id, { method: 'PUT', data: payload });
    } else {
      await request('/admin/sources', { method: 'POST', data: payload });
    }
    toast('保存成功');
    srcFormOpen.value = false;
    loadSources();
    emit('changed');
  } catch (e) {
    toast((e as Error)?.message || '保存失败');
  }
}

/** 测试连通：真实调用源并展示条数/延迟/样例 */
async function testCurrentSource() {
  if (!srcForm.id) {
    srcTestMsg.value = '新源请先保存后再测试';
    srcTestFail.value = true;
    return;
  }
  srcTestMsg.value = '测试中...';
  srcTestFail.value = false;
  try {
    const r = await request<SourceTestResult>('/admin/sources/' + srcForm.id + '/test', {
      method: 'POST',
      data: { kw: '庆余年' },
    });
    if (r.ok) {
      const sample = r.sample?.length ? '，样例：' + r.sample[0] : '';
      srcTestMsg.value = `连通成功：${r.count} 条结果，耗时 ${r.latencyMs}ms${sample}`;
    } else {
      srcTestMsg.value = `源可达但异常：${r.error || '未知错误'}（${r.latencyMs}ms）`;
      srcTestFail.value = true;
    }
  } catch (e) {
    const err = e as ApiError;
    srcTestMsg.value = '测试失败：' + err.message;
    srcTestFail.value = true;
  }
}

async function toggleSource(s: ApiConfigEntity) {
  try {
    await request('/admin/sources/' + s.id, { method: 'PUT', data: { status: s.status === 1 ? 0 : 1 } });
    loadSources();
    emit('changed');
  } catch (e) {
    toast((e as Error)?.message || '操作失败');
  }
}

function delSource(s: ApiConfigEntity) {
  uni.showModal({
    title: '删除确认',
    content: '确定删除源「' + s.name + '」？',
    success: async (res) => {
      if (!res.confirm) return;
      try {
        await request('/admin/sources/' + s.id, { method: 'DELETE' });
        toast('已删除');
        loadSources();
        emit('changed');
      } catch (e) {
        toast((e as Error)?.message || '删除失败');
      }
    },
  });
}

// 行内测试提示（表格区）
const testRowMsg = ref('');
const testRowFail = ref(false);

onMounted(loadSources);

defineExpose({ reload: loadSources });
</script>

<style scoped>
.src-grid {
  grid-template-columns: 1.6fr 1.2fr 0.6fr 0.6fr 0.8fr 1.6fr;
}
</style>
