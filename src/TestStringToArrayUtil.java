
public class TestStringToArrayUtil {
	public static	String testString ="5 10 1 7 10 9 5 1 9 5 1 1 9 1 6 6 4 1 4 10 10 5 7 3 7 5 10 2 5 1 5 2 4 2 1 8 6 10 7 2 8 9 10 8 7 1 9 5 10 7 8 1 8 4 9 3 8 8 10 10 5 3 8 10 3 10 8 9 1 4 9 2 7 6 8 9 10 6 7 1 4 6 3 2 7 9 8 5 10 1 3 3 8 9 3 1 2 1 5 6 4 10 10 6 3 7 6 9 7 9 3 2 10 5 8 2 6 2 2 1 1 8 7 9 3 7 7 3 2 2 7 3 1 2 6 5 6 4 9 8 7 4 7 3 1 4 4 3 10 4 4 5 4 4 6 5 10 6 8 10 10 9 8 5 2 1 5 10 7 2 10 7 10 7 8 1 10 3 5 4 7 1 8 2 7 10 3 1 1 3 3 1 9 1 10 6 1 7 7 7 9 9 6 4 10 8 7 7 3 6 7 7 6 7 8 7 1 7 2 7 4 4 8 4 7 3 10 7 7 1 1 5 6 8 8 4 3 9 2 8 6 7 5 10 7 2 3 10 7 8 6 1 8 9 1 1 8 2 4 1 7 2 10 5 10 8 4 3 9 2 9 4 9 10 3 8 4 8 7 1 5 10 8 6 6 1 7 3 10 1 3 3 7 7 2 2 9 3 6 10 6 10 6 8 10 1 1 9 2 1 8 4 1 6 6 4 4 4 6 9 10 9 3 6 7 7 5 1 10 5 4 4 1 5 5 9 2 2 1 9 7 7 8 2 5 3 6 10 10 3 9 4 10 7 8 3 6 8 4 1 3 7 5 1 8 1 6 10 7 4 7 2 1 4 2 6 3 4 5 10 5 6 8 7 8 2 1 5 6 2 2 8 4 5 10 1 4 6 7 2 10 7 4 4 3 1 1 6 8 9 10 5 1 9 5 9 6 7 7 2 5 4 5 6 5 10 9 7 6 4 6 2 6 1 2 9 6 3 4 3 1 6 6 6 1 8 3 4 9 1 8 3 7 5 10 2 5 10 8 5 3 9 1 3 10 5 2 3 7 2 9 9 10 8 9 1 3 3 2 1 2 5 1 8 2 3 2 7 10 10 1 3 8 9 6 5 10 9 5 8 10 8 5 10 7 7 4 3 6 2 6 10 5 2 10 10 6 2 7 9 1 1 3 1 9 8 4 8 10 9 3 4 3 5 4 10 5 9 7 1 7 8 7 9 8 3 4 6 4 9 5 8 1 9 1 7 2 7 2 9 10 2 8 3 7 7 1 3 4 10 2 8 8 10 5 5 1 6 1 10 2 9 1 6 10 7 4 6 7 5 8 6 7 2 6 2 6 9 3 2 9 6 3 5 7 3 1 4 5 10 7 6 2 9 7 3 3 4 3 5 8 5 1 8 5 7 9 1 6 1 7 6 4 9 8 3 10 6 6 1 9 10 2 5 2 8 10 4 1 10 4 7 9 5 5 9 9 3 9 7 6 3 7 2 8 8 1 1 6 9 9 10 5 10 6 3 2 3 10 7 8 8 4 9 5 10 5 1 7 4 4 7 6 7 2 3 4 9 8 6 2 1 10 6 1 2 9 8 1 3 3 8 4 10 8 1 2 2 9 10 3 10 1 1 6 7 6 1 8 6 5 2 8 4 3 3 2 7 4 2 7 3 7 4 1 5 3 9 1 1 2 5 2 2 3 8 8 4 7 7 10 8 10 5 2 9 9 9 4 7 6 2 1 6 9 4 3 2 10 8 4 5 2 3 9 2 3 5 7 2 3 7 4 5 6 10 3 1 9 1 8 10 8 8 5 5 6 9 2 2 4 6 10 4 3 6 9 5 10 2 2 4 3 9 4 6 5 6 10 4 10 10 6 9 7 2 10 4 10 7 1 9 8 7 8 6 1 7 1 10 2 3 10 2 6 8 1 1 3 6 7 8 10 6 6 8 5 2 6 10 6 9 8 8 1 4 1 9 6 8 7 4 4 3 9 2 1 9 10 1 1 10 2 7 8 9 7 9 1 10 1 1 3 10 1 1 1 8 2 3 5 5 6 8 9 9 2 10 5 1 1 4 5 4 10 5 7 7 8 9 7 5 2 5 6 4 8 2 4 1 9 7 4 5 8 10 6 7 10 2 4 10 5 1 3 7 10 3 10 10 1 6 9 1 1 1 4 8 5 4 8 8 6 9 8 5 6 10 5 3 7 10 9 2 5 8 3 1 2 7";
	
	public static void main(String[] args) {
	
		Integer nums[] =  StringToArrayUtil.convertStringToArray(testString);
		int count =1;
		for(Integer i : nums) {
			count++;
			System.out.print(i+ ", ");
			boolean b = count % 100 == 0 ? true : false ;
			if (b) System.out.println(); else System.out.print("");
		}
	}
}
