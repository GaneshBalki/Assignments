/*create class Account 

	int accId , pincode , pin 
	String name 
	float balance
	static int iRate


	with following functions

		Display Menu 

			1. Create Account 
			2. Display Information of Account 
			3. Deposite 
			4. Withdrwal
			5. check Balance 
			6.  change iRate
			7. calculateIntrest for 30 days 
			8. exit

	include all concepts here 
		1) Constructor Overloading 
		2) this , static 
		3) instance /  static methods 
		4) import java.util.Scanner;*/
import java.util.Scanner;
public class Account {
	
	int accId,pincode , pin; 
	String name ;
	float balance=00.00f,deposite,withdra;
	static int iRate=5;
	Scanner sc=new Scanner(System.in);
	public Account() {
	
	}
	public void acceptChoice() {
		System.out.println("1. Create Account\n 2. Display Information of Account\n 3. Deposite\n 4. Withdrwal\n 5. check Balance\n 6.  change iRate\n 7. calculateIntrest for 30 days\n 8. exit");
		System.out.println("Enter your choice: ");
		
		int choice;
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: 
			creatAccount();
			acceptChoice();
			break;
		case 2:
			displayInfo();
			acceptChoice();
			break;
		case 3:
			deposite();
			acceptChoice();
			break;
		case 4:
			withdra();
			acceptChoice();
			break;
		case 5:
			checkbal();
			acceptChoice();
			break;
		case 6:
		calint();
			acceptChoice();
			break;
		case 7:
		calint();
			acceptChoice();
			break;

		case 8:
		     System.out.println("Thank YOU!!!!.\n.dont come bac");
			
			break;

		}
	}
	public void creatAccount() {
		System.out.println("Enter Your Name");
		name=sc.next();
		
		System.out.println("Enter Your Pincode");
		pincode=sc.nextInt();
		System.out.println("Enter Your Pin");
		pin=sc.nextInt();
	}
	public void displayInfo() {
		System.out.println("Name"+name);
		
		System.out.println("Pincode"+pincode);
		
	}
	public void deposite() {
		System.out.println("Enter The Amount");
		deposite=sc.nextFloat();
		balance=balance+deposite;
	}
	public void withdra() {
		System.out.println("Enter The Amount");
		withdra=sc.nextFloat();
	
		
	if(balance>withdra) {
		balance=balance-withdra;
		System.out.println("Please Collect Your"+withdra+"cash At counter");
	}
	else {
		System.out.println("Insufficient balance");
	}
		
	}
	
	public void checkbal() {
		System.out.println("Your balance is :"+balance);
	}
	
	public void calint() {
		System.out.println("Interest on your balance is:");
		
	}
	
		
	
	
	public static void main(String[] args) {
		Account A=new Account();
		A.acceptChoice();
		

}
}
