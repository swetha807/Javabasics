package package2;

public class AreaofCircle 
{
 public static void main(String[] args) 
 {
	for(int i=1;i<=50;i++)
	{
		int radius=1+(int)(Math.random()*50);
		double area=Math.PI*radius*radius;
		System.out.println("circle"+ i+" "+"Radius"+ radius+" " +"area"+ area);
	}
 }
}
