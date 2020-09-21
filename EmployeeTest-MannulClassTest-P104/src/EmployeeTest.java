import java.time.LocalDate;
import java.util.*;
public class EmployeeTest {
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("HZH",75000,1998,11,28);
		staff[1] = new Employee("YJG",60000,1996,4,8);
		staff[2] = new Employee("ZJY",80000,1999,5,8);
		
		//raise everyone's salaries by 5%
		for(Employee e: staff)
			e.raiseSalary(5);
		
		//print out information about all Employee objects
		for(Employee e: staff)
			System.out.println("name:" + e.getName() + "  salary:" + e.getSalary() + "  hireday:" + e.getHireDay());
	}
}


class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n,double s,int year,int month,int day)
	{
		name = n;
		salary = s;
		hireDay = LocalDate.of(year,month,day);
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary* byPercent/100;
		salary += raise;
	}
}