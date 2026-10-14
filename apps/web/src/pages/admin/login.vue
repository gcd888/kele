<template>
  <view class="page">
    <view class="page-wrap">
      <view class="login-wrap">
        <view class="card login">
          <view class="login__logo"><view class="login__logo-dot"></view></view>
          <text class="login__title">可乐 · 管理后台</text>
          <text class="login__sub">请输入管理员账号登录</text>

          <view class="field">
            <text class="field__label">用户名</text>
            <input class="field__input" v-model="username" placeholder="请输入用户名" placeholder-class="field__ph" />
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
          <view class="field">
            <text class="field__label">验证码</text>
            <view class="captcha-row">
              <input
                class="field__input captcha-input"
                v-model="captchaCode"
                placeholder="不区分大小写"
                placeholder-class="field__ph"
                maxlength="4"
                @confirm="doLogin"
              />
              <view
                class="captcha-img"
                :class="{ 'captcha-img--loading': captchaLoading }"
                title="点击刷新"
                @tap="loadCaptcha"
              >
                <image
                  v-if="captchaSvg"
                  class="captcha-img__pic"
                  :src="captchaDataUrl"
                  mode="aspectFit"
                />
                <text v-else class="captcha-img__txt">{{ captchaLoading ? '加载中' : '点击获取' }}</text>
              </view>
            </view>
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
import { ref, computed, onMounted } from 'vue';
import { request, setAdminToken } from '../../api/client';

const username = ref('');
const password = ref('');
const captchaCode = ref('');
const captchaToken = ref('');
const captchaSvg = ref('');
const captchaLoading = ref(false);
const submitting = ref(false);

/** SVG 字符串 → data URI（供 image 组件渲染） */
const captchaDataUrl = computed(() =>
  captchaSvg.value ? 'data:image/svg+xml;charset=utf-8,' + encodeURIComponent(captchaSvg.value) : ''
);

/** 拉取图形验证码 */
async function loadCaptcha() {
  if (captchaLoading.value) return;
  captchaLoading.value = true;
  captchaSvg.value = '';
  captchaCode.value = '';
  try {
    const data = await request<{ token: string; svg: string }>('/auth/captcha');
    captchaToken.value = data.token;
    captchaSvg.value = data.svg;
  } catch {
    uni.showToast({ title: '验证码加载失败，请点击重试', icon: 'none' });
  } finally {
    captchaLoading.value = false;
  }
}

async function doLogin() {
  if (submitting.value) return;
  const name = username.value.trim();
  const pwd = password.value;
  const cap = captchaCode.value.trim();
  if (!name) { uni.showToast({ title: '请输入用户名', icon: 'none' }); return; }
  if (!pwd) { uni.showToast({ title: '请输入密码', icon: 'none' }); return; }
  if (!cap) { uni.showToast({ title: '请输入验证码', icon: 'none' }); return; }
  if (!captchaToken.value) { uni.showToast({ title: '请先获取验证码', icon: 'none' }); return; }

  submitting.value = true;
  try {
    const data = await request<{ token: string; username: string }>('/auth/login', {
      method: 'POST',
      data: {
        username: name,
        password: pwd,
        captchaToken: captchaToken.value,
        captchaCode: cap,
      },
    });
    if (data && data.token) {
      setAdminToken(data.token);
      uni.reLaunch({ url: '/pages/admin/index' });
    } else {
      uni.showToast({ title: '登录失败：响应缺少 token', icon: 'none' });
      loadCaptcha();
    }
  } catch (e) {
    uni.showToast({ title: (e as Error).message || '登录失败', icon: 'none' });
    // 验证码一次性消费：无论何种失败都刷新，避免残留已用 token
    loadCaptcha();
    password.value = '';
  } finally {
    submitting.value = false;
  }
}

function goHome() {
  uni.reLaunch({ url: '/pages/home/index' });
}

onMounted(loadCaptcha);
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
  height: 44px;
  line-height: 44px;
  padding: 0 12px;
  font-size: 14px;
  box-sizing: border-box;
  border-radius: 10px;
}

.captcha-row {
  display: flex;
  gap: 10px;
  align-items: stretch;
}

.captcha-input {
  flex: 1;
}

.captcha-img {
  width: 150px;
  height: 44px;
  border-radius: 10px;
  background: var(--input-bg);
  border: 1px solid var(--border, rgba(148, 163, 184, 0.25));
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
  overflow: hidden;
  flex-shrink: 0;
}

.captcha-img__pic {
  width: 100%;
  height: 100%;
}

.captcha-img__txt {
  font-size: 12px;
  color: var(--muted);
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
