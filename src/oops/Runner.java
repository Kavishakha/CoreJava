package oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee E1 = new Employee();
		
		E1.Name = "Mike";
		E1.EmpID = 2121;
		E1.Department = "Legal";
		
		System.out.println(E1.EmpID);
		System.out.println(E1.Name);
		System.out.println(E1.Department);
	//	E1.Display();
		
		Employee E2 = new Employee("Jack", 2122, "Admin");
	//	Employee E2 = new Employee();
	//	E2.Name = "Jack";
	//	E2.EmpID= 2122;
	//	E2.Department = "Admin";
		
		E2.Display();
		
		Bank B = new Bank();
		BOA B1 = new BOA();
		B.DisplayBalance();
		B1.CCBalance();
	
		System.out.println("The Balanace is: " + B.GetBalance());
		
		OverloadingExample O = new OverloadingExample();
		
		int area = O.GetArea(2, 4);
		
		System.out.println("Area is " + area);
		
		
		B1.CloseAccount(12345);
		B.CloseAccount(67890);
		
		Chrome ch = new Chrome();
		ch.OpenBrowser();
		ch.CloseBrowser();
		ch.Show();
		
		//Browser B2 = new Browser(); - Cannot create object of abstract class
		
		Browser Br = new Chrome();
		
		Br.CloseBrowser();
		Br.Display();
		
		HondaCar car1 = new HondaCar();
		CarInterface car2 = new HondaCar();
		
		EncapsulationEx En = new EncapsulationEx();
		
		En.setBalance(2500);
		
		System.out.println(En.getBalance());
		
	}

}
