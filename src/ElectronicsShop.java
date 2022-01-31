import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElectronicsShop {

	public static void main(String[] args) {
		int[] keyboards = {4};
		int[] drives = {5};

		System.out.println(getMoneySpent(keyboards, drives,5));
	}
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		int highestValue = 0;
		int[] keyDes = Arrays.stream(keyboards).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();

		int[] drivesDes = Arrays.stream(drives).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();

		for (int i = 0; i < keyDes.length; i++) {
			for (int j = 0; j < drivesDes.length; j++) {
				int currentValue = keyDes[i] + drivesDes[j];
				if (currentValue <= b && currentValue >= highestValue) {
					highestValue = currentValue;
					break;
				}
			}
		}
		return highestValue == 0 ? -1 : highestValue;
	}
}
