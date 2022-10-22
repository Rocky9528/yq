package responsbility;

//过滤操作
public interface Filter {//标准：需要过滤  ，具体过滤什么东西？<   垃圾  ：)
	//具体的过滤链
	public void doFilter(Request request,Response response,FilterChain chain); //{
		//request：每次请求时的内容  。axc ->a*c
		//response:每次响应时的内容。  a*c -> a*c -csdn
		//FilterChain：过滤链，作用：将多个请求（或响应）串接起来
		//System.out.println("过滤请求：将<转移为 &lt ;....");
		//<旁边有个垃圾桶>  -->  &lt;旁边有个垃圾桶&gt; ->
		//将请求传递给下一位：执行下一个过滤链中的过滤器
	//	chain.doFilter(request, response, chain);
//		System.out.println("过滤响应： 给结果 加上-csdn");
	//}
}
