package responsbility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	//过滤链所 串接的所有Filter
	List<Filter> filters = new ArrayList<>() ; //只有3个过滤器
	//Filter[] filters = new Filter[100];
	int index = 0 ;//当前过滤器的索引
	//给过滤器链filters中增加一个filter过滤器 {x,y,z}
	public   FilterChain  addFilter(Filter filter) {
		filters.add(filter ) ;
		return this ;//this.name = name ; 
		//杯子->加  ->加了水的杯子(this)
		/*
		 *public class A{
			  public A add()  
			   {
			   		return this ;//当前对象 reutrn  A对象 ;
			   }
		 
		 * }
		 */
	}
	
	//执行每一个过滤器：每执行一次doFilter（） 即执行一次过滤操作
	public void doFilter(Request request,Response response,FilterChain chain) {//反射
		//当index指向最后一个过滤器（实际是最后一个+1） ，则说明全部过滤器已经执行完毕。
		if(index == filters.size()) {//已经执行了3个过滤器，则终止 a->b。 b->a
			return ;//通知方法的调用
		}
		
		//获取当前的过滤器
		Filter filter = filters.get(index++) ;//2
//		index++;
		
		System.out.println("过滤结果："+request.getRequestStr());//测试
		
		//过滤1的过滤操作
		filter.doFilter(request, response, chain);
		//当前过滤器执行完毕后，如何传递给下一个过滤器？
		//递归  a->b   b->a
		
		System.out.println("过滤结果222："+request.getRequestStr());//测试
	}
	
	/*public void a()
	{
		a();
		if(){return ...}
	}
	*/
	
	
}
