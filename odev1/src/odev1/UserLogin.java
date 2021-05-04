package odev1;

public class UserLogin {
	
	String userName;
	String password;
	
	public UserLogin() {
		
		System.out.println("Kullanýcý giriþ ekraný");
		
	}
	public UserLogin(String userName, String password) {
		
		this();
		this.userName = userName;
		this.password = password;
		
	}

}
