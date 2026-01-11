package package2;
abstract class linkedin
{
	abstract void login();
	abstract void registration();
	static void logout()
	{
		System.out.println("Exposing the logic");
	}
	static void resetpassword()
	{
		System.out.println("Exposing the logic");
	}
}
abstract class naukri extends linkedin
{
	abstract void login1();
	abstract void registration1();
}
public class ClassType_Concrete2 extends naukri
{
  static void method1()
  {
	  
  }
	
	void login1() {
		
		
	}

	
	void registration1() {
		
		
	}

	
	void login() {
		
		
	}

	
	void registration() {
		
		
	}

}
