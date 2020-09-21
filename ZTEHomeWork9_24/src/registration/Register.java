package registration;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean validate = false;
		String acc = null;
		String pwd1 = null;
		String pwd2;
		int age;
		Scanner sc = new Scanner(System.in);
		String[] ac = new String[3];
		while(!validate) {
			System.out.println("input account:");
			acc = sc.nextLine();
			System.out.println("input password:");
			pwd1 = sc.nextLine();
			System.out.println("confirm password:");
			pwd2 = sc.nextLine();
			if(!pwd1.equals(pwd2)) {
				System.out.println("password confirmation failed! input again!");
			}
			else {
				validate = true;
			}
		}
		System.out.println("input age:");
		age = sc.nextInt();
		ac[0] = acc;
		ac[1] = pwd1;
		ac[2] = Integer.toString(age);
		System.out.println("Congratulations! You have registered successfully!");
		System.out.println("Your account: " + ac[0] + " Your password: " + ac[1]);
	}

}
