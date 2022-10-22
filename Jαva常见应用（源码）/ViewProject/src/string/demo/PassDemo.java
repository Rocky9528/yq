package string.demo;

class Person
{
	int age ;
}


public class PassDemo {
								//num1:10		per1.age =10
	public static void aMethod(int num1,Person per1) {
		num1 = 11;
		per1.age = 11 ;
	}
	
	public static void main(String[] args) {
		int num = 10;//基本类型变量
		Person per = new Person();//引用类型变量
		per.age = 10;
		
		aMethod(num,per);
		System.out.println(num+","+per.age);
		/*
		 * 如果将a()方法中的 基本类型(8个)变量x  传入到b()方法中，并在在b()方法中修改了，则a()方法中的x 保持不变；
		 * 如果将a()方法中的 引用类型变量x  传入到b()方法中，并在在b()方法中修改了，则a()方法中的x  与b保持一致；
		 * 		int[] nums ;
		 */
		
	}
}
