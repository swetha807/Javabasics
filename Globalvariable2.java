package package2;

public class Globalvariable2 
{
	static int a=100;
	int b=300;
	static double pivalue=Math.PI;
	static double weight;
	static boolean output;
	static String name;
	static char c;
	static int number;
public static void main(String[] args) 
{
	System.out.println(a);
	Globalvariable2 g=new Globalvariable2();
	System.out.println(g.b);
	System.out.println(pivalue);
	System.out.println(weight);
	System.out.println(output);
	System.out.println(name);
	System.out.println(c);
	System.out.println(number);
}
}
