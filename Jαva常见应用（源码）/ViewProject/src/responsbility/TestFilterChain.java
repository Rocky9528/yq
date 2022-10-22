package responsbility;

public class TestFilterChain {
	public static void main(String[] args) {
		FilterChain chain = new FilterChain() ;
		Filter filter1 = new HTMLSignFilter() ;
		Filter filter2 = new ZangHuaFilter() ;
		Filter filter3 = new SpecialSignFilter() ;
		chain.addFilter(filter1).addFilter(filter2).addFilter(filter3) ;
		
		
		Request req = new Request();
		req.setRequestStr("<我旁边有个垃圾桶:)");
		
		
		chain.doFilter(req, null, chain);
		
		
 	}
}
