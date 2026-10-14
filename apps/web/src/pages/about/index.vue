<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <view class="back" @tap="goBack"><view class="back__arrow"></view></view>
        <text class="topbar__title">免责声明</text>
        <view class="topbar__placeholder"></view>
      </view>

      <view class="card about">
        <text class="about__h1">免责声明</text>
        <text class="about__p">
          「可乐」是一个网盘资源聚合搜索工具。本站所有搜索结果均来自第三方公开渠道（公开分享链接、公开接口等），
          本站不存储、不上传、不传播任何资源文件，亦不对第三方内容的真实性、合法性与可用性作任何担保。
        </text>
        <text class="about__p">
          本站结果仅供个人学习、研究与交流使用，请于下载后 24 小时内自行删除，切勿用于任何商业或非法用途。
          相关资源的版权归原作者（及出版方）所有。因使用本站内容而产生的任何法律后果，由使用者自行承担。
        </text>
        <text class="about__p">
          若您是权利人，认为本站索引的内容侵犯了您的合法权益，请通过下方邮箱联系我们，
          提供权属证明与具体链接，我们将在核实后第一时间断开相关索引。
        </text>
        <view class="about__contact">
          <text class="about__label">侵权反馈邮箱</text>
          <text class="about__mail">report@example.com</text>
        </view>
      </view>

      <view class="about__foot">
        <text class="about__foot-text">继续使用即表示您已阅读并同意以上声明</text>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
function goBack() {
  const pages = getCurrentPages();
  if (pages.length > 1) uni.navigateBack();
  else uni.reLaunch({ url: '/pages/index/index' });
}
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

.back {
  width: 34px;
  height: 34px;
  border-radius: 10px;
  border: 1px solid var(--border);
  background: var(--card);
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}

.back__arrow {
  width: 9px;
  height: 9px;
  border-left: 2px solid var(--text);
  border-bottom: 2px solid var(--text);
  transform: rotate(45deg);
  margin-left: 3px;
}

.topbar__title {
  font-size: 16px;
  font-weight: 600;
  color: var(--text);
}

.topbar__placeholder {
  width: 34px;
}

.about {
  padding: 20px;
  margin-bottom: 16px;
}

.about__h1 {
  display: block;
  font-size: 18px;
  font-weight: 700;
  color: var(--text);
  margin-bottom: 14px;
}

.about__p {
  display: block;
  font-size: 14px;
  line-height: 1.8;
  color: var(--text);
  margin-bottom: 12px;
}

.about__contact {
  margin-top: 16px;
  padding: 12px 14px;
  border-radius: 10px;
  background: var(--primary-weak);
  display: flex;
  flex-direction: column;
  gap: 4px;
}

.about__label {
  font-size: 12px;
  color: var(--muted);
}

.about__mail {
  font-size: 15px;
  font-weight: 600;
  color: var(--primary);
}

.about__foot {
  display: flex;
  justify-content: center;
}

.about__foot-text {
  font-size: 12px;
  color: var(--muted);
}
</style>
