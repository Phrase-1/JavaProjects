package employee;

import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		
		
		Employee e1 = new Employee("wang",8000,24);
		Employee e2 = new Employee("yan",8000,21);
		Employee e3 = new Employee("han",7000,20);
		Employee e4 = new Employee("zhang",9000,25);
		Employee e5 = new Employee("zhou",8200,23);
		
		Employee[] ee = new Employee[5];
		ee[0] = e1;
		ee[1] = e2;
		ee[2] = e3;
		ee[3] = e4;
		ee[4] = e5;
		
		EmployeeComparator ec = new EmployeeComparator();
		
		Arrays.sort(ee,ec);
		
		for(Employee e : ee){
			System.out.println("name:" + e.getName() + " salary:" + e.getSalary() + " age:" + e.getAge());
		}
	}
}
