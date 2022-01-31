import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);
		System.out.println( migratoryBirds(arr));
	}
	
	public static int migratoryBirds(List<Integer> arr) {
		
	    HashMap<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
	   
			for(int j = 0;j<arr.size();j++) {
				if (freqMap.containsKey(arr.get(j))) {
					int totalFreq = freqMap.get(arr.get(j)) + 1; 
						freqMap.put(arr.get(j), totalFreq);
				}else {
					freqMap.put(arr.get(j), 1);
				}	
				
			}
		
		int maxFreq=0;
		Iterator<Entry<Integer, Integer>> it = freqMap.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<Integer,Integer> map = (Map.Entry<Integer,Integer>) it.next();
			if (map.getValue()>maxFreq) {
				maxFreq = map.getValue();
			}		
		}
		
		Iterator<Entry<Integer, Integer>> it2 = freqMap.entrySet().iterator();
		List<Integer> maxFreqNums = new ArrayList<>();
		while (it2.hasNext()) {
			Map.Entry<Integer,Integer> map = (Map.Entry<Integer,Integer>) it2.next();
			if (map.getValue()==maxFreq) {
				maxFreqNums.add(map.getKey());
			}
		}
	
		return Collections.min(maxFreqNums);

	}
}
