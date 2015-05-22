
public class OperatorDemos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int sum=1+2+3+4+5;
		 String type;
		 
		 if ( sum % 2 == 0)
			type = "even"; 
		else 
			type = "odd";
		 
		 System.out.println (sum + " is " + type);
		 
		 {
		 int a = 5;
		 double b = 2;
		 a = a + (int) b;
		 double c = a/b;
		 
		 System.out.println("c is " + c);
		 }
		 
		 int currentAge = 45;
		 int moreYears = 3;
		 System.out.println("Bob is " + currentAge + " years old.");
		 System.out.println("In " + moreYears + " years, Bob will be " + currentAge + moreYears + " years old");
		 System.out.println("In " + moreYears + " years, Bob will be " + (currentAge + moreYears) + " years old");
		 int newAge = currentAge + moreYears;
		 System.out.println("In " + moreYears + " years, Bob will be " + newAge + " years old");
		 
		 {
		 int a = 3;
		 int b = 4;
		 boolean c = (a ==2) && (b++ ==4);
		 System.out.println("A = " + a);
		 System.out.println("B = " + b);
		 System.out.println("C = " + c);
		 
		 int d = 3;
		 int e = 4;
		 boolean f = (d==3) && (e++ == 4);
		 System.out.println("D = " + d);
		 System.out.println("E = " + e);
		 System.out.println("F = " + f);
		 int g = 3;
		 int h = 4;
		 boolean i = (g==3) && (++h ==4);
		 System.out.println("G = " + g);
		 System.out.println("H = " + h);
		 System.out.println("I = " + i);
		 
		 
		 
		 }
		 
	}

}
