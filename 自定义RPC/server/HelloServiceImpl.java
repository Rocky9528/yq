package remote.procedure.call.server;
//实现类
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String name) {
		return "hi,"+name ;
	}

}
