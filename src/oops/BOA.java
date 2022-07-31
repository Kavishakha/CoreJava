package oops;

public class BOA extends Bank{

	public int CreditCardNum;
	
	public void CCBalance() {
		
		System.out.println("Inside CC Balance");
	}
	
	public void CloseAccount(int CCNumber) {
		
		System.out.println("Inside BOA Close Account");
	}
}
