
public class Test {
	public static void main(String[] args)
	{
		Car a = new Car("��ɫ",1000,120,"����");
		a.Info();
		Car b = new Car("��ɫ",1000,120,"����");
		b.Info();
		System.out.println("�Ա���������\n");
		if(a.equals(b) == true)
			System.out.println("������һ��");
		else
			System.out.println("��������һ��");
	}
}
