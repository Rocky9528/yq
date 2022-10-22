package responsbility;

public class HTMLSignFilter implements Filter {

	@Override
		//过滤请求
	public void doFilter(Request request, Response response, FilterChain chain) {
		//< &lt;   >  &gt;
		String result = request.getRequestStr().replace("<","&lt;") ;
		String finalResult = result.replace(">", "&gt;") ;
		request.setRequestStr(finalResult);
		//传递给过滤器链
		chain.doFilter(request, response, chain);
		
		
	}

}
