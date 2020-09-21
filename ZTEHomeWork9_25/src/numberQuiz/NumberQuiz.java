package numberQuiz;

import java.util.Random;
import java.util.Scanner;

public class NumberQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int r = new Random().nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("random number generated,take a try:");
		i = sc.nextInt();
		while(1 == 1) {			
			if(i < r) {
				System.out.println("猜的数小了,再次尝试：");
				i = sc.nextInt();
			}
			else if(i > r) {
				System.out.println("猜的数大了,再次尝试：");
				i = sc.nextInt();
			}
			else {
				System.out.println("恭喜猜对！正确答案是：" + i);
				break;
			}
			
			
		}
		sc.close();
	}

}
