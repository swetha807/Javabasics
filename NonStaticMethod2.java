package package2;
public class NonStaticMethod2 
{
	void login()
	{
	 System.out.println("login to Amazon");
	}
	void search()
	{
	 System.out.println("Search product in Amazon");
	}
	void logout()
	{
	 System.out.println("logout from Amazon");
	}
public static void main(String[] args) 
{
	NonStaticMethod2 ns=new NonStaticMethod2();
	 ns.login();
	 ns.search();
	 ns.logout();
}
}
