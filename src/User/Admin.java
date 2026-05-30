package User;

public class Admin extends Person {

	public Admin(String Username) {
		super(Username);
	}

	@Override
	public void Role() {
		System.out.println("Welcome to Admin"+Username);
		
	}
	

}
