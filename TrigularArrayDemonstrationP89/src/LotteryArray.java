
public class LotteryArray {
	public static void main(String[] args)
	{
		final int NMAX = 10;
		
		//allocate triangular array
		int [][] odds = new int [NMAX + 1][];//�ȶ�������
		for(int n = 0; n <= NMAX; n++)
		{
			odds[n] = new int [n+1];//��Ϊÿ�ж�����Եĳ���
		}
		
		//fills triangular array
		for(int n = 0; n < odds.length; n++)//��������
			for(int k = 0; k < odds[n].length; k++)//����ÿ�еĳ���
			{
				int lotteryOdds = 1;
				for(int i = 1; i <= k; i++)
					lotteryOdds = lotteryOdds * (n - i + 1)/i;
				odds[n][k] = lotteryOdds;
			}
		
		//print triangular array
		//�����ά����ʱ�����for each�����鱣����е��׵�ַ
		for(int[] row: odds)
		{
			for(int odd : row)//�ڲ�for each������е�����
				System.out.printf("%4d",odd);
			System.out.println();
		}
	}
}