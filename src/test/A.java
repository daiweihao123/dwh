package test;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("2018-01", 4679L);
		map.put("2018-02", 1719L);
		map.put("2018-03", 4316L);
		map.put("2018-04", 4736L);
		map.put("2018-05", 7200L);
		map.put("2018-06", 10801L);
		map.put("2018-07", 10545L);
		map.put("2018-08", 9110L);
		map.put("2018-09", 8424L);
		map.put("2018-10", 6910L);
		map.put("2018-11", 6251L);
		map.put("2018-12", 453L);
		
//		for(String key : map.keySet()){
//			System.out.println("key:"+key);
//		}
//		for (Object value : map.values()) {
//			System.out.println("value:"+value);
//		}
		
		for(Map.Entry<String, Object> entry:map.entrySet()){
//			System.out.println("key:"+entry.getKey()+","+"value:"+entry.getValue());
			String key = entry.getKey();
			String value = map.get(key+"").toString();
			System.out.println(value);
		}
	}
}
