package package2;

public class Globalvariable1 
{
	static int a=10;
	int b=20;//it is non static- to update its value you should create object.
	            //by ref variable you can update it
	public static void main(String[] args) 
	{
		a=30;//update global variable value (if it is static)
		Globalvariable1 g1=new Globalvariable1();
		g1.b=70;
		System.out.println(g1.b);
		int c=40;
		System.out.println(c);
		c=50;// once datatype mentioned no need to mention again(int)
		System.out.println(c);
		System.out.println(a);
		Globalvariable g=new Globalvariable();
		System.out.println(g.b);
		
	}

}