
public class SherlockAndSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squares2(100, 1000));
	}

	public static int squares(int a, int b) {
		// Write your code here
		int count = 0;
		for (int i = a; i <= b; i++) {
			if (Math.sqrt(i) % 1 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int squares2(int a, int b) {
		// Write your code here
		int f = (int) Math.sqrt(a);
        int s = (int) Math.sqrt(b);
        int count = s - f;
        if ((f * f) >= a) count++;
        return count;
	}
}
