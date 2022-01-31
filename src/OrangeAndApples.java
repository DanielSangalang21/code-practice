
public class OrangeAndApples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=7,t=11,a=5,b=15;
		int[] apples = {-2,2,1}, oranges = {5,-6};
		
		countApplesAndOranges(s,t,a,b,apples,oranges);
	}
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount = 0 , orangeCount = 0;
		
		for(int num : apples) {
			int applePosition = a + num;
			if (applePosition >= s && applePosition<=t) appleCount++;
		}
		
		for(int num : oranges) {
			int orangePosition = b + num;
			if (orangePosition >= s && orangePosition<=t) orangeCount++;
		}

		System.out.println(appleCount);
		System.out.println(orangeCount);
    }

}
