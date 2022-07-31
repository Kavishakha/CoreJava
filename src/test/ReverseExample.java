package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Clean world green world";
		
		String ReStr = "";
		
		for (int i=str1.length()-1; i>=0; i-- ) {
			
			ReStr = ReStr + str1.charAt(i);
		}
		
		System.out.println("The original string is: " + str1);
		
		System.out.println("The reversed of given string is: " + ReStr);

		int num = 456789;
		int res = 0;
		
		while (num>0) {
			 int rem = num%10;
			 res = res*10 + rem;
			 num = num/10;
		}
		
		System.out.println("The reversed number is : " + res);
		
	}

}
