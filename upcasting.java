package package2;
class mathematicaloperations
{
 void add() 
 {
	System.out.println("addition"); 
 }
 void sub() 
 {
	 System.out.println("subtraction");
 }
}
public class upcasting extends mathematicaloperations
{
	void mul() 
	 {
		System.out.println("multiplication"); 
	 }
	 void div() 
	 {
		 System.out.println("division");
	 }
public static void main(String[] args) 
{
System.out.println("After upcasting, I can access only superclass methods:");
mathematicaloperations op=	new upcasting();//upcasting
op.add();
op.sub();
System.out.println("After downcasting, I can access both superclass and subclass methods :");
upcasting up=(upcasting)op;//downcasting
up.add();
up.sub();
up.mul();
up.div();

}	 

}
