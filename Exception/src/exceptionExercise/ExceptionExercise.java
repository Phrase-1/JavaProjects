package exceptionExercise;
import java.util.*;

public class ExceptionExercise {
	public static void main(String[] args) throws AgeException {
		creatStaff();
	}
	public static void creatStaff() throws AgeException{
		try {
			System.out.println("����Ա������������ ����");
			Scanner in = new Scanner(System.in);
			String name = in.nextLine();
			int age = in.nextInt();
			if(age < 20 || age > 60)
				throw new AgeException("���䲻�Ϸ�");
			Staff s = new Staff(name,age);
			s.Info();
			
		}
		catch(AgeException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("������봦��20 - 60֮��");
		}
	}

}

class AgeException extends Throwable{
	public AgeException() {}
	public AgeException(String gripe) {
		super(gripe);
	}
}
