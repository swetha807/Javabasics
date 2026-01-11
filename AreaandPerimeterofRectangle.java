package package2;

import java.util.Scanner;
public class AreaandPerimeterofRectangle 
{
	static Scanner s1=new Scanner(System.in);
	static void Area_Of_Rectangle()
	 {
		
		System.out.println("Enter the value of a");
		double a=s1.nextDouble();
		System.out.println("Enter the value of b"); 
		double b=s1.nextDouble();
		System.out.println("Lets find out the area");
		double area=a*b;
		System.out.println("The area of Rectangle is: "+area);
		
	 }
	 static void Perimeter_Of_Rectangle()
	 {
		 
		 System.out.println("Enter the value of a");
		 double a=s1.nextDouble();
		 System.out.println("Enter the value of b"); 
		 double b=s1.nextDouble();
	     System.out.println("Lets find out the Perimeter");
		 double perimeter= 2*(a + b);
		 System.out.println("The perimeter of Rectangle is: "+perimeter);
	 }
	 public static void main(String[] args) 
	 {
		 Area_Of_Rectangle();
		 Perimeter_Of_Rectangle();
		 s1.close();
		 
	 }	
}
