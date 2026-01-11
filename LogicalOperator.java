package package2;

public class LogicalOperator 
{
 public static void main(String[] args) 
 {
	int a=10;
	int b=5;
	if(a>0&&b>0)
	{
		System.out.println("Both numbers are positive");
	}
	if(a>0||b<0)
	{
		System.out.println("Atleast one condition is true");
	}
	if(a>0&&!(b<0))
	{
		System.out.println("a is positive AND b is not negative ");
	}
	if(!(a<0)||b<0)
	{
		System.out.println("a is not negative OR b is not negative");
	}
 }
}
