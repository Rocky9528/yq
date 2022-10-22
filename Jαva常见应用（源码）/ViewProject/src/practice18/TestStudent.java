package practice18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());//testCases:测试   示例
		List<Student> studentList = new ArrayList<Student>();
		
		while (testCases > 0) {//for(int i=0;i<testCases;i++)
			int id = in.nextInt();
			String name = in.next();
			double score = in.nextDouble();
			
			Student st = new Student(id, name, score);
			studentList.add(st);
			
			testCases--;
		}
		//排序
		Collections.sort(studentList);
		
		//测试
		for(int i=0;i<studentList.size();i++){
			System.out.println(studentList.get(i).getName());
		}
	}
}
