package package2;

import java.util.Scanner;

public class HumanInputAtRuntime 
{
public static void main(String[] args) 
{
 Scanner s1= new Scanner(System.in);
 String name = s1.next();
 int age=s1.nextInt();
 boolean answer=s1.nextBoolean();
 s1.nextByte();
 s1.nextShort();
 s1.nextLong();
 s1.nextFloat();
 s1.nextDouble();
 s1.close();
 
}
}
