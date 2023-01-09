<template>

  <div>
    <div> Bot name:{{ bot_name}} </div>
    <div> Bot rating: {{ bot_rating}} </div>

  </div>
    <router-view> </router-view>
</template>



<script>
import NavBar from './components/NavBar.vue'
import {ref} from 'vue';
import $ from 'jquery';

export default {
  name: 'App',

  setup: () => {
    let bot_name = ref("");
    let bot_rating = ref("");

    $.ajax({
      url: "http://127.0.0.1:8080/pk/getbotinfo/",
      type: "get",
      success: resp => {
        console.log(resp);
        bot_name.value = resp.name;
        bot_rating.value = resp.rating;
      }
    });

    return {
      bot_name,
      bot_rating
    } 

  }

}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
