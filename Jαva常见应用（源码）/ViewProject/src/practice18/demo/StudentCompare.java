package practice18.demo;

import java.util.Comparator;

public class StudentCompare  implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		int result = 0 ; 
		if(stu1.getScore()>stu2.getScore()) {
			result = 1 ;
		}else if(stu1.getScore()<stu2.getScore()){
			result = -1 ;
		}else {
			result = 0 ;
		}
		return result;
	}

}
