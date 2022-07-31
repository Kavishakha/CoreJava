package collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World Love World";
		
		String [] wrds = str.split(" ");
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		for (String word:wrds) {
			
			if (map1.get(word) == null) {
				
				map1.put(word, 1);
			}
			else {
				
				int oldOcc = map1.get(word);
				map1.put(word, oldOcc+1);			
				}
		}
		
		System.out.println(map1);

	}

}
