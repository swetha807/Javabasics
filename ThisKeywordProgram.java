package package2;
public class ThisKeywordProgram 
{
 int empid;
 String name;
 double salary;
 void empdetails(int empid,String name,double salary)
 {
	this.empid=empid;
	this.name=name;
	this.salary=salary;	
 }
 public static void main(String[] args) 
 {
	 ThisKeywordProgram s1=new ThisKeywordProgram();
	 s1.empdetails(123,"Swetha",40000);
	 System.out.println(s1.empid);
	 System.out.println(s1.name);
	 System.out.println(s1.salary);
}
}
