package test;

public class LoopingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		
		while (num<=10) {
			
			if (num == 6) {
				num=num+2;
		//		continue;
				break;
			}
			else {
			System.out.println(num);
			// For 1 to 10 numbers : num = num+1; OR num++;
			num = num+2; // For odd numbers
			}
		}
		
		System.out.println("After while loop.");
		
		// for loop
		
		for (int index =1; index<=10; index++) {
			
			if (index == 6) {
				continue;
			}
			
			System.out.println(index);
		}
		
		System.out.println("After for loop");
		
		int[] array2 = {10, 20, 30, 40, 50};
		
	/*	for (int num2:array2) {
			
			System.out.println(num2);
		}
	*/
		// without for each loop
		
		for (int i=0; i<array2.length; i++) {
			
			System.out.println(array2[i]);
		}
		
		//Reversed string operation
		
		String str1 = "Clean world green world";
		
		String ReStr = "";
		
		for (int i=str1.length()-1; i>=0; i-- ) {
			
			ReStr = ReStr + str1.charAt(i);
		}
		
		System.out.println("The original string is: " + str1);
		
		System.out.println("The reversed of given string is: " + ReStr);
	}

}
