package practice15;

import java.util.List;
//颜群老师微信157468995
public class XmlParseTest {
	public static void main(String[] args) throws Exception {
		// 输入一个xml文件名（dogs.xml），将该文件转为List集合(List<Dog>)
		String fileName = "src//practice15//dogs.xml";
		List<Dog> dogs = XMLParseUtil.parseXmlToList(fileName);
		for (Dog dog : dogs) {
			System.out.println(dog);
		}
	}
}
