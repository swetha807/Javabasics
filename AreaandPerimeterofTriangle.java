package package2;

import java.util.Scanner;

public class AreaandPerimeterofTriangle 
{
 static Scanner s1=new Scanner(System.in);
 static void Area_of_Triangle()
 {
	System.out.println("Enter the value of b");
	double b=s1.nextDouble();
	System.out.println("Enter the value of h");
	double h=s1.nextDouble();
	System.out.println("lets find out the area");
	double area=0.5*b*h;
	System.out.println("the area of Triangle is: "+area);
	
 }
 static void Perimeter_of_Triangle()
 {
	System.out.println("Enter the value of a");
	double a=s1.nextDouble();
	System.out.println("Enter the value of b");
	double b=s1.nextDouble();
	System.out.println("Enter the value of c");
	double c=s1.nextDouble();
	System.out.println("lets find out the Perimeter");
	double perimeter=a+b+c;
	System.out.println("the Perimetere of Triangle is: "+perimeter);
	;
	
 }
 public static void main(String[] args) 
 {
	 Area_of_Triangle();
	 Perimeter_of_Triangle();
	 s1.close();
}
}
