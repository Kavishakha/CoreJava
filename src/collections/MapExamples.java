package collections;

import java.util.HashMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(0, "name1");
		map.put(1, "name2");
		map.put(2, "name3");
		map.put(10, "Sachin");
		
		System.out.println("The HashMap is:" + map);
		
		map.replace(1, "Pravish");
		
		System.out.println(map);
		
		map.remove(10);
		
		System.out.println(map);
		
		for (Integer key : map.keySet()) {
			
			System.out.println("The key is:" +key);
			System.out.println("The value is: " + map.get(key));
		}
		
	}

}
