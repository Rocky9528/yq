package ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SeriSample {
	
	public static void writeObject() throws FileNotFoundException, IOException {
		Person per1 = new Person("zs",23) ;
		Person per2 = new Person("ls",24) ;
		Person per3 = new Person("ww",25) ;
		List<Person> persons = new ArrayList<>();
		persons.add(per1);
		persons.add(per2);
		persons.add(per3);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\pers.obj"));
		oos.writeObject(persons);//将对象 写入硬盘
		oos.close();
	}
	
	public static void readObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:\\pers.obj")) ;
		Object perObj = ois.readObject() ;
		List<Person> pers	 = (List<Person>)perObj;
		for(Person per:pers) {
			System.out.println(per.getName()+","+per.getAge());
		}
		ois.close();
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// writeObject();
		readObject();
	}
}
