import java.util.stream.Stream;

public class StringToArrayUtil {
	public static Integer[] convertStringToArray(String numsString) {
		Integer nums[] = Stream.of(numsString.trim().split(" "))
				.map(Integer::parseInt)
				.toArray(Integer[]::new);
		return nums;
		
	}
}
