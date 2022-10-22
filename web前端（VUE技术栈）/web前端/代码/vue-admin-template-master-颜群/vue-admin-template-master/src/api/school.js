import request from '@/utils/request'

//school
export default
{
   //请求easy mock，获取活动列表数据
   getSchool(){
    return request({
        url: '/yq/school',
        method: 'get'
      })
   }
}