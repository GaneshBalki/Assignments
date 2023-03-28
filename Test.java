// Dev  - Maintaince 
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Account a1 = new Account(101 , "a" , 4589.0f);
		
		//showdetails 
		//String data = a1.showData();
		//System.out.println(data );
		
		System.out.println(a1.showData());	
		
		
		Account a[] = new Account [3] ;//array
		//multiple values with same data type 
			//String data = a[0].showData();
			
			
			//a[1].showData();
			//a[2].showData();  // for loop		
		AccountService.createAccount(a);
		AccountService.displayAccounts(a);
	}

}
