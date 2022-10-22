import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test12 {
	public static void main(String[] args) throws ClassNotFoundException {
		//字符串->Person的一切（属性、方法）
		String perStr = "Person" ;
		//根据字符串拿到一切
		Class<?> per = Class.forName(perStr) ;
		
//		Method[] methods = per.getMethods() ;
		Method[] methods = per.getDeclaredMethods() ;
		
		for(Method method:methods) {
			System.out.println(method.getName());
		}
		
//		Field[] fields = per.getFields() ;
		Field[] fields = per.getDeclaredFields() ;//获取一切，包含private
		for(Field field :fields) {
			System.out.println(field.getName()+"--");
			
		}
	}
}
