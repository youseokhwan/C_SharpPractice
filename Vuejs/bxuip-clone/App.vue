<template>
  <div id="app">
    <h2>Button 컴포넌트</h2>
    <h3>Action</h3>
    <gb-button label="default"></gb-button>
    <gb-button label="Button" action="button"></gb-button>
    <gb-button label="Reset" action="reset"></gb-button>
    <gb-button label="Submit" action="submit"></gb-button>

    <h3>ColorLevel</h3>
    <gb-button label="ColorLevel 1" colorLevel="colorLevel1"></gb-button>
    <gb-button label="ColorLevel 2" colorLevel="colorLevel2"></gb-button>
    <gb-button label="ColorLevel 3" colorLevel="colorLevel3"></gb-button>
    <gb-button label="ColorLevel 4" colorLevel="colorLevel4"></gb-button>
    <gb-button label="ColorLevel 5" colorLevel="colorLevel5"></gb-button>

    <h3>Fill</h3>
    <gb-button label="true" fill="true"></gb-button>
    <gb-button label="false" fill="false"></gb-button>

    <hr>

    <h2>Img 컴포넌트</h2>
    <h3>BtnText</h3>
    <gb-img src="/src/assets/logo.png" width="200px" height="200px" btnText="button text"></gb-img>
    <gb-img src="/src/assets/logo.png" width="200px" height="200px" btnText="button" caption="caption"></gb-img>

    <h3>Caption</h3>
    <gb-img src="/src/assets/g-bridge.png" width="240px" height="240px" caption="캡션입니다"></gb-img>

    <h3>Desc</h3>
    <gb-img src="/src/assets/logo.png" width="200px" height="200px" desc="이미지 설명입니다"></gb-img>

    <hr>

    <h2>Progress 컴포넌트</h2>
    <h3>Bar</h3>
    <gb-progress label="wave" value="80" max="100"></gb-progress>

    <h3>Color</h3>
    <gb-progress label="red" value="55" max="100" color="red"></gb-progress>
    <gb-progress label="blue" value="20" max="100" color="blue"></gb-progress>
    <gb-progress label="green" value="97" max="100" color="green"></gb-progress>
    <gb-progress label="#0d918c" value="40" max="100" color="#0d918c"></gb-progress>
    <gb-progress label="#148fd7" value="87" max="100" color="#148fd7"></gb-progress>
  </div>
</template>

<script>
  import GbButton from './components/GbButton'
  import GbImg from './components/GbImg'
  import GbProgress from './components/GbProgress'

  export default {
    components: {
      GbButton,
      GbImg,
      GbProgress
    }
  }
</script>

<style scoped>

</style>
 