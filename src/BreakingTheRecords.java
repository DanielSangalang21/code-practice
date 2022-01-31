import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> scores = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
		
		breakingRecords(scores).stream().forEach((num)->System.out.println(num));

	}
	
	 public static List<Integer> breakingRecords(List<Integer> scores) {
		    int least = 0, most = 0,mostCount = 0,leastCount=0; 

		    int count = 0;
		    for (int num : scores) {
		    	if (count ==0) {
		    		least = num;
		    		most = num;
		    		count++;
		    		continue;
		    	}
		    	if (num<least) {
		    		least = num;
		    		leastCount++;
		    	}else if (num>most) {
		    		most = num;
		    		mostCount++;
		    		}
		    	count++;
		    }
		    
		    List<Integer> result  = Arrays.asList(mostCount,leastCount);
		    return result;
	}
}
