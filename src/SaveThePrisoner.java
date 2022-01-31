
public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(saveThePrisoner(7, 19, 2));
	}

	public static int saveThePrisoner(int n, int m, int s) {
		int result = s + m - 1;
		result %=n;
		if(result==0) return n;
		return result;
	}

}
