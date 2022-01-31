import java.util.Collections;
import java.util.List;

public class HurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int hurdleRace(int k, List<Integer> height) {
		// Write your code here
		int max = Collections.max(height);
		if(k<max) return max-k;
		return 0;
	}

}
