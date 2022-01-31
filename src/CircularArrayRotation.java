import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircularArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a =Arrays.asList(1,2,3);
		List<Integer> q =Arrays.asList(0,2);
	//	System.out.println(reverseArray(a, 0, a.size()-1));
		System.out.println(circularArrayRotation2(a,4,q));
	}

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		List<Integer> rotatedlist = new ArrayList<>(a);
		for (int i = 0; i < a.size(); i++) {
			int pos = i + k;
			if (pos >= a.size()) {
				pos -= a.size();
			}
			rotatedlist.set(pos, a.get(i));
		}
		List<Integer> list = new ArrayList<>();
		for (int i : queries) {
			list.add(rotatedlist.get(i));
		}
		return list;
	}
	
	public static List<Integer> circularArrayRotation2(List<Integer> a, int k, List<Integer> queries) {
		k = k % a.size();
		final int SIZE = a.size()-1;
		reverseArray(a, 0 , SIZE);
		reverseArray(a, 0 , k - 1);
		reverseArray(a, k , SIZE);
		
		for (int i=0;i<queries.size();i++) {
			int pos = queries.get(i);
			int value = a.get(pos);
			queries.set(i, value);
		}
		return queries;
	}
	
	public static List<Integer> reverseArray(List<Integer> a, int start, int end) {
		while (start < end) {
			int temp = a.get(start);
			a.set(start, a.get(end));
			a.set(end, temp);
			start++;
			end--;
		}
		return a;
	}

}
