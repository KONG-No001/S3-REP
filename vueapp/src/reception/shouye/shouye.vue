<template>
    <div>
      <!--    顶部菜单栏    -->
      <el-header class="el-header">
        <el-menu default-active="1"
                 background-color="#545c64"
                 text-color="#fff"
                 active-text-color="#ffd04b" class="el-menu-demo" mode="horizontal">
          <el-menu-item index="1">
            <template slot="title">
              <router-link to="/shouye"> 首页</router-link>
            </template>
          </el-menu-item>
          <el-menu-item index="2">
            <router-link to="/spfl">商品分类</router-link>
          </el-menu-item>
          <el-menu-item index="4" route="true">
            <router-link to="/gwc"> 购物车</router-link>
          </el-menu-item>
          <el-menu-item index="3">
            <router-link to="/mygrzx"> 我的</router-link>
          </el-menu-item>
          <el-menu-item style="margin-left: 900px;" index="5" route="true" v-if="uid==null" >
            <router-link to="/login"> 登录</router-link>
          </el-menu-item>
          <el-menu-item  style="margin-left: 900px;" index="6" route="true" v-else>
            <strong style="color: orange;">{{name}}</strong>登录了
          </el-menu-item>
        </el-menu>
      </el-header>

<!--        轮播图-->
        <div class="block">
            <el-carousel trigger="click" height="500px" style="width: 1476px;margin-left: 20px">
                <el-carousel-item >
                  <a href="#" @click="gm(tableData[18].id)">
                  <img style="width: 100%;height: 100%" src="@/assets/01.jpg">
                  </a>
                </el-carousel-item>
              <el-carousel-item >
                <a href="#" @click="gm(tableData[21].id)">
                <img style="width: 100%;height: 100%" src="@/assets/02.jpg">
                </a>
              </el-carousel-item>
              <el-carousel-item >
                <a href="#" @click="gm(tableData[19].id)">
                <img style="width: 100%;height: 100%" src="@/assets/03.jpg">
                </a>
              </el-carousel-item>
              <el-carousel-item >
                <a href="#" @click="gm(tableData[20].id)">
                <img style="width: 100%;height: 100%" src="@/assets/04.jpg">
                </a>
              </el-carousel-item>
            </el-carousel>
        </div>

<!--        热门商品区-->
        <div style="width: 1476px;height: 650px;margin-left: 20px;">
        <div>
            <el-row style="margin-top: -30px">
                <el-col :span="6" :offset="10">
                    <span style="color: red"  id="hotname"><strong>热门商品</strong></span>
                </el-col>
            </el-row>
        </div>
        <div style="margin-top: -50px">
            <el-row >
                <el-col>
                    <template>
                        <div id="hotshop1" class="remen">
                        <a href="#" @click="gm(tableData[1].id)">
                        <img  class="hotshop" :src="tableData[1].goodsVo.goodsImg" />
                            <span style="font-size: 15px;margin-left: 30px">{{tableData[1].goodsVo.goodsName}}</span><br>
                            <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[1].goodsOutPrice}}</span>
                        </a>
                        </div>
                    </template>
                </el-col>
                <el-col>
                    <template>
                        <div id="hotshop2" class="remen">
                            <a href="#" @click="gm(tableData[2].id)">
                                <img  class="hotshop" :src="tableData[2].goodsVo.goodsImg" />
                                <span style="font-size: 15px;margin-left: 30px">{{tableData[2].goodsVo.goodsName}}</span><br>
                                <span class="price" style="font-size: 20px;margin-left: 160px;">￥{{tableData[2].goodsOutPrice}}</span>
                            </a>
                        </div>
                    </template>
                </el-col>
                <el-col>
                    <template>
                        <div id="hotshop3" class="remen">
                            <a href="#" @click="gm(tableData[3].id)">
                                <img  class="hotshop" :src="tableData[3].goodsVo.goodsImg" />
                                <span style="font-size: 15px;margin-left: 30px">{{tableData[3].goodsVo.goodsName}}</span><br>
                                <span class="price" style="font-size: 20px;margin-left: 160px;">￥{{tableData[3].goodsOutPrice}}</span>
                            </a>
                        </div>
                    </template>
                </el-col>
                <el-col>
                    <template>
                        <div id="hotshop4" class="remen">
                            <a href="#" @click="gm(tableData[4].id)">
                                <img  class="hotshop" :src="tableData[4].goodsVo.goodsImg" />
                                <span style="font-size: 15px;margin-left: 30px;">{{tableData[4].goodsVo.goodsName}}</span><br>
                                <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[4].goodsOutPrice}}</span>
                            </a>
                        </div>
                    </template>
                </el-col>
              <el-col>
                <template>
                  <div id="hotshop9" class="remen">
                    <a href="#" @click="gm(tableData[11].id)">
                      <img  class="hotshop" :src="tableData[11].goodsVo.goodsImg" />
                      <span style="font-size: 15px;margin-left: 30px;">{{tableData[11].goodsVo.goodsName}}</span><br>
                      <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[11].goodsOutPrice}}</span>
                    </a>
                  </div>
                </template>
              </el-col>
                <el-col>
                    <template>
                        <div id="hotshop5" class="remen">
                            <a href="#" @click="gm(tableData[5].id)">
                                <img  class="hotshop" :src="tableData[5].goodsVo.goodsImg" />
                                <span style="font-size: 15px;margin-left: 30px">{{tableData[5].goodsVo.goodsName}}</span><br>
                                <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[5].goodsOutPrice}}</span>
                            </a>
                        </div>
                    </template>
                </el-col>
                <el-col>
                    <template>
                        <div id="hotshop6" class="remen">
                            <a href="#" @click="gm(tableData[6].id)">
                                <img  class="hotshop" :src="tableData[6].goodsVo.goodsImg" />
                                <span style="font-size: 15px;margin-left: 30px;">{{tableData[6].goodsVo.goodsName}}</span><br>
                                <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[6].goodsOutPrice}}</span>
                            </a>
                        </div>
                    </template>
                </el-col>
                <el-col>
                    <template>
                        <div id="hotshop7" class="remen">
                            <a href="#" @click="gm(tableData[7].id)">
                                <img  class="hotshop" :src="tableData[7].goodsVo.goodsImg" />
                                <span style="font-size: 15px;margin-left: 30px;">{{tableData[7].goodsVo.goodsName}}</span><br>
                                <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[7].goodsOutPrice}}</span>
                            </a>
                        </div>
                    </template>
                </el-col>
                <el-col>
                    <template>
                        <div id="hotshop8" class="remen">
                            <a href="#" @click="gm(tableData[8].id)">
                                <img  class="hotshop" :src="tableData[8].goodsVo.goodsImg" />
                                <span style="font-size: 15px;margin-left: 30px">{{tableData[8].goodsVo.goodsName}}</span><br>
                                <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[8].goodsOutPrice}}</span>
                            </a>
                   </div>
                    </template>
                </el-col>
              <el-col>
                <template>
                  <div id="hotshop10" class="remen">
                    <a href="#" @click="gm(tableData[0].id)">
                      <img  class="hotshop" :src="tableData[0].goodsVo.goodsImg" />
                      <span style="font-size: 15px;margin-left: 30px">{{tableData[0].goodsVo.goodsName}}</span><br>
                      <span class="price" style="font-size: 20px;margin-left: 160px;margin-top:30px">￥{{tableData[0].goodsOutPrice}}</span>
                    </a>
                  </div>
                </template>
              </el-col>
            </el-row>
        </div>
    </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                tableData:[],
                flid:'1',
                imgs:[
                    {url:require('@/assets/01.jpg')},
                    {url:require('@/assets/02.jpg')},
                    {url:require('@/assets/03.jpg')},
                    {url:require('@/assets/04.jpg')}
                ],
              uid:'',
              name:''
            }
        },

        methods: {
          /*获取数据*/
          getDate: function () {
            var _this = this;
            //商品查询
            this.$axios.post("/application/warehouse/queryAll.action ")
                .then(function (result) {  //成功  执行then里面的方法
                  _this.tableData = result.data;
                }).catch(function (e) { //失败 执行catch方法
              alert(e);
            });
          },
          gm(id){
            this.$router.push(
                {
                  name:"spxq",
                  params:{id:id}
                }
            );
          }


        },
        created() {
            this.getDate();
            this.uid=sessionStorage.getItem('uid');
            this.name=sessionStorage.getItem('name');
        }
    }
</script>
<style>
.price{
  color: red;
}
.hotshop:hover{
  filter:alpha(Opacity=80);
  -moz-opacity:0.8;opacity: 0.8;
}
.remen{
  width: 250px;
  height: 245px;
  border: 1px solid #A9A9A9;
}
#hotname{
  position: absolute;
  left: 645px;
  top: 54px;
  font-size: 30px;
}
.hotshop{
  width: 250px;
  height: 180px;
}
#hotshop1{
  position: absolute;
  top: 159px;
}
#hotshop2{
  position: absolute;
  left: 306px;
  top: 159px;
}
#hotshop3{
  position: absolute;
  left: 612px;
  top: 159px;
}
#hotshop4{
  position: absolute;
  left: 918px;
  top: 159px;
}
#hotshop9{
  position: absolute;
  top: 159px;
  left: 1224px;
}
#hotshop5{
  position: absolute;
  top: 424px;
}
#hotshop6{
  position: absolute;
  top: 424px;
  left: 306px;
}
#hotshop7{
  position: absolute;
  top: 424px;
  left: 612px;
}
#hotshop8{
  position: absolute;
  top: 424px;
  left: 918px;
}
#hotshop10{
  position: absolute;
  top: 424px;
  left: 1224px;
}
a{
  text-decoration: none;
}
</style>

