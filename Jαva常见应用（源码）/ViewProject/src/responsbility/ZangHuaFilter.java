package responsbility;

public class ZangHuaFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		String result = request.getRequestStr().replace("垃圾","**") ;
		request.setRequestStr(result);
		//传递给过滤器链
		chain.doFilter(request, response, chain);
		
		//过滤响应
		//过滤响应
	}
	
	public static void main(String[] args) {
		System.out.println("abc"=="abc");
	}

}
