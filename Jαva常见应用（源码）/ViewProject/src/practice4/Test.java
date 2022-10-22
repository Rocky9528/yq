package practice4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//调试：1打断点   2.F6一步一步执行   （放行F8）
public class Test {
	public static void main(String[] args) {
		try {
			Class<?> perClaz = Class.forName("practice4.Person") ;
			Method method =  perClaz.getDeclaredMethod("setName", String.class) ;
			
			Object per = perClaz.newInstance()  ;
			method.invoke(  per , "zs") ;
			
			Field ageField = perClaz.getDeclaredField("age") ;
			ageField.setAccessible(true);
			ageField.set(per, 33);
			
						//			(new Person).getName();
//			System.out.println(  ((Person)perClaz.newInstance()).getAge()   );
//			System.out.println(  ((Person)perClaz.newInstance()).getName()   );
			System.out.println(((Person)per ).getAge() );
			System.out.println(((Person)per ).getName() );
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
