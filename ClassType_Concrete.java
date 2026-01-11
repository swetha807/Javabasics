package package2;
abstract class Google_Auth
{
	abstract void login();
	abstract void logout();
	static void two_way_auth()
	{
		System.out.println("Exposing the logic");
	}
	void resetpassword()
	{
		System.out.println("Exposing the logic");
	}
}
public class ClassType_Concrete extends Google_Auth
{
 public static void main(String[] args) 
 {
	 ClassType_Concrete obj = new ClassType_Concrete();
	 obj.login();          
     obj.logout();
}
void login() 
{
	System.out.println("real logic");
}

void logout() 
{
	System.out.println("real logic");
}
}
