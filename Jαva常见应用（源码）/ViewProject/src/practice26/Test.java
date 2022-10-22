package practice26;
import java.util.HashSet;
import java.util.Scanner;
public class Test {
	//zs  ls
	//zs  ls		
	//ss  ss
	//ss  ss
	public static void main(String[] args) {
		int num = 5 ;
		String[] left = new String[num] ;
		String[] right = new String[num] ;
		Scanner input = new Scanner(System.in) ;
		
		for(int i=0;i<num;i++) {
			left[i] = input.next() ;
			System.out.println("left....");
			right[i] = input.next() ;
			System.out.println("right....");
		}
		HashSet<String> nameParis = new HashSet<String>() ;//set：无重复   
		//统计
		for(int i=0;i<num;i++) {
			String name = left[i]  + "#" + right[i];//zs-li  zs-li
			nameParis.add(name) ;
			System.out.println(nameParis.size());
		}
	}
}
