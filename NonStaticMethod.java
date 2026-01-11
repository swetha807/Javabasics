package package2;

public class NonStaticMethod 
{
	void login()
	{
	 System.out.println("login to Amazon");
	}
	void logout()
	{
	 System.out.println("logout from Amazon");
	}
 public static void main(String[] args) 
 {
	 NonStaticMethod ns=new NonStaticMethod();
	 ns.login();
	 ns.logout();
	 
}
}
