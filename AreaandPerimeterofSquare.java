package package2;

import java.util.Scanner;

public class AreaandPerimeterofSquare 
{
 static Scanner s1=new Scanner(System.in);
 static void Area_of_Square()
 {
	  
	 System.out.println("Enter the value of a");
	 double a=s1.nextDouble();
	 System.out.println("Lets findout the area");
	 double area=a*a;
	 System.out.println("The area of Square is: "+area);
	 
 }
 static void Perimeter_of_Square()
 {
	 System.out.println("Enter the value of a");
	 double a=s1.nextDouble();
	 System.out.println("Lets findout the perimeter");
	 double perimeter=4*a;
	 System.out.println("The perimeter of Square is: "+perimeter);
	 
 }
 public static void main(String[] args) 
 {
	 Area_of_Square();
	 Perimeter_of_Square();
	 s1.close();
 }
}
