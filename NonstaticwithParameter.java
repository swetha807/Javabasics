package package2;
public class NonstaticwithParameter 
{
	void add(int a,int b)
	{
	 int c=a+b;
	 System.out.println("The Addition of 2 numbers-> "+ c);
	}
	void sub(int a,int b)
	{
	 int c=a-b;
	 System.out.println("The Subtraction of 2 numbers-> "+ c);
	}
	void mul(int a,int b)
	{
	 int c=a*b;
	 System.out.println("The Multiplication of 2 numbers-> "+ c);
	}
	void div(int a,int b)
	{
	 int c=a/b;
	 System.out.println("The Division of 2 numbers-> "+ c);
	}
	
public static void main(String[] args) 
{
	NonstaticwithParameter ns=new NonstaticwithParameter();
	ns.add(10, 20);
	ns.sub(30, 20);
	ns.mul(30, 40);
	ns.div(40, 2);
}
}
