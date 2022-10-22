package string.demo;

public class StringDemo02 {
	public static void main(String[] args) {
		String str = "A" ;
		StringBuffer sbB = new StringBuffer("B");
		StringBuffer sbC = new StringBuffer("C");
		change(str,sbB,sbC);
		System.out.println(str+","+sbB+","+sbC);
	}
	
	//String:final类型的，当传入chang()方法时，main中的 str和change()中的str1是指向同一个"A"
	//但是，当str1的值发生改变时，因为str1是final类型的，因此str1是脱离原先的“A”，而只想新的值"A1"
	
	/*
	 * sbB是StringBuffer :是普通的引用类型，  如果有2个引用（sbB,sbB1），则改2个引用 始终指向同一个值"B"，任何一个引用对"B"进行修改，都会应用 其他引用所指向的值。
	 * 
	 * 
	 * sbC虽然也是StringBuffer，但是因为 new StringBuffer("c1");,因此又产生了一个新的引用（与原来的引用已经断开了）
	 */
	static void change(String str1,StringBuffer sbB1,StringBuffer sbC1) {
		str1 = str1+"1" ;
		sbB1.append("1") ;
		sbC1 = new StringBuffer("c1");
	}
}
