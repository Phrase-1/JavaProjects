
public class Test {
	public static void main(String[] args)
	{
		Car a = new Car("黑色",1000,120,"上汽");
		a.Info();
		Car b = new Car("黑色",1000,120,"上汽");
		b.Info();
		System.out.println("对比两辆车：\n");
		if(a.equals(b) == true)
			System.out.println("两辆车一样");
		else
			System.out.println("两辆车不一样");
	}
}
