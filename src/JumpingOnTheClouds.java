
public class JumpingOnTheClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = {0,0,1,0};
		int k = 2;
 		System.out.println(jumpingOnClouds(c,k));
	}

	static int jumpingOnClouds(int[] c, int k) {

		int energy  = 100;
		int i = (0 + k) % c.length;
		energy = energy - 1;
		if (c[i] == 1) energy = energy - 2;
		
		while (i!=0) {
			i = (i + k) % c.length;
			energy = energy - 1;
			if (c[i] == 1) energy = energy - 2;
		}
		
		return energy;
	}

}
