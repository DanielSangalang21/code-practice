
public class CountingValleys {
	
	public static void main(String[] args) {
		System.out.println(countingValleys(12,"DDUUDDUDUUUD"));
	}
	
	public static int countingValleys(int steps, String path) {
	    // Write your code here
		char[] pathArray = path.toCharArray();
		int uCount =0, dCount=0,vCount = 0;
		int sealevel=0;
		boolean dived = true;
		for (int i = 0; i < steps; i++) {
			if(pathArray[i] == 'U') {
				sealevel+=1;
				if (sealevel <= 0) {
					dived = false;
				}
			}else {
				sealevel-=1;
				if (sealevel >= 0) {
					dived = true;
				}
			}
			if (dived==false && sealevel ==0) {
				vCount++;
			}
		}
		return vCount;
	}
}
