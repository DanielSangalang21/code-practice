import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(2, 4);
		List<Integer> b = Arrays.asList( 16, 32, 96);
		
		int lcm = getLCM(a);
		int gcd = getGCD(b);
		System.out.println(getTotalX(lcm,gcd));
	}
	
	private static Integer getLCM(List<Integer> aCollection){

		Integer max = Collections.max(aCollection);
		int lcm = 0;
		for (int i = max ; i <=100; i+=max) {
			int counter = 0;
			for(int num : aCollection) {
				if (i % num != 0) {
					break;
				}lcm = i;
				counter++;
			}
			if(counter==aCollection.size()) break;
			else counter = 1;
		}
		return lcm;
	}
	
	
	  private static Integer getGCD(List<Integer> bCollection){
		  Integer max = Collections.max(bCollection);
		  Boolean evenGCD = true;
		  if(max%2!=0) 
			  evenGCD = !evenGCD;
		  
		  int loopStart = 0;
		  
		  if(evenGCD) 
			  loopStart = 2;
		  else 
			  loopStart = 3;
		  
		  int gcd = 0;
		  
		  for(int i=loopStart;i<=max;i+=2) {
			  int counter = 0;
			  for(int num : bCollection) {
					if (num % i != 0) {
						break;
					}counter++;	
			  }
			  if(counter==bCollection.size()) 
				  gcd = i;
		  }
		  return gcd;
	  }
	
	  private static Integer getTotalX(int lcm,int gcd){
		  List<Integer> lcmMultiple = new ArrayList<>();
		  for (int i = lcm ;i<=gcd;i+=lcm) {
			 lcmMultiple.add(i); 
		  }
		  int counter = 0;
		  for (int num : lcmMultiple) {
			  if(gcd%num==0) {
				  counter++;
			  }
		  }
		  return counter;
	  }
}
