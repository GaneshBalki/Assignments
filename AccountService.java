import java.util.Scanner;

//methods 
public class AccountService {
	static Account a1[] = new Account[3];  // db
	static {
		a1[0] = new Account(101 , "a" , 4589.0f);
		a1[1] = new Account(102 , "b" , 4589.0f);
		a1[2] = new Account(103 , "c" , 4589.0f);
		
	}

	public AccountService() {
		// TODO Auto-generated constructor stub
	}
	
	public static void createAccount(Account a[]) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <a.length ; i++) {
			System.out.println("enter account details for account " + (i+1) );
			System.out.print("enter id ");
			int id = sc.nextInt();
			System.out.print("enter balance ");
			float f = sc.nextFloat();	
			sc.nextLine();
			System.out.print("enter name ");
			String name = sc.nextLine();
			
			a[i] = new Account(id, name, f);
			
		}	
		
	}
	
	public static void displayAccounts(Account a[]) {
		
		for(int i = 0 ; i <a.length ; i++) {
				
			System.out.println(a[i].showData());
		
		}
	}
	
	//search  ID  public static void searchAccount
public static Account searchAccount
(Account a[] , int temp) {
		
		for(int i = 0 ; i <a.length ; i++) {
				if(a[i].id == temp) {
			System.out.println(a[i].showData());
			return a[i];
				}	
		}
		return null;
	}

public static int searchAccount1
(Account a[] , int temp) {
		
		for(int i = 0 ; i <a.length ; i++) {
				if(a[i].id == temp) {
			System.out.println(a[i].showData());
			return i;
				}	
		}
		return -1;
	}


public static void updateAccountDetails
(Account a[] , int t , String name ) {
	
	// search , update 
	
	Account temp = searchAccount(a, t);	
	if(temp != null) {
		temp.name = name;
	}	
	System.out.println(temp.showData());
	
}

}







