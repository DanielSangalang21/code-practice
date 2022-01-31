import java.util.List;

public class AngryProfessor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String angryProfessor(int k, List<Integer> a) {
		// Write your code here
		int num = (int) a.stream().filter((t) -> t <=0).count();
		return num >= k ? "NO" : "YES";
	}
}
