public class BeautifulDAysAtTheMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.round(1.67));
	}

	public static int beautifulDays(int i, int j, int k) {
		// Write your code here
		int count = 0;
		for (int z = i; z <= j; z++) {
			int rev = reverseNum(z);
			int dif = z-rev;
			if(dif%k==0) count++;
		}
		return count;
	}
	
	public static int reverseNum(int n){
		int rev = 0;
		while(n != 0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n/=10;
		}
		return rev;
	}
}
