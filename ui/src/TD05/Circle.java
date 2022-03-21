package TD05;

public class Circle {

	private Point center;
	private double rayon;
	
	public Circle(double x, double y, double rayon) {
		center = new Point(x, y);
		this.rayon = rayon;
	}
	
	public void moveCenter(double dx, double dy) {
		center.move(dx, dy);
	}
	
	public void updateRadius(double r) {
		this.rayon = r;
	}
	
	public Point getCenter() {
		return new Point(center.getX(), center.getY());
	}
	
	@Override
	public String toString() {
		return "Circle[" + this.center + "," + this.rayon + "]";
	}
}
