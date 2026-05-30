package User;

public class Normalrole extends Person {

	public Normalrole(String username) {
		super(username);
	}

	@Override
	public void Role() {
		System.out.println("Welcom to user"+Username);
	}


	

}
