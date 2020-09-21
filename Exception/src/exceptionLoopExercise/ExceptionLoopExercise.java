package exceptionLoopExercise;

import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class ExceptionLoopExercise {
	public static void main (String[] args) throws AgeException{
		boolean isNameError = true;
		boolean isSalaryError = true;
		boolean isAgeError = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ա��");
		String name;
		double salary;
		int age = 0;
		do{
			try{
				System.out.println("����������");
				name = sc.nextLine();
				isNameError = false;
			}
			catch(InputMismatchException e){
				throw new InputMismatchException("�������벻��ȷ,����������");
			}
			finally{
				
			}
		}while(isNameError);
		
		do{
			try{
				System.out.println("����нˮ��");
				salary = sc.nextDouble();
				isSalaryError = false;
			}
			catch(InputMismatchException e){
				throw new InputMismatchException("нˮ���벻��ȷ,����������");
				sc.nextLine();
			}
		}while(isSalaryError);
		do{
			try{
				System.out.println("�������䣺");
				age = sc.nextInt();
				System.out.println("1111111111111");
				if(age < 20||age > 60)
					throw new AgeException("���䷶Χ���Ϸ�,����������");
				isAgeError = false;
			}
			catch(InputMismatchException e){
				System.out.println("�����ʽ����ȷ");
			}
			catch(AgeException e){
				System.out.println(e.getMessage());
			}
		}while(isAgeError);
		
		Staff s = new Staff(name,salary,age);
		
		sc.close();

	}
}


class AgeException extends Throwable{
	public AgeException() {}
	public AgeException(String gripe) {
		super(gripe);
	}
}
class SalaryException extends Throwable{
	public SalaryException(){}
	public SalaryException(String gripe){
		super(gripe);
	}
	
}