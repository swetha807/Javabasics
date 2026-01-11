package package2;
interface One
{
	void add();
	void sub();
}
public class ClasswithInterface implements One
{
 public static void main(String[] args) 
 {
	 ClasswithInterface obj = new ClasswithInterface();
	 obj.add();
     obj.sub();
}
public void add() 
{
	int a = 10;
	int b = 20;
    System.out.println("Addition: " + (a + b));
	
}
public void sub() 
{
	int a = 70;
	int b = 20;
    System.out.println("Subtraction: " + (a - b));
}
}
