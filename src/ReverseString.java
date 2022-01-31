import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hiraya"));
	}
	
	public static String reverseString(String str) {
		char[] ch = str.toCharArray();
		int start =0, end=str.length()-1;
		while(start<end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		String rev = "";
		for (int i=0;i<ch.length;i++) {
			rev+=ch[i];
		}
		return rev;
	}

}
