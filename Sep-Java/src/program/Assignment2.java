package program;

public class Assignment2 {

	//((((10+2)-2)+2)*2)/2)
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
		{ //((((10+2)-2)+2)*2)/2)
	Assignment2 obj=new Assignment2();
	 int sumresult=obj.sum(10,2);
	 int subresult=obj.sub(sumresult,2);
	 int sumresult1=obj.sum(subresult,2);
	 int mulresult=obj.mul(sumresult1,2);
	 obj.div(mulresult,2);

	 


		}

	}
