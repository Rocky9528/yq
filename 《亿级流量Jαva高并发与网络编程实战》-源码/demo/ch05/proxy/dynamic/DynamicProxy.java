package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class DynamicProxy  implements InvocationHandler{
	private  Object obj ;//���Դ������� ���͵Ľ�ɫ
	public DynamicProxy(Object obj ) {
		this.obj = obj ;
	}

	public void before() {
		System.out.println("before rent()...");
	}
	/*
	 * proxy:����Ľ�ɫ
	 * method:������ķ��� rent()
	 * args�������Ĳ���
	 * return����ֵ������������ķ���rent()�ķ���ֵ
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();
//        System.out.println(proxy); //��ѭ��,���proxy���Զ�����invoke()����
		//��̬���� Ҫ��ִ��rent()��������� ��ʵ��ɫ��rent();
                            //person.sleep(time);
                            //sleep.invoke(person,time);
		boolean result = (boolean)(method.invoke(obj, args)) ;//ͨ���������rent()����
		//����.����(xx);
		this.after();
		return result;
	}

	public void after() {
	    System.out.println("after...");
	}
	
	
}
