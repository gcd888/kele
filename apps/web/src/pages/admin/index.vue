<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <text class="topbar__title">可乐 · 管理后台</text>
        <view class="btn btn--sm" @tap="logout">退出登录</view>
      </view>

      <!-- 移动端提示 -->
      <view class="ad-mobile-tip card">
        <text>管理后台仅支持桌面浏览器（窗口宽度 ≥ 768px）访问</text>
      </view>

      <view class="ad-desktop">
        <!-- Tabs -->
        <view class="tabs">
          <text
            v-for="t in tabs"
            :key="t.key"
            class="tabs__item"
            :class="{ 'tabs__item--active': tab === t.key }"
            @tap="switchTab(t.key)"
          >{{ t.label }}</text>
        </view>

        <!-- ===== 概览 ===== -->
        <view v-if="tab === 'stats'" class="section">
          <view class="stat-grid">
            <view class="card stat">
              <text class="stat__num">{{ stats ? stats.resources : '-' }}</text>
              <text class="stat__label">资源总数</text>
            </view>
            <view class="card stat">
              <text class="stat__num">{{ stats ? stats.sources.total : '-' }}</text>
              <text class="stat__label">源总数</text>
            </view>
            <view class="card stat">
              <text class="stat__num stat__num--ok">{{ stats ? stats.sources.active : '-' }}</text>
              <text class="stat__label">活跃源</text>
            </view>
            <view class="card stat">
              <text class="stat__num stat__num--bad">{{ stats ? stats.sources.circuitBroken : '-' }}</text>
              <text class="stat__label">熔断源</text>
            </view>
            <view class="card stat">
              <text class="stat__num stat__num--muted">{{ stats ? stats.sources.manualDisabled : '-' }}</text>
              <text class="stat__label">手动停用</text>
            </view>
          </view>
        </view>

        <!-- ===== 源管理 ===== -->
        <view v-if="tab === 'sources'" class="section">
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
              <text v-if="srcTestMsg" class="form__test-msg" :class="{ 'form__test-msg--err': srcTestFail }">{{ srcTestMsg }}</text>
            </view>
          </view>
        </view>

        <!-- ===== 健康度 ===== -->
        <view v-if="tab === 'health'" class="section">
          <view class="card table">
            <view class="table__row table__row--head health-grid">
              <text>名称</text><text>状态</text><text>连续失败</text><text>最近成功</text><text>延迟</text><text>熔断截止</text><text>操作</text>
            </view>
            <view v-if="!sources.length" class="table__empty"><text>暂无数据</text></view>
            <view v-for="s in sources" :key="s.id" class="table__row health-grid">
              <text class="cell-strong">{{ s.name }}</text>
              <text class="cell-badge" :class="healthCls(s)">{{ healthLabel(s) }}</text>
              <text :class="{ 'cell-bad': s.fail_count > 0 }">{{ s.fail_count }}</text>
              <text>{{ timeAgo(s.last_ok_at) }}</text>
              <text>{{ s.last_latency_ms != null ? s.last_latency_ms + ' ms' : '-' }}</text>
              <text>{{ s.disabled_until ? s.disabled_until.slice(5, 16) : '-' }}</text>
              <view class="cell-actions">
                <text v-if="s.enabled === 0" class="cell-link" @tap="recoverSource(s)">恢复</text>
                <text class="cell-link" @tap="testHealthRow(s)">单源测试</text>
              </view>
            </view>
          </view>
          <text v-if="healthTestMsg" class="health-msg">{{ healthTestMsg }}</text>
        </view>

        <!-- ===== 公告 / 导航 ===== -->
        <view v-if="tab === 'content'" class="section">
          <!-- 公告 -->
          <view class="content-block">
            <view class="toolbar">
              <text class="content-block__title">公告管理</text>
              <view class="btn btn--primary btn--sm" @tap="openNoticeForm()">+ 新增公告</view>
            </view>
            <view class="card table">
              <view class="table__row table__row--head notice-grid">
                <text>内容</text><text>状态</text><text>创建时间</text><text>操作</text>
              </view>
              <view v-if="!notices.length" class="table__empty"><text>暂无公告</text></view>
              <view v-for="n in notices" :key="n.id" class="table__row notice-grid">
                <text class="cell-wrap">{{ n.content }}</text>
                <text class="cell-badge" :class="n.status === 1 ? 'cell-badge--ok' : 'cell-badge--off'">
                  {{ n.status === 1 ? '启用' : '停用' }}
                </text>
                <text>{{ (n.created_at || '').slice(0, 16) }}</text>
                <view class="cell-actions">
                  <text class="cell-link" @tap="toggleNotice(n)">{{ n.status === 1 ? '停用' : '启用' }}</text>
                  <text class="cell-link" @tap="openNoticeForm(n)">编辑</text>
                  <text class="cell-link" @tap="delNotice(n)">删除</text>
                </view>
              </view>
            </view>
            <view v-if="noticeFormOpen" class="card form">
              <text class="form__title">{{ noticeForm.id ? '编辑公告 #' + noticeForm.id : '新增公告' }}</text>
              <view class="field">
                <text class="field__label">内容 *</text>
                <textarea class="field__textarea" v-model="noticeForm.content" :maxlength="200" />
              </view>
              <view class="field" style="max-width: 160px;">
                <text class="field__label">状态</text>
                <picker :range="statusOptions" :value="noticeStatusIdx" @change="onNoticeStatusChange">
                  <view class="field__input">{{ noticeForm.status === 1 ? '启用' : '停用' }}</view>
                </picker>
              </view>
              <view class="form__actions">
                <view class="btn btn--primary" @tap="saveNotice">保存</view>
                <view class="btn" @tap="noticeFormOpen = false">取消</view>
              </view>
            </view>
          </view>

          <!-- 在线影视导航 -->
          <view class="content-block">
            <view class="toolbar">
              <text class="content-block__title">影视站导航管理</text>
              <view class="btn btn--primary btn--sm" @tap="openTvForm()">+ 新增站点</view>
            </view>
            <view class="card table">
              <view class="table__row table__row--head tv-grid">
                <text>名称</text><text>地址</text><text>排序</text><text>状态</text><text>操作</text>
              </view>
              <view v-if="!tvList.length" class="table__empty"><text>暂无站点</text></view>
              <view v-for="t in tvList" :key="t.id" class="table__row tv-grid">
                <text class="cell-strong">{{ t.name }}</text>
                <text class="cell-wrap" :title="t.url">{{ t.url }}</text>
                <text>{{ t.sort }}</text>
                <text class="cell-badge" :class="t.status === 1 ? 'cell-badge--ok' : 'cell-badge--off'">
                  {{ t.status === 1 ? '启用' : '停用' }}
                </text>
                <view class="cell-actions">
                  <text class="cell-link" @tap="toggleTv(t)">{{ t.status === 1 ? '停用' : '启用' }}</text>
                  <text class="cell-link" @tap="openTvForm(t)">编辑</text>
                  <text class="cell-link" @tap="delTv(t)">删除</text>
                </view>
              </view>
            </view>
            <view v-if="tvFormOpen" class="card form">
              <text class="form__title">{{ tvForm.id ? '编辑站点 #' + tvForm.id : '新增站点' }}</text>
              <view class="form__grid">
                <view class="field">
                  <text class="field__label">名称 *</text>
                  <input class="field__input" v-model="tvForm.name" />
                </view>
                <view class="field">
                  <text class="field__label">地址 *</text>
                  <input class="field__input" v-model="tvForm.url" />
                </view>
                <view class="field">
                  <text class="field__label">描述</text>
                  <input class="field__input" v-model="tvForm.description" />
                </view>
                <view class="field">
                  <text class="field__label">排序</text>
                  <input class="field__input" v-model="tvForm.sort" type="number" />
                </view>
                <view class="field">
                  <text class="field__label">状态</text>
                  <picker :range="statusOptions" :value="tvStatusIdx" @change="onTvStatusChange">
                    <view class="field__input">{{ tvForm.status === 1 ? '启用' : '停用' }}</view>
                  </picker>
                </view>
              </view>
              <view class="form__actions">
                <view class="btn btn--primary" @tap="saveTv">保存</view>
                <view class="btn" @tap="tvFormOpen = false">取消</view>
              </view>
            </view>
          </view>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onShow } from '@dcloudio/uni-app';
import { computed, reactive, ref } from 'vue';
import {
  ApiError,
  clearAdminToken,
  getAdminToken,
  request,
} from '../../api/client';
import type { AdminStats, ApiConfigEntity, NoticeEntity, OnlineTvEntity } from '../../types';
import { timeAgo } from '../../utils/cloud';

const tabs = [
  { key: 'stats', label: '概览' },
  { key: 'sources', label: '源管理' },
  { key: 'health', label: '健康度' },
  { key: 'content', label: '公告/导航' },
];
const tab = ref('stats');

const stats = ref<AdminStats | null>(null);
const sources = ref<ApiConfigEntity[]>([]);
const notices = ref<NoticeEntity[]>([]);
const tvList = ref<OnlineTvEntity[]>([]);

const REQUEST_TYPES = ['declarative', 'generic_html', 'generic_json', 'searchApi1', 'searchApi2', 'searchApi3', 'searchApi4', 'xiaozi', 'zhuiju'];
const methodOptions = ['GET', 'POST'];
const sourceTypeOptions = ['api', 'html'];
const statusOptions = ['启用', '停用'];

function toast(t: string) {
  uni.showToast({ title: t, icon: 'none', duration: 2200 });
}

async function guardErr(e: unknown, fallback: string) {
  toast((e as Error)?.message || fallback);
}

// ===== 数据加载 =====

async function loadStats() {
  try {
    stats.value = await request<AdminStats>('/admin/stats');
  } catch (e) {
    guardErr(e, '概览加载失败');
  }
}

async function loadSources() {
  try {
    sources.value = (await request<ApiConfigEntity[]>('/admin/sources')) || [];
  } catch (e) {
    guardErr(e, '源列表加载失败');
  }
}

async function loadNotices() {
  try {
    notices.value = (await request<NoticeEntity[]>('/admin/notices')) || [];
  } catch (e) {
    guardErr(e, '公告加载失败');
  }
}

async function loadTv() {
  try {
    tvList.value = (await request<OnlineTvEntity[]>('/admin/online-tv')) || [];
  } catch (e) {
    guardErr(e, '影视站加载失败');
  }
}

function loadAll() {
  loadStats();
  loadSources();
  loadNotices();
  loadTv();
}

function switchTab(key: string) {
  tab.value = key;
}

// ===== 退出登录 =====

function logout() {
  clearAdminToken();
  uni.reLaunch({ url: '/pages/admin/login' });
}

// ===== 健康度徽标 =====

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

// ===== 源管理表单 =====

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

/** JSON 字段格式校验 */
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

type JsonField = [string, string, 'array' | 'object'];

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
    loadStats();
  } catch (e) {
    guardErr(e, '保存失败');
  }
}

/** 测试连通：预留接口，404 → 暂未开放 */
async function testCurrentSource() {
  if (!srcForm.id) {
    srcTestMsg.value = '新源请先保存后再测试';
    srcTestFail.value = true;
    return;
  }
  srcTestMsg.value = '测试中...';
  srcTestFail.value = false;
  try {
    const r = await request<Record<string, unknown>>('/admin/sources/' + srcForm.id + '/test', { method: 'POST' });
    srcTestMsg.value = '连通成功：' + JSON.stringify(r).slice(0, 120);
  } catch (e) {
    const err = e as ApiError;
    if (err.statusCode === 404) {
      srcTestMsg.value = '测试接口暂未开放（后端未实现）';
    } else {
      srcTestMsg.value = '测试失败：' + err.message;
    }
    srcTestFail.value = true;
  }
}

async function toggleSource(s: ApiConfigEntity) {
  try {
    await request('/admin/sources/' + s.id, { method: 'PUT', data: { status: s.status === 1 ? 0 : 1 } });
    loadSources();
    loadStats();
  } catch (e) {
    guardErr(e, '操作失败');
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
        loadStats();
      } catch (e) {
        guardErr(e, '删除失败');
      }
    },
  });
}

// ===== 健康度操作 =====

const healthTestMsg = ref('');

async function recoverSource(s: ApiConfigEntity) {
  try {
    await request('/admin/sources/' + s.id + '/recover', { method: 'POST' });
    toast('已恢复：' + s.name);
    loadSources();
    loadStats();
  } catch (e) {
    guardErr(e, '恢复失败');
  }
}

async function testHealthRow(s: ApiConfigEntity) {
  healthTestMsg.value = '正在测试源「' + s.name + '」...';
  try {
    const r = await request<Record<string, unknown>>('/admin/sources/' + s.id + '/test', { method: 'POST' });
    healthTestMsg.value = '「' + s.name + '」连通成功：' + JSON.stringify(r).slice(0, 120);
  } catch (e) {
    const err = e as ApiError;
    healthTestMsg.value =
      err.statusCode === 404
        ? '单源测试接口暂未开放（后端未实现）'
        : '「' + s.name + '」测试失败：' + err.message;
  }
}

// ===== 公告管理 =====

const noticeFormOpen = ref(false);
const noticeForm = reactive({ id: 0, content: '', status: 1 });
const noticeStatusIdx = computed(() => (noticeForm.status === 1 ? 0 : 1));

function onNoticeStatusChange(e: { detail: { value: string | number } }) {
  noticeForm.status = Number(e.detail.value) === 0 ? 1 : 0;
}

function openNoticeForm(n?: NoticeEntity) {
  noticeForm.id = n?.id || 0;
  noticeForm.content = n?.content || '';
  noticeForm.status = n?.status ?? 1;
  noticeFormOpen.value = true;
}

async function saveNotice() {
  if (!noticeForm.content.trim()) {
    toast('公告内容必填');
    return;
  }
  try {
    if (noticeForm.id) {
      await request('/admin/notices/' + noticeForm.id, {
        method: 'PUT',
        data: { content: noticeForm.content.trim(), status: noticeForm.status },
      });
    } else {
      await request('/admin/notices', {
        method: 'POST',
        data: { content: noticeForm.content.trim(), status: noticeForm.status },
      });
    }
    toast('保存成功');
    noticeFormOpen.value = false;
    loadNotices();
  } catch (e) {
    guardErr(e, '保存失败');
  }
}

async function toggleNotice(n: NoticeEntity) {
  try {
    await request('/admin/notices/' + n.id, { method: 'PUT', data: { status: n.status === 1 ? 0 : 1 } });
    loadNotices();
  } catch (e) {
    guardErr(e, '操作失败');
  }
}

function delNotice(n: NoticeEntity) {
  uni.showModal({
    title: '删除确认',
    content: '确定删除该公告？',
    success: async (res) => {
      if (!res.confirm) return;
      try {
        await request('/admin/notices/' + n.id, { method: 'DELETE' });
        toast('已删除');
        loadNotices();
      } catch (e) {
        guardErr(e, '删除失败');
      }
    },
  });
}

// ===== 影视站导航管理 =====

const tvFormOpen = ref(false);
const tvForm = reactive({ id: 0, name: '', url: '', description: '', sort: '0', status: 1 });
const tvStatusIdx = computed(() => (tvForm.status === 1 ? 0 : 1));

function onTvStatusChange(e: { detail: { value: string | number } }) {
  tvForm.status = Number(e.detail.value) === 0 ? 1 : 0;
}

function openTvForm(t?: OnlineTvEntity) {
  tvForm.id = t?.id || 0;
  tvForm.name = t?.name || '';
  tvForm.url = t?.url || '';
  tvForm.description = t?.description || '';
  tvForm.sort = String(t?.sort ?? 0);
  tvForm.status = t?.status ?? 1;
  tvFormOpen.value = true;
}

async function saveTv() {
  if (!tvForm.name.trim() || !tvForm.url.trim()) {
    toast('名称和地址必填');
    return;
  }
  const payload = {
    name: tvForm.name.trim(),
    url: tvForm.url.trim(),
    description: tvForm.description.trim(),
    sort: Number(tvForm.sort) || 0,
    status: tvForm.status,
  };
  try {
    if (tvForm.id) {
      await request('/admin/online-tv/' + tvForm.id, { method: 'PUT', data: payload });
    } else {
      await request('/admin/online-tv', { method: 'POST', data: payload });
    }
    toast('保存成功');
    tvFormOpen.value = false;
    loadTv();
  } catch (e) {
    guardErr(e, '保存失败');
  }
}

async function toggleTv(t: OnlineTvEntity) {
  try {
    await request('/admin/online-tv/' + t.id, { method: 'PUT', data: { status: t.status === 1 ? 0 : 1 } });
    loadTv();
  } catch (e) {
    guardErr(e, '操作失败');
  }
}

function delTv(t: OnlineTvEntity) {
  uni.showModal({
    title: '删除确认',
    content: '确定删除站点「' + t.name + '」？',
    success: async (res) => {
      if (!res.confirm) return;
      try {
        await request('/admin/online-tv/' + t.id, { method: 'DELETE' });
        toast('已删除');
        loadTv();
      } catch (e) {
        guardErr(e, '删除失败');
      }
    },
  });
}

// ===== 生命周期 =====

onShow(() => {
  if (!getAdminToken()) {
    uni.reLaunch({ url: '/pages/admin/login' });
    return;
  }
  loadAll();
});
</script>

<style scoped>
.page {
  min-height: 100vh;
}

.topbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: calc(14px + var(--safe-top)) 0 14px;
}

.topbar__title {
  font-size: 18px;
  font-weight: 700;
  color: var(--text);
}

/* 移动端提示：<768 显示 */
.ad-mobile-tip {
  display: block;
  padding: 24px;
  text-align: center;
  color: var(--muted);
  font-size: 14px;
}

/* 桌面内容：<768 隐藏 */
.ad-desktop {
  display: none;
}

@media (min-width: 768px) {
  .ad-mobile-tip {
    display: none;
  }
  .ad-desktop {
    display: block;
  }
}

.tabs {
  display: flex;
  gap: 8px;
  margin-bottom: 18px;
  border-bottom: 1px solid var(--border);
  padding-bottom: 0;
}

.tabs__item {
  font-size: 14px;
  color: var(--muted);
  padding: 8px 18px;
  cursor: pointer;
  border-bottom: 2px solid transparent;
  margin-bottom: -1px;
}

.tabs__item--active {
  color: var(--primary);
  font-weight: 600;
  border-bottom-color: var(--primary);
}

.section {
  margin-bottom: 24px;
}

/* 概览 */
.stat-grid {
  display: grid;
  grid-template-columns: repeat(5, 1fr);
  gap: 12px;
}

.stat {
  padding: 16px;
  text-align: center;
}

.stat__num {
  display: block;
  font-size: 26px;
  font-weight: 700;
  color: var(--text);
}

.stat__num--ok {
  color: var(--valid);
}

.stat__num--bad {
  color: var(--invalid);
}

.stat__num--muted {
  color: var(--muted);
}

.stat__label {
  font-size: 12px;
  color: var(--muted);
}

/* 工具栏 */
.toolbar {
  display: flex;
  align-items: center;
  gap: 12px;
  margin-bottom: 10px;
}

.toolbar__hint {
  font-size: 12px;
  color: var(--muted);
}

.content-block {
  margin-bottom: 28px;
}

.content-block__title {
  font-size: 15px;
  font-weight: 600;
  color: var(--text);
}

/* 表格 */
.table {
  overflow: hidden;
  margin-bottom: 14px;
}

.table__row {
  display: grid;
  align-items: center;
  gap: 8px;
  padding: 10px 14px;
  border-bottom: 1px solid var(--border);
  font-size: 13px;
  color: var(--text);
}

.table__row:last-child {
  border-bottom: none;
}

.table__row--head {
  font-weight: 600;
  color: var(--muted);
  background: var(--input-bg);
  font-size: 12px;
}

.table__empty {
  padding: 24px;
  text-align: center;
  color: var(--muted);
  font-size: 13px;
}

.src-grid {
  grid-template-columns: 1.6fr 1.2fr 0.6fr 0.6fr 0.8fr 1.6fr;
}

.health-grid {
  grid-template-columns: 1.2fr 0.8fr 0.8fr 1fr 0.8fr 1.1fr 1.2fr;
}

.notice-grid {
  grid-template-columns: 2.6fr 0.7fr 1.2fr 1.5fr;
}

.tv-grid {
  grid-template-columns: 1fr 2.2fr 0.5fr 0.7fr 1.5fr;
}

.cell-strong {
  font-weight: 600;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.cell-wrap {
  word-break: break-all;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.cell-badge {
  display: inline-block;
  padding: 1px 8px;
  border-radius: 999px;
  font-size: 12px;
  text-align: center;
  width: fit-content;
}

.cell-badge--ok {
  color: #16a34a;
  background: rgba(34, 197, 94, 0.14);
}

.cell-badge--bad {
  color: #dc2626;
  background: rgba(239, 68, 68, 0.14);
}

.cell-badge--off {
  color: #64748b;
  background: rgba(148, 163, 184, 0.2);
}

.cell-bad {
  color: var(--invalid);
}

.cell-actions {
  display: flex;
  gap: 12px;
}

.cell-link {
  color: var(--primary);
  cursor: pointer;
  font-size: 13px;
}

/* 表单 */
.form {
  padding: 16px;
  margin-bottom: 14px;
}

.form__title {
  display: block;
  font-size: 15px;
  font-weight: 600;
  color: var(--text);
  margin-bottom: 12px;
}

.form__grid {
  display: grid;
  grid-template-columns: 1fr 1fr;
  column-gap: 16px;
}

.form__span2 {
  grid-column: span 2;
}

.form__actions {
  display: flex;
  align-items: center;
  gap: 10px;
  margin-top: 6px;
}

.form__test-msg {
  font-size: 12px;
  color: var(--valid);
  word-break: break-all;
}

.form__test-msg--err {
  color: var(--invalid);
}

.health-msg {
  font-size: 12px;
  color: var(--muted);
  word-break: break-all;
}
</style>
