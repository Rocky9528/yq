<template>
<div>
<el-form :inline="true" class="demo-form-inline">
  <el-form-item label="活动名字">
    <el-input v-model="activityData.name" placeholder="活动名字"></el-input>
  </el-form-item>
  
   <el-form-item label="活动时间">
    <el-date-picker
      v-model="activityData.starttime"
      type="date"
      placeholder="开始时间">
  </el-date-picker>

     <el-date-picker
      v-model="activityData.endtime"
      type="date"
      placeholder="结束时间">
  </el-date-picker>
   </el-form-item>


<el-button type="success" plain  @click="initActivitiesByPage">查询</el-button>
<el-button type="primary" @click="showDialog">新增</el-button>
<!-- dialogFormVisible：false隐藏-->
<el-dialog title="新增或修改活动" :visible.sync="dialogFormVisible">
<el-form-item label="活动名字">
    <el-input v-model="activityData.name" placeholder="活动名字"></el-input>
  </el-form-item>
  
      <el-form-item label="开始时间">
        <el-date-picker
          v-model="activityData.starttime"
          type="date"
          placeholder="开始时间">
      </el-date-picker>
    </el-form-item>

     <el-form-item label="结束时间">
        <el-date-picker
          v-model="activityData.endtime"
          type="date"
          placeholder="结束时间">
        </el-date-picker>
    </el-form-item>
   <el-form-item label="能否报名">
      <el-switch
        v-model="activityData.status"
        active-value="1"
        active-color="#13ce66"

        inactive-value="0"
        inactive-color="lightgray"
        >
      </el-switch>
   </el-form-item>
    
    <el-form-item label="活动详情">
         <el-input v-model="activityData.detail" placeholder="活动详情" type="textarea" :rows="3"></el-input>
     </el-form-item>
   <el-input placeholder="活动网址" v-model="activityData.url">
    <template slot="prepend">Http://</template>
  </el-input>

 <el-form-item label="活动照片">
      <el-upload
      class="upload-demo"
      drag
      action="https://jsonplaceholder.typicode.com/posts/"
       multiple
      :on-success="handleAvatarSuccess"
      :before-upload="beforeAvatarUpload">
    
      <i class="el-icon-upload"></i>
      <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
      <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过2MB</div>
      <img v-if="imageUrl" :src="imageUrl" class="avatar">
    </el-upload>
 </el-form-item>



    <!-- 学校列表-->
   <el-select v-model="activityData.school" filterable  placeholder="请选择">
    <el-option   
      v-for="item in schoolsData"
      :key="item.id"
      :label="item.name"
      :value="item.name">
    </el-option>
  </el-select>




  <div slot="footer" class="dialog-footer">
    <el-button type="primary" @click="saveAcitiviy()">保存</el-button>
    <el-button @click="dialogFormVisible = false">取 消</el-button>
 </div>
</el-dialog>
</el-form>

  <el-table     
    :data="activitiesData"
    stripe
    style="width: 100%">
    <el-table-column
      prop="id"
      label="编号"
      width="130">
    </el-table-column>
    <el-table-column
      prop="name"
      label="活动名"
      width="130">
    </el-table-column>
    <el-table-column
      prop="starttime"
      label="开始时间">
    </el-table-column>
    <el-table-column
      prop="state"
      label="状态">
    </el-table-column>

 


  </el-table>
  
  <div class="block">
    <span class="demonstration">分页</span>
    <el-pagination
      @current-change ="initActivitiesByPage"
      @size-change= "initActivitiesByPage"
      :page-sizes="[10,20,30]"
      :page-size="pagesize"
      :current-page="currentpage"

      layout="prev, pager, next"
      :total="total">




    </el-pagination>
  </div>

</div>
</template>

<script>
    import activityApi  from '@/api/activity'
    import schoolApi  from '@/api/school'

    export default{
        //获取easy mock中的模拟数据 ;变量
        data(){
            return {
              imageUrl: '' ,
              pagesize:10,
              currentpage :2 ,

             //查询easymock时 传入的参数（活动对象）
            // activityData : {}, //封装活动信息：id,name,starttime..
             //返回数据
             activitiesData: [] ,
             //返回学校数据
            schoolsData: [] ,
            //单个活动数据
            activityData : {} ,//封装活动信息：id,name,starttime..
             total: 0 ,
             dialogFormVisible:false 
           }
        }  ,  

/*
    created():初始化方法 ->  加载数据  initActivities();
     data()：为了给 <templete>里的table填充值
*/

        //初始化方法
        created(){
           //this.initActivities();
           this.initActivitiesByPage();
           this. initSchools();
        },
        methods:{
            /*不带分页
            initActivities(){
                    activityApi.getActivitis().then(response=>{
                         //将easy mock中查询的活动数据 赋值给activitiesData
                          this.activitiesData =   response.data ;

                    }

                    );
            }*/
            //带分页：查看当前页的数据
            initActivitiesByPage(){
                activityApi.initActivitiesByPage(this.currentpage,this.pagesize,this.activityData ).then(response=>{
                   this.total =  response.data.total ;//109
                   this.activitiesData = response.data.rows ;

                  
                })


            }
            ,
            initSchools(){
               schoolApi.getSchool().then(response=>{
                       this.schoolsData = response.data ;

               })


            },
            //保存活动
            saveAcitiviy(){
                activityApi.saveActivity(this.activityData).then(response=>{
                    if(response.flag){
                      // alert(response.message);

                        this.$message({
                          message: response.message,
                          type: 'success'
                        });
                       this.initActivitiesByPage();
                       this.dialogFormVisible = false ;
                     }
                })
            },
            showDialog(){
              this.activityData = {} ;
              this.dialogFormVisible = true;
             
            },


            //修改：查询->保存
            updateAcivity(id){
               //打开新增弹窗
                this.dialogFormVisible = true
                //查询
                activityApi.queryAcitivityById(id).then(response=>{
                    if(response.flag) {
                       this.activityData = response.data ;
                     }
                  
                
                })
               
            },
            //图片上传成功
            handleAvatarSuccess(res, file){
                  //1图片空间的url   保存在imageUrl
                   this.imageUrl = URL.createObjectURL(file.raw);

                  //2.将url封装到 统一的存储对象activityData中
                 activityData.imageUrl =  this.imageUrl ;
            },

            //上传之前
            beforeAvatarUpload(file){
                // 图片类型jpg ，gif  ，图片大小
                const  imgType  = file.type === 'image/jpeg' ;
               // const  imgType2 = 'image/gif';

                //1561651651   byte /1024 ->12222kb --》mb
                const imgSize =  file.size / 1024 / 1024 < 2 ;

               if (!imgType) {
                this.$message.error('上传头像图片只能是 JPG 格式!');
              }
              if (!imgSize) {
                this.$message.error('上传头像图片大小不能超过 2MB!');
              }
              return imgType && imgSize;

            }


        }

    }

    
</script>

<style scoped>

</style>

