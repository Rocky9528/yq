package practice12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n = input.nextInt() ;
		Map<String,List<Person>> map = new HashMap<>();
		
		for(int i=0;i<n ;i++) {
			String name = input.next() ;
			int phone = input.nextInt() ;
			Person per = new Person(name,phone);
			List<Person> existPersons = new ArrayList<>();
			if((existPersons=map.get(name   )) != null) {
				//存在，重名
				existPersons.add(per) ;
//				map.put(name, existPersons) ;//因为existPersons是引用类型，所以可以直接改变 原集合
			}else {
				//不存在，新名字，之前没有重名的
				List<Person> newPersons = new ArrayList<>() ;
				newPersons.add(per) ;
				map.put( name  ,   newPersons   ) ;
			}
//			map.put(name, per) ;//可能重名
		}
				
		//查询
		while( input.hasNext()) { //阻塞式   
			String queryName = input.next() ;
			List<Person> certainPersons = map.get(queryName) ;
			System.out.println(  certainPersons.size()==0?"not found ": certainPersons    );
		}
	}
}
