package oops;

public class Bank {
	
	public int AccountNum;

	public void DisplayBalance() {
		
		System.out.println("Inside Display Balance");
	}
	
	public int GetBalance() {
		
		return 1000;
	}
	
	public void CloseAccount(int AccNum) {
		
		System.out.println("Inside Bank Close Account");
	}
}
