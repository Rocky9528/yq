package json;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

//List转JSONArray  (只有 单值形式  )
public class SampleDemo02 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>() ;
		names.add("zs") ;
		names.add("ls") ;
		names.add("ww") ;
		JSONArray array = JSONArray.fromObject(names  );
		System.out.println(array);
//		for(int i=0;i<array.size();i++) {
//			JSONObject json = 	(JSONObject)array.get(i) ;  
//		   System.out.println(json);
//		}
		
		
	}
}
