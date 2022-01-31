import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SalesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		 System.out.println(sockMerchant(9,ar));
		 
	}
	
	public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
		HashMap<Integer,Boolean> map = new HashMap<>();
		Collections.sort(ar);
		
		int count = 0;
		for (int i = 0;i<n;i++) {
			if(i+1 < n){
				if(map.containsKey(i) && map.get(i) == true) continue;
				if (ar.get(i)==ar.get(i+1)) {
					count++;
					map.put(i+1, true);
				}
			}
		}
		return count;
	}
}