package package2;

public class Globalvariable 
{
	static int a=10;
	int b=20;
	public static void main(String[] args) 
	{
		int c=40;
		System.out.println(c);
		System.out.println(a);
		Globalvariable g=new Globalvariable();
		System.out.println(g.b);
		
	}

}
