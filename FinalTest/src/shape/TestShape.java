package shape;

public class TestShape {
	public static void main(String[] args){
		
		Circle c = new Circle(4);
		Rectangle r = new Rectangle(10,2.5);
		
		System.out.println("圆形的面积 = " + c.Area());
		System.out.println("矩形的面积 = " + r.Area());
	}
}
