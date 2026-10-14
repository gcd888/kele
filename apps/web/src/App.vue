<script setup lang="ts">
import { onLaunch } from "@dcloudio/uni-app";
import { applyTheme } from "./utils/theme";

onLaunch(() => {
  applyTheme();
});
</script>

<style>
@import "./styles/theme.css";
</style>
