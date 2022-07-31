package test;

public class PrimeNumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num2 = 13;
		boolean flag = true;
		
		for (int i=2; i<num2; i++) {
			
			if(i==0) {
				
				System.out.println("The number is not Prime");
				flag = false;
			break;
			}
			
		}
		
		if (flag) {
			
			System.out.println("The number is prime");
		}
	}

}
