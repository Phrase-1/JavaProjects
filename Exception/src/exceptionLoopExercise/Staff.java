package exceptionLoopExercise;

public class Staff {
	private String name;
	private double salary;
	private int age;
	public Staff(String name,double salary,int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		System.out.println("Ա�������ɹ�");
		Info();
	}
	public void Info() {
		System.out.println("������" + this.name + "нˮ��"+ this.salary + " ���䣺" + this.age);
	}
}
