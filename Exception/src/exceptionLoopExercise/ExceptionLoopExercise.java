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
		System.out.println("创建员工");
		String name;
		double salary;
		int age = 0;
		do{
			try{
				System.out.println("输入姓名：");
				name = sc.nextLine();
				isNameError = false;
			}
			catch(InputMismatchException e){
				throw new InputMismatchException("姓名输入不正确,请重新输入");
			}
			finally{
				
			}
		}while(isNameError);
		
		do{
			try{
				System.out.println("输入薪水：");
				salary = sc.nextDouble();
				isSalaryError = false;
			}
			catch(InputMismatchException e){
				throw new InputMismatchException("薪水输入不正确,请重新输入");
				sc.nextLine();
			}
		}while(isSalaryError);
		do{
			try{
				System.out.println("输入年龄：");
				age = sc.nextInt();
				System.out.println("1111111111111");
				if(age < 20||age > 60)
					throw new AgeException("年龄范围不合法,请重新输入");
				isAgeError = false;
			}
			catch(InputMismatchException e){
				System.out.println("年龄格式不正确");
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