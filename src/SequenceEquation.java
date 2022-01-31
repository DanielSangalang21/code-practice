import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> p = Arrays.asList(5,2,1,3,4);
		System.out.println(permutationEquation(p));
	}

	public static List<Integer> permutationEquation(List<Integer> p) {
		// Write your code here
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= p.size(); i++) {
			result.add(getY(p,i));
		}
		return result;
	}
	
	public static int factorial(int size) {
		int fact = 1;
		for (int i = size; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int getY(List<Integer> checker,int index) {
		int returnVal = 0;
		for (int i = 1; i <= checker.size(); i++) {
			int subs = checker.get(i-1);	
			
			if(index == checker.get(subs-1)) {
				returnVal = i;
			}
		}
		return returnVal;
	}

}
