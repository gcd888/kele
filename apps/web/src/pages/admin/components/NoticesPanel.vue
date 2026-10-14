<template>
  <view class="section">
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
</template>

<script setup lang="ts">
import { computed, onMounted, reactive, ref } from 'vue';
import { request } from '../../../api/client';
import type { NoticeEntity, OnlineTvEntity } from '../../../types';

const emit = defineEmits<{ (e: 'loaded'): void }>();

const notices = ref<NoticeEntity[]>([]);
const tvList = ref<OnlineTvEntity[]>([]);
const statusOptions = ['启用', '停用'];

function toast(t: string) {
  uni.showToast({ title: t, icon: 'none', duration: 2200 });
}

async function loadNotices() {
  try {
    notices.value = (await request<NoticeEntity[]>('/admin/notices')) || [];
  } catch (e) {
    toast((e as Error)?.message || '公告加载失败');
  }
}

async function loadTv() {
  try {
    tvList.value = (await request<OnlineTvEntity[]>('/admin/online-tv')) || [];
  } catch (e) {
    toast((e as Error)?.message || '影视站加载失败');
  }
}

// ===== 公告 =====

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
    toast((e as Error)?.message || '保存失败');
  }
}

async function toggleNotice(n: NoticeEntity) {
  try {
    await request('/admin/notices/' + n.id, { method: 'PUT', data: { status: n.status === 1 ? 0 : 1 } });
    loadNotices();
  } catch (e) {
    toast((e as Error)?.message || '操作失败');
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
        toast((e as Error)?.message || '删除失败');
      }
    },
  });
}

// ===== 影视站导航 =====

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
    toast((e as Error)?.message || '保存失败');
  }
}

async function toggleTv(t: OnlineTvEntity) {
  try {
    await request('/admin/online-tv/' + t.id, { method: 'PUT', data: { status: t.status === 1 ? 0 : 1 } });
    loadTv();
  } catch (e) {
    toast((e as Error)?.message || '操作失败');
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
        toast((e as Error)?.message || '删除失败');
      }
    },
  });
}

onMounted(async () => {
  await Promise.all([loadNotices(), loadTv()]);
  emit('loaded');
});
</script>

<style scoped>
.notice-grid {
  grid-template-columns: 2.6fr 0.7fr 1.2fr 1.5fr;
}

.tv-grid {
  grid-template-columns: 1fr 2.2fr 0.5fr 0.7fr 1.5fr;
}
</style>
