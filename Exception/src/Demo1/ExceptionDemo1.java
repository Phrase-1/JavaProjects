package Demo1;

import java.io.*;


public class ExceptionDemo1 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("text");
		int b;
		while((b = fis.read()) != -1) {
			System.out.print(b);
		}
		fis.close();
	}

}
