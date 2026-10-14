<template>
  <view class="page">
    <view class="page-wrap">
      <view class="login-wrap">
        <view class="card login">
          <view class="login__logo"><view class="login__logo-dot"></view></view>
          <text class="login__title">可乐 · 管理后台</text>
          <text class="login__sub">请输入管理员密码登录</text>

          <view class="field">
            <text class="field__label">用户名</text>
            <input class="field__input" v-model="username" disabled />
          </view>
          <view class="field">
            <text class="field__label">密码</text>
            <input
              class="field__input"
              v-model="password"
              :password="true"
              placeholder="请输入密码"
              placeholder-class="field__ph"
              @confirm="doLogin"
            />
          </view>

          <view class="btn btn--primary login__btn" :class="{ 'btn--disabled': submitting }" @tap="doLogin">
            {{ submitting ? '登录中...' : '登 录' }}
          </view>

          <text class="login__back" @tap="goHome">返回首页</text>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { request, setAdminToken } from '../../api/client';

const username = ref('admin');
const password = ref('');
const submitting = ref(false);

async function doLogin() {
  if (submitting.value) return;
  const pwd = password.value.trim();
  if (!pwd) {
    uni.showToast({ title: '请输入密码', icon: 'none' });
    return;
  }
  submitting.value = true;
  try {
    const data = await request<{ token: string; username: string }>('/auth/login', {
      method: 'POST',
      data: { username: username.value, password: pwd },
    });
    if (data && data.token) {
      setAdminToken(data.token);
      uni.reLaunch({ url: '/pages/admin/index' });
    } else {
      uni.showToast({ title: '登录失败：响应缺少 token', icon: 'none' });
    }
  } catch (e) {
    uni.showToast({ title: (e as Error).message || '登录失败', icon: 'none' });
  } finally {
    submitting.value = false;
  }
}

function goHome() {
  uni.reLaunch({ url: '/pages/index/index' });
}
</script>

<style scoped>
.page {
  min-height: 100vh;
}

.login-wrap {
  display: flex;
  justify-content: center;
  padding-top: calc(12vh + var(--safe-top));
}

.login {
  width: 100%;
  max-width: 380px;
  padding: 28px 24px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.login__logo {
  width: 52px;
  height: 52px;
  border-radius: 16px;
  background: linear-gradient(135deg, var(--primary), #7c3aed);
  display: flex;
  align-items: center;
  justify-content: center;
  margin-bottom: 12px;
}

.login__logo-dot {
  width: 16px;
  height: 16px;
  border-radius: 50%;
  background: #fff;
}

.login__title {
  font-size: 18px;
  font-weight: 700;
  color: var(--text);
  margin-bottom: 4px;
}

.login__sub {
  font-size: 13px;
  color: var(--muted);
  margin-bottom: 22px;
}

.field {
  width: 100%;
  margin-bottom: 14px;
}

.field__input {
  background: var(--input-bg);
}

.login__btn {
  width: 100%;
  padding: 10px;
  margin-top: 6px;
}

.login__back {
  margin-top: 16px;
  font-size: 13px;
  color: var(--muted);
  cursor: pointer;
}
</style>
