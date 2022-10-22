package arry.list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
        System.out.println("12345678");
        System.out.println(" a\tb");//\t补满4个空格
        System.out.println("  a\tb");
        System.out.println("   a\tb");
        
        
		//int[] nums = new int[3];   
		ArrayList<String> list = new ArrayList<String>() ; //"动态"数组
//		list.add("a") ;//ctrl
//		list.add("b") ;
//		list.add("c") ;
//		
		list.remove("b") ;
 		list.remove(1) ;  //a 
//		System.out.println(list);
		//10二进制是	1010
//		System.out.println(10>>1);
	}
}
