
public class FunWithNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  funWithNumbers() ;
	  System.out.println( add(7,4) );
	 // overloading examples 
	  int r1 = addNumbers(2,3);
	  double r2 = addNumbers (6,5,8);
	  double r3 = addNumbers(4.5,5.5);
	  System.out.println(r1 + " "+ r2 + " " + r3);
	  
	 // scope examples 
	  oneMethod();
	 r1=  myMethod(9);
	  System.out.println("myMethod " + r1 );
	 r1=  myMethod(1);
	  System.out.println("myMethod " + r1 );
		
	}

	public static int add (int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	 public static int addNumbers(int a, int b) // the parameters are a & b
	{
		int c = a + b;
		return c;
	}
	
	 public static double addNumbers(double a, double b) // the parameters are a & b
		{
			double c = a + b;
			return c;
		}
	 
	 public static double addNumbers(double a, double b, double x) // the parameters are a, b & x
		{
			double c = a + b + x;
			return c;
		}
		
		
	public static void funWithNumbers()
	{
		int sum = add(2,3);  // the arguments are 2,3
		System.out.println(sum);
	}
	// examples of method scope
	public static void oneMethod()
	{
		int x = 3;
		int y = 4;
		anotherMethod(y);
		System.out.println("oneMethod y = " + y);
	}
	
	public static void anotherMethod(int y)
	{
		int x = 5;
		y=6;
		System.out.println("anotherMethod y = " + y);
		
	}

	
	public static int myMethod (int x)
	{
		x += 2;
		if (x ==3 )
		{
			int y = 8;
			return y;
		}
		else
		{
			int y = 9;
			//ok here because other y declaration is in other block
			return y;
		}
	}
}
