package program;

public class Assignment4 
{
public Assignment4()
{
	this(1, 2, 3);
 System.out.println("Default constuctor");

}
public Assignment4(int a)
{
	this(10, 15);
	System.out.println("One parameter constuctor");
}
public Assignment4(int a, int b)
{
	this();
	System.out.println("Two parameter constuctor");
	
}
public Assignment4(int a, int b, int c)
{
	System.out.println("Three parameter constuctor");

}
	public static void main(String[] args) 
	{
Assignment4 obj=new Assignment4(1);
	}

}
