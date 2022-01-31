import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);
		System.out.println(pickingNumbers(a));
	}

	public static int pickingNumbers(List<Integer> a) {
		// Write your code here
		Collections.sort(a);
		int maxCount = 0, diffCount = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				int diff = Math.abs(a.get(i)-a.get(j));
				if (diff > 1) {
					break;
				}
				diffCount++;
				if(maxCount<diffCount) maxCount = diffCount;
			}
			diffCount = 0;
		}
		return maxCount+1;
	}
}
