package exceptionExample3;

public class exceptionExample3 {
	public static void main(String[] args) {
		String b = null;
		paraseObj(b);
		System.out.println("after exception");
	}
	
	static void paraseObj(String s) throws NullPointerException{
		if(s == null)
			throw new NullPointerException("∑√Œ ø’÷∏’Î");
		System.out.println("hello");
	}

}
