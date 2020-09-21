package shape;

public class Circle extends Shape{
	
	private double radius;

	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return (3.14 * radius * radius);
	}

}
