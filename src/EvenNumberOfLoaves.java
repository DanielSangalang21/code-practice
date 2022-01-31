import java.util.Arrays;
import java.util.stream.Stream;

public class EvenNumberOfLoaves {

	public static void main(String[] args) {
		Integer nums[] =  StringToArrayUtil.convertStringToArray(TestStringToArrayUtil.testString);
		int bInt[] = Stream.of(nums).mapToInt(i->i).toArray();
		
		if(bInt.length == 2) {
			if(bInt[0] % 2 ==1) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println(fairRations(bInt));
	}
	public static int fairRations(int[] B) {
		int bcount = 0;

		boolean hasOdd = true;
		while (hasOdd) {
			hasOdd = Arrays.stream(B).anyMatch((t)-> t%2==1 );
			for (int i=0;i<B.length;i++) {
				if(B[i]%2==1) {
					B[i]++; 
					if(i+1<B.length) B[i+1]++;
					bcount+=2;
					break;
				}
			}
		}
		return bcount;
    }

}
