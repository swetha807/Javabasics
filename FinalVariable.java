package package2;

public class FinalVariable 
{
 final static double pivalue=Math.PI;
 static void Area_of_circle()
 {
	 final int r=10;
	 double area=pivalue*r*r;
	 System.out.println(area);
 }
 public static void main(String[] args) 
 {
	Area_of_circle();
}
}
