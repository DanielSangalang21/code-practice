
public class ViralAdvertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( viralAdvertising(5) );
	}

	public static int viralAdvertising(int n) {
		// Write your code here
		int days = 1, likes = 0, shares = 5, prevLike = 2;
		while(days <= n) {
			likes += shares/2;
			prevLike = shares/2;
			shares = prevLike * 3;
			days++;
		}
		return likes;
	}

}
