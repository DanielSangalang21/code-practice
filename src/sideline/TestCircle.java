package sideline;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setRadius(4);
		
		Circle c2 = new Circle();
		c2.setRadius(8);
		
		Circle c3 = new Circle();
		
		System.out.println("Circle 1 area:"+c1.computeArea());
		System.out.println("Circle 1 diameter:"+c1.computeDiameter());
		System.out.println("---------------------------------");
		System.out.println("Circle 2 area:"+c2.computeArea());
		System.out.println("Circle 2 diameter:"+c2.computeDiameter());
		System.out.println("---------------------------------");
		System.out.println("Circle 3 area:"+c3.computeArea());
		System.out.println("Circle 3 diameter:"+c3.computeDiameter());
	}
}
