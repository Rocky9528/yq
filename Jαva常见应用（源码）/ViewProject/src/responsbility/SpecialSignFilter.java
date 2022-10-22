package responsbility;

public class SpecialSignFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		String result = request.getRequestStr().replace(":)","-微笑-") ;
		request.setRequestStr(result);
		//传递给过滤器链
		chain.doFilter(request, response, chain);
		
		//过滤响应
		
	}

}
