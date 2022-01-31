import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// System.out.println(libraryFine2(1, 1, 2015, 31, 12, 2014));
		List<Integer> list = cutTheSticks(Arrays.asList(1,2,3));
		list.stream().forEach(num -> System.out.println(num));
	}

	public static List<Integer> cutTheSticks(List<Integer> arr) {
		// Write your code here
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr.size());
		Collections.sort(arr);
		for (int i = 1; i < arr.size(); i++) {
			if(arr.get(i) != arr.get(i-1)) {
				list.add(arr.size()-i);
			}
		}
		return list;
	}
}
