<template>
  <div>
    <h2>App中的内容{{ HomeName.value }}</h2>
  </div>
</template>

<script>
export default {
  inject: ['HomeName'],
};
</script>

<style lang="scss" scoped></style>
