
public class CircusShow {
	
	public static void main(String[] args){
	String possibility = kangaroo(0, 2, 5, 3);	
	System.out.println(possibility);
	}
	
	 static String kangaroo(int x1, int v1, int x2, int v2) {
		 if(v1>v2) {
		 if ((x2-x1)%(v1-v2) == 0 ) return "YES";
	        else return "NO";
		 }else return "NO";
	 }
}