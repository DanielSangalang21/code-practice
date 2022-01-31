
public class AppendAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zzzzz", t = "zzzzzzz";
		int k = 4;
		System.out.println(appendAndDelete(s, t, k));
	}

	public static String appendAndDelete(String s, String t, int k) {
		// Write your code here
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		int count = 0,index =0;
		int countDelete = 0, countAppend = 0;
		
		if (s.equals(t)) {
			return "Yes";
		}

		for (int i = 0; i < sChar.length; i++) {
			if(i<tChar.length) {
				if(sChar[i] != tChar[i]) {
					index = i; break;
				}
			}
		}
		if (index == 0) {
			if (sChar.length > tChar.length) {
				index = tChar.length;
			} else {
				String zeroIndex = t.substring(0, sChar.length);
				int lengthDiff = tChar.length - sChar.length;
				String endIndex = t.substring(lengthDiff, tChar.length);
				if (zeroIndex.equals(s) && endIndex.equals(s)) {
					count = lengthDiff;
					return count <= k ? "Yes" : "No";
				}
				index = 0;
			}
		}
		countDelete = sChar.length - (index);
		countAppend = tChar.length - (index);
		count = countDelete + countAppend;
		
		if (count <= k) {
			return "Yes";
		}
		
		return "No";
	}

}
