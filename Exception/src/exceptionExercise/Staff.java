package exceptionExercise;

public class Staff {
	private String name;
	private int age;
	public Staff(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void Info() {
		System.out.println("������" + this.name + " ���䣺" + this.age);
	}
}
