package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String Array1[] = {"abc", "pqr", "xyz"};
		
		ArrayList<String> list = new ArrayList<String>();
	
		list.add("John");
		list.add("Leeana");
		list.add("Priyanka");
		list.add("Rohan");
		list.add("Laurence");
		
		System.out.println("The list is " + list);
		System.out.println("The size of the array is: " + list.size());
		
		list.remove(1);
		System.out.println("The list after removing Leeana is: " + list);
		System.out.println("The size of the Array is: " + list.size());
		
		System.out.println("The data at 4th position is: " + list.get(3));
		
		list.set(0, "James");
		
		System.out.println("The list after replacing John: " + list);
		
		list.add(1, "Leeana");
		
		System.out.println("The list after adding Leeana: " + list);
		System.out.println("The size of the list is: " + list.size());
		
		Collections.sort(list);
		System.out.println("The list after sorting the list is: " + list);
		
		Collections.reverse(list);
		System.out.println("The list after reverse: " + list);
		for (int index=0; index<list.size(); index++) {
			
			System.out.println(list.get(index));
		}

		System.out.println();
		
	//	for (String name:list) {
			
	//		System.out.println(name);
	//	}
		
//		boolean flag;
		for (int i=0; i<list.size(); i++) {
			
			if (list.get(i).equals("Vishakha")) {
				
				System.out.println(i);
//				flag = true;
				break;
			}
			
		}
		
	}

}
