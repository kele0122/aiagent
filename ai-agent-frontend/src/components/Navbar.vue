<template>
  <nav class="navbar">
    <div class="navbar__content">
      <div class="navbar__logo">
        <!-- 可替换为LOGO图片 -->
        <span class="logo-text">沐舟AI</span>
      </div>
      <ul class="navbar__menu">
        <li><router-link to="/">首页</router-link></li>
        <li><router-link to="/love-master">恋爱大师</router-link></li>
        <li><router-link to="/super-agent">超级智能体</router-link></li>
        <li><a href="#contact">联系我们</a></li>
      </ul>
      <div class="navbar__actions">
        <button class="btn-primary">马上体验</button>
      </div>
    </div>
  </nav>
</template>

<script setup>
</script>

<style scoped>
.navbar {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  background: #fff;
  border-bottom: 1px solid #f1f1f1;
  z-index: 99;
  box-shadow: 0 1px 6px 0 rgba(0,0,0,0.04);
}
.navbar__content {
  max-width: 1200px;
  margin: 0 auto;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0 40px;
  height: 64px;
}
.navbar__logo .logo-text {
  color: #FF6A00;
  font-weight: bold;
  font-size: 1.5rem;
  letter-spacing: 2px;
}
.navbar__menu {
  list-style: none;
  display: flex;
  gap: 32px;
}
.navbar__menu li a, .navbar__menu li .router-link-exact-active {
  color: #213547;
  text-decoration: none;
  font-size: 1rem;
  font-weight: 500;
  transition: color 0.2s;
}
.navbar__menu li a:hover, .navbar__menu li .router-link-active {
  color: #FF6A00;
}
.navbar__actions .btn-primary {
  background: #FF6A00;
  color: #fff;
  border: none;
  border-radius: 22px;
  padding: 8px 28px;
  font-size: 1rem;
  font-weight: bold;
  letter-spacing: 1px;
  box-shadow: 0 2px 8px 0 rgba(255,106,0,0.07);
  transition: background 0.2s, box-shadow 0.2s;
}
.navbar__actions .btn-primary:hover {
  background: #F15900;
  box-shadow: 0 4px 16px 0 rgba(255,106,0,0.13);
}

@media (max-width: 768px) {
  .navbar__content {
    padding: 0 16px;
    height: 54px;
  }
  .navbar__menu {
    gap: 18px;
  }
}
</style>
