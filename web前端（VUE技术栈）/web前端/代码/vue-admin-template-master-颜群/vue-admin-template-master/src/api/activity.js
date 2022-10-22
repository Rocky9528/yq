import request from '@/utils/request'

//activity
export default
{
   //请求easy mock，获取活动列表数据
   getActivitis(){
    return request({
        url: '/yq/activity',
        method: 'get'
      })
   },
   initActivitiesByPage(currentPage,pageSize,activityQueryData){
       //currentPage:当前第几页     pageSize：每页的数据量
    return request({
        url: `/yq/activity/queryActivitiesByPage/${currentPage}/${pageSize}`,
        method: 'post',
        data: activityQueryData  //时间、名称
      })
   },
   //保存活动
   saveActivity(activity){
      return request({
         url: '/yq/activity',
         method: 'post',
         data: activity  //时间、名称
       }) 

   },
   //api ->easy mock
   queryAcitivityById(id){
      return request({
         url: `/yq/activity/${id}`,
         method: 'get',
       }) 
   }

}

