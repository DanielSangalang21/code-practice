
public class UtopianTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(utopianTree(7));
	}

	public static int utopianTree(int n) {
		// Write your code here
		// odd - 1 even x 2;
		int h = 0;
		if (n % 2 == 0) {
			h = getH(n);
		}else {
			n = n+1;
			h = getH(n)-1;
		}
		return h;
	}
	public static int getH(int n) {
		int h = 0;
		int hm2s = n / 2 + 1;
		h = (int) (Math.pow(2, hm2s)) - 1;
		
		return h;
	}

}
