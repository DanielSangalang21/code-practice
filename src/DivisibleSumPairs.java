import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ar = Arrays.asList(1,2,3,4,5,6);
		System.out.println(divisibleSumPairs(6, 5, ar));

	}
	
	 public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		    // Write your code here
		 int pairs=0;
		 int max = Collections.max(ar);
		 for (int i=0;i<n;i++) {
			 for (int j=i+1;j<n;j++) {
				 if((ar.get(i)+ar.get(j))%k==0) pairs++;
			 }
		 }
		 return pairs;
	 }
}
