package package2;

public class ArithmeticOperators 
{
 static void add()
 {
	 int a=10;
	 int b=20;
	 int c=a+b;
	 System.out.println("The result of Addition is: "+c); 
 }
 static void sub()
 {
	 int a=100;
	 int b=60;
	 int c=a-b;
	 System.out.println("The result of Subtraction is: "+c); 
 }
 static void mul()
 {
	 int a=10;
	 int b=20;
	 int c=a*b;
	 System.out.println("The result of Multiplication is: "+c); 
 }
 static void div()
 {
	 int a=20;
	 int b=2;
	 int c=a/b;
	 System.out.println("The result of Division is: "+c); 
 }
 static void mod()
 {
	 int a=30;
	 int b=2;
	 int c=a%b;
	 System.out.println("The result of Modulus is: "+c); 
 }
 public static void main(String[] args) 
 {
	add();
	sub();
	mul();
	div();
	mod();
 }
}
