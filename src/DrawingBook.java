
public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pageCount(6,5));
	}
	
	  public static int pageCount(int n, int p) {
		    // Write your code here
		  return  Math.min(p/2,(n/2)-(p/2));
			/*
			 * int fBack=0,fFront =0;
			 * 
			 * for (int i=0;i<=n;i+=2) { if(p<=i+1) { break; } fFront++; }
			 * 
			 * if (n%2==0) { n+=1; }
			 * 
			 * for (int i=n;i>=0;i-=2) { if(p>=i-1) { break; } fBack++; } if(fBack<fFront) {
			 * return fBack; } return fFront;
			 */
	  }

}
