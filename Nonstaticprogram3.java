package package2;
public class Nonstaticprogram3 
{
	void login()
	{
	 System.out.println("login to Amazon,this is non static method1");
	}
	void search()
	{
	 System.out.println("Search product in Amazon,this is non static method2");
	}
	static void display1()
	 {
		 System.out.println("Display product,this is static method1");
	 }
	static void display2()
	 {
		 System.out.println("Display product2,this is static method2");
	 }
	public static void main(String[] args) 
	{
		Nonstaticprogram3 ns=new Nonstaticprogram3();
		ns.login();
		ns.search();
		display1();
		display2();
	}	
}
