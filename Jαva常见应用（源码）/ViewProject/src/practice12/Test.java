package practice12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n = input.nextInt() ;
		Map<String,Person> map = new HashMap<>();
		
		for(int i=0;i<n ;i++) {
			String name = input.next() ;
			int phone = input.nextInt() ;
			Person per = new Person(name,phone);
			map.put(name, per) ;//可能重名
		}
		//查询
		while( input.hasNext()) { //阻塞式   
			String queryName = input.next() ;
			Person certainPerson = map.get(queryName) ;
			System.out.println(  certainPerson==null?"not found ": certainPerson.getName()+"\t"+certainPerson.getPhone()                               );
		}
		
	}
}
