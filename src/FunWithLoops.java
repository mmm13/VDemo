
public class FunWithLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cnt = 5;
		System.out.println("While LOOP : ");
		while (cnt > 0)
		{
			System.out.println(cnt);
			cnt--;
		}
		System.out.println("\n\nDo While LOOP : ");
		int cnt2 = 6;
		do 
		{
			System.out.println(cnt2++);
		}while (cnt2 <=10);
	
	System.out.println("For LOOP : ");
	for (int cnt3=20; cnt3 >=15; cnt3--)
	{
		System.out.println(cnt3);
	}
	}
	
}
