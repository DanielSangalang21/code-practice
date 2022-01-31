package enumerators;

import java.util.EnumSet;
import java.util.HashMap;

public enum Counter {
	ONE,TWO,THREE;
	
	private static final HashMap<String,Counter> countMap;
	
	static {
		countMap = new HashMap<>();
		
		for(Counter count : EnumSet.allOf(Counter.class)) {
			countMap.put(count.name(), count);
		}
	}
	
	
}
