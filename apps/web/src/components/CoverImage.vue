<template>
  <view class="cover">
    <image
      v-if="!failed && proxySrc"
      class="cover__img"
      :src="proxySrc"
      mode="aspectFill"
      lazy-load
      @error="failed = true"
    />
    <view v-else class="cover__ph">
      <text class="cover__ph-text">{{ placeholder }}</text>
    </view>
  </view>
</template>

<script setup lang="ts">
import { computed, ref, watch } from 'vue';
import { imgProxy } from '../utils/cloud';

const props = defineProps<{
  /** 原始图片地址（内部自动走 /api/img-proxy） */
  src?: string;
  /** 无图时的占位字符（取名称首字） */
  name?: string;
}>();

const failed = ref(false);
watch(
  () => props.src,
  () => {
    failed.value = false;
  }
);

const proxySrc = computed(() => imgProxy(props.src));
const placeholder = computed(() => (props.name || '资源').trim().charAt(0) || '影');
</script>

<style scoped>
.cover {
  position: relative;
  width: 100%;
  height: 100%;
  background: var(--input-bg);
  overflow: hidden;
}

.cover__img {
  width: 100%;
  height: 100%;
  display: block;
}

.cover__ph {
  width: 100%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  background: linear-gradient(135deg, rgba(37, 99, 235, 0.18), rgba(139, 92, 246, 0.18));
}

.cover__ph-text {
  font-size: 26px;
  font-weight: 600;
  color: var(--primary);
}
</style>
