package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = {10, 20, 30, 40, 50};
		
		System.out.println("The total numbers are " + array1.length);
		System.out.println("The Second number in the array is " + array1[1]);
		System.out.println("The last number in the array is " + array1[array1.length-1]);
		
		
		//String[] array2 = {"abc", "pqr", "xyz"};
		
		String str1 = "Clean World Green World";
		
		String[] array3 = str1.split(" ");
		System.out.println("The first word in the array is " + array3[0]);
		
	
	}

}