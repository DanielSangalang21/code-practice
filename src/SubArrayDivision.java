import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubArrayDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1);
		System.out.println(birthday(s,18,7));
		
	}
	
	 static int birthday(List<Integer> s, int d, int m) {
		 int ways = 0, counter=0;
		 for(int num : s) {
			 List<Integer> subArray = new ArrayList<>();
			 if (m+counter<=s.size()) {
				 for(int i=counter;i<m+counter;i++) {
					 subArray.add(s.get(i));
				 }
				 int sum = subArray.stream().mapToInt(Integer::intValue).sum();
				 if (sum == d) ways++;
			 }else if (s.size()==1) {
				 if (s.get(0) == d) ways++;
			 }
			 counter++;
		 }
		 return ways;
	}

}
