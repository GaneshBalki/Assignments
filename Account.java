//Entity 
public class Account {
	
	int id ;
	String name;
	float balance ;

	public Account() {
		
	}

	public Account(int id, String name, float balance) {

		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	
	public String showData() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public void showDetails() {
		System.out.println( "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]");
	}
	
	

}




