package manualException;

import java.io.*;

public class CatchException {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("text");
			int b;
			while((b = fis.read()) != -1) {
				System.out.print(b);
			}
			fis.close();
		}
		
		catch(FileNotFoundException e){
			System.out.println(e);
			System.out.println("message:" + e.getMessage());
			e.printStackTrace(System.out);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("hello!");
		}
	}
	class FileFormatException extends IOException
	{
		public FileFormatException() {}
		public FileFormatException(String gripe) {
			super(gripe) ;
		}
	} 

	/*String readData(BufferedReader in) throws FileFormatException
	{
		while (1)
		{ if (ch == -1) // EOF encountered
		{
			if (n < len)
				throw new FileFornatException();
		}
		}
		return s;
	}*/

}
