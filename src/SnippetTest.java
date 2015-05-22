
public class SnippetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2; 
		double x=1,y=3;
		double c ;
		c =  calculate(x,y);
		System.out.println("c = " + c);
		c = calculate(a,b);
		System.out.println("c = " + c);
	}
	double calculate(int x , int y, int z){
		return x + y; 
	}
	static double  calculate(double x, double y){
		return x + y ;
	}
	static double calculate (int x, int y){
		return x + y;
	}

}
