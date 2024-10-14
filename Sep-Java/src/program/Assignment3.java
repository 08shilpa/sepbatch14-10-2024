package program;

public class Assignment3 
{ // ((((10*2)-2)-2)+2)/2)
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of Sum is " +c);
		return c;
	}
	
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Result of Sub is " +c);
		return c;
	}
	
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Result of mul is " +c);
		return c;
	}
	
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Final result is " +c);
	}

	public static void main(String[] args) 
	{ //((((10*2)-2)-2)+2)/2)
Assignment3 obj=new Assignment3();
 
 int mulresult=obj.mul(10,2);
 int subresult=obj.sub(mulresult,2);
 int subresult1=obj.sub(subresult,2);
 int sumresult=obj.sum(subresult1,2);
 obj.div(sumresult,2);

 


	}

}
