
public class Swap {
	public static void main(String[] args)
	{
		Mydata data = new Mydata();
		data.a = 6;
		data.b = 9;
		System.out.println("调用swap方法前,a="+ data.a +"b=" + data.b);
		swap(data);
		System.out.println("调用swap方法后,a="+ data.a +"b=" + data.b);
		int a = 6;
		int b = 9;
		System.out.println("a="+a+"b="+b);
		swap(a,b);
		System.out.println("a="+a+"b="+b);
		int[] ss = new int[2];
		ss[0] = a;
		ss[1] = b;
		swap(ss);
		System.out.println("数组引用a="+ss[0]+"b="+ss[1]);
	}
	public static Mydata swap(Mydata data)
	{
		int temp = data.a;
		data.a = data.b;
		data.b = temp;
		System.out.println("调用swap方法里,a="+ data.a +"b=" + data.b);
		data = null;
		return data;
	}
	public static void swap(int a,int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	public static int[] swap(int []ss)
	{
		int temp = ss[0];
		ss[0] = ss[1];
		ss[1] = temp;
		return ss;
	}
}
