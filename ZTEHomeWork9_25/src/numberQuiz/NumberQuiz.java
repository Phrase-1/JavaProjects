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
				System.out.println("�µ���С��,�ٴγ��ԣ�");
				i = sc.nextInt();
			}
			else if(i > r) {
				System.out.println("�µ�������,�ٴγ��ԣ�");
				i = sc.nextInt();
			}
			else {
				System.out.println("��ϲ�¶ԣ���ȷ���ǣ�" + i);
				break;
			}
			
			
		}
		sc.close();
	}

}
