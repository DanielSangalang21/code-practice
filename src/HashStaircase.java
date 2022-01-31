import java.io.IOException;

public class HashStaircase {

	public static void main(String[] args) throws IOException {
		
		
		for (int i=0; i<6 ;i++) {
			for (int j=5; j>=0 ;j--) {
				if(j<=i) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
