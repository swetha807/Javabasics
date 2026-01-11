package package2;

public class Localvariable 
{
	static void display()
	{
		int c=10;//local variable
		System.out.println(c);
		
	}
public static void main(String[] args) 
{
	int a=30;//local variable neither static nor non static
	System.out.println(a);
	display();
}
}
