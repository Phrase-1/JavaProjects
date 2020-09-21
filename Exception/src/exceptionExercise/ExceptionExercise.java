package exceptionExercise;
import java.util.*;

public class ExceptionExercise {
	public static void main(String[] args) throws AgeException {
		creatStaff();
	}
	public static void creatStaff() throws AgeException{
		try {
			System.out.println("创建员工：输入姓名 年龄");
			Scanner in = new Scanner(System.in);
			String name = in.nextLine();
			int age = in.nextInt();
			if(age < 20 || age > 60)
				throw new AgeException("年龄不合法");
			Staff s = new Staff(name,age);
			s.Info();
			
		}
		catch(AgeException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("年龄必须处于20 - 60之间");
		}
	}

}

class AgeException extends Throwable{
	public AgeException() {}
	public AgeException(String gripe) {
		super(gripe);
	}
}
