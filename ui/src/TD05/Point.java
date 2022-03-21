package TD05;

public class Point {

	private double x,y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(double dx, double dy) {
		this.x = dx;
		this.y = dy;
	}
	
	public String toString() {
		return "Point ("+this.x + "," + this.y + ")";
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	
	
	
	
	
	
	
	
	
}
