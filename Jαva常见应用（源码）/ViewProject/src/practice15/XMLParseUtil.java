package practice15;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NodeType;

public class XMLParseUtil {
	
	//传入一个文件，返回一个List
//	public static List<Dog> parseXmlToList(InputStream input) {//文件
	public static List<Dog> parseXmlToList(String fileName) throws Exception {
		List<Dog> dogList = new ArrayList<>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance() ;
		//产品
		DocumentBuilder  builder =  factory.newDocumentBuilder() ;
		InputStream input = new FileInputStream( new File(  fileName  )  ) ;
		//将xml文件编程一个 Document对象  （  dogx.xml  ->对象   ）
		Document document = builder.parse( input ) ;
		//文档的节点
		Element element = document.getDocumentElement() ;
		NodeList dogs = element.getElementsByTagName("dog") ;//2个节点  -> 2个对象
		
		for( int i=0;i<dogs.getLength() ;i++ ) {
			//dog结点(含数据) -> dog对象（无数据）
			Element  dogElement = (Element)dogs.item(i) ;
			Dog dog = new Dog(); 
			//思路：在Node中寻找一个 类似于  getAttribute()的方法，但不存在
			/*
			 * 1.转换: getAttributes()数组     -->   获取数组的第0个
			 * 2.Node中不存在？什么中可能存在？  子类   Person 3 	-- Student3+7
			 */
			String idStr = dogElement.getAttribute("id");
			dog.setId (  Integer.parseInt(idStr)   );//"123" ->123
			
			NodeList  dogChildNodes = dogElement.getChildNodes() ;
			for(int j=0;j<dogChildNodes.getLength();j++) {
				Node dogChild = dogChildNodes.item(j) ;
				if(dogChild.getNodeType()  == Node.ELEMENT_NODE) {
					if(	dogChild.getNodeName() .equals("name")) {
						String name = dogChild.getFirstChild().getNodeValue() ;
						dog.setName(name);
					}else if(dogChild.getNodeName() .equals("score")) {
						String score = dogChild.getFirstChild().getNodeValue() ;
						dog.setScore(  Integer.parseInt(score)   );
					}else {//level
						
						String level = dogChild.getFirstChild().getNodeValue() ;
						dog.setLevel(  Integer.parseInt(level)   );
					}
				
				}
			}
			dogList.add(dog)  ;
		}
		return dogList;
	}
}
