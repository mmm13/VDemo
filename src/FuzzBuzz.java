
public class FuzzBuzz {

	/**
	 * If number is evenly divisible by 3 print Fizz on line by itself
	 * If number is evenly divisible by 5 print Buzz on line by itself
	 * If number is evenly divisible by 3 & 5 print FizzBuzz on a line by itself
	 * If number is NOT evenly divisible by 3 & 5 print the number on line by itself
	 */
	
	// have 2 different solutions
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chk=0;
		System.out.println("For LOOP : ");
		for (int cnt=1; cnt <=100; cnt++)
		{
			if ( cnt % 3 == 0){
				System.out.print("Fizz");
				chk=1;
			}
			if (cnt % 5 == 0){
				System.out.print("Buzz");
				chk=1;
			}
			if (chk == 0 )
				System.out.print(cnt);
			System.out.println("");
			chk=0;
		}
		
		System.out.println("For LOOP Two: ");
		for(int cnt=1; cnt<=100; cnt++)
		{
			String num="";


			if(cnt%3==0)
			  num+="Fizz";
			if(cnt%5==0)
			  num+="Buzz";
			if(num.length()==0)
			  num=Integer.toString(cnt);


			System.out.println(num);
		}
	}
}
