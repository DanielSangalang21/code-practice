package sideline;

public class Circle {
	private double radius;
	public final double PIE = 3.1416;
	public Circle(){
		this.radius = 3.5;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double computeDiameter() {
		return 2 * radius;
	}
	
	public double computeArea() {
		return PIE * (radius * radius);
	}
}
