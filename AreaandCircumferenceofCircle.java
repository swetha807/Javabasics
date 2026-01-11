package package2;

import java.util.Scanner;

public class AreaandCircumferenceofCircle 
{
 static	Scanner s1=new Scanner(System.in);
 static void Area_Of_Circle()
 {
	System.out.println("Enter the value of R"); 
	double r=s1.nextDouble();
	System.out.println("Lets find out the area");
	double area=Math.PI*r*r;
	System.out.println("The area of Circle is: "+area);
	
 }
 static void Circumference_Of_Circle()
 {
	System.out.println("Enter the value of R"); 
	double r=s1.nextDouble();
	System.out.println("Lets find out the Circumference");
	double circumference=2*Math.PI*r;
	System.out.println("The Circumference of Circle is: "+circumference);
	
 }
 public static void main(String[] args) 
 {
	 Area_Of_Circle();
	 Circumference_Of_Circle();
	 s1.close();
	 
 }	
}
