package shape;

public class TestShape {
	public static void main(String[] args){
		
		Circle c = new Circle(4);
		Rectangle r = new Rectangle(10,2.5);
		
		System.out.println("Բ�ε���� = " + c.Area());
		System.out.println("���ε���� = " + r.Area());
	}
}
