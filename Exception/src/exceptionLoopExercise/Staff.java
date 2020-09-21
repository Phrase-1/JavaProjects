package exceptionLoopExercise;

public class Staff {
	private String name;
	private double salary;
	private int age;
	public Staff(String name,double salary,int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		System.out.println("员工创建成功");
		Info();
	}
	public void Info() {
		System.out.println("姓名：" + this.name + "薪水："+ this.salary + " 年龄：" + this.age);
	}
}
