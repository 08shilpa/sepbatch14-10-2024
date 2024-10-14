package program;

public class Classmate 
{
	int rollno, age;
	
	public void display1()
	{
		System.out.println("First Method");
	}
	public void display2()
	{
		System.out.println("Second Method");
	}
public static void main(String[] args) 
{
Classmate ref=new Classmate();

ref.rollno=1;
System.out.println("Roll no is : " +ref.rollno);

ref.age=5;
System.out.println("Age is : " +ref.age);

ref.display1();
ref.display2();

}
}
