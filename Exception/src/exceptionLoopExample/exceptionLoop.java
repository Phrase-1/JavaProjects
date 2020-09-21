package exceptionLoopExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionLoop {
	
	public static void main(String[] args) {
		
		Employ e = new Employ();
		int age;
		String name;
		double salary;
		
		boolean inputError1 = true, inputError2 = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please input name:");
		name = scanner.next();
		e.setName(name);
		
		
		do{
			try{
				
				System.out.println("������нˮ");
				salary = scanner.nextDouble();
				e.setSalary(salary);
				inputError1 =  false;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("������󣬱�������һ��С��������������");
				scanner.nextLine(); //������ǰ�е�������Ϣ				
			}
			
		}while(inputError1);
		
		do {
			try{
				  System.out.println("please input age:");
				  age = scanner.nextInt();
				  if (age < 20 || age >60)
				      throw new AgeException("illegal age");
				  else 
				  {
					  e.setAge(age);
					  inputError2 =  false;
					  //System.out.println("name=" + e.getName()  + ", age="  + e.getAge());
				  }
				  
				  
				}
				catch(AgeException ex)
				{
			    //System.out.println("get it!");
			    System.out.println( ex.getMessage().toString());
				}
			
		}while(inputError2);
		
		 System.out.println("name=" + e.getName()  + ", age="  + e.getAge() + ", salary="  + e.getSalary());
		
			
	}
	
	

}


class AgeException extends Exception{
	
	AgeException()
	{
		
	}
	AgeException(String message){
	    super(message);
	}
}

class Employ
{
   
   private String name;
   private int age;
   private double salary;

   public Employ(String n, int a, double s)
   {
      name = n;
      salary = s;
      age =a;
   }
   public Employ()
   {}

   public String getName()
   {
      return name;
   }
   
   public double getSalary()
   {
      return salary;
   }

  
   public int getAge()
   {
      return age;
   }
   public void setName(String n)
   {
      name = n;   
   }
   public void setSalary(double s)
   {
      salary = s;   
   }
   
   public void setAge(int a)
   {
      age = a;   
   }
 
   
}
