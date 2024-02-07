package Bank;
class Bank{
	public String name;
	protected String email;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		 password=pass;
	}
}

public class Account {
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.name="Qweez Technology";
		b1.email="qweeztech@gmail.com";
		b1.setPassword("abcd");
		System.out.println(b1.getPassword());
		System.out.println(b1.name);
		System.out.println(b1.email);
	}

}
