
public class LotteryArray {
	public static void main(String[] args)
	{
		final int NMAX = 10;
		
		//allocate triangular array
		int [][] odds = new int [NMAX + 1][];//先定义行数
		for(int n = 0; n <= NMAX; n++)
		{
			odds[n] = new int [n+1];//再为每行定义各自的长度
		}
		
		//fills triangular array
		for(int n = 0; n < odds.length; n++)//返回行数
			for(int k = 0; k < odds[n].length; k++)//返回每行的长度
			{
				int lotteryOdds = 1;
				for(int i = 1; i <= k; i++)
					lotteryOdds = lotteryOdds * (n - i + 1)/i;
				odds[n][k] = lotteryOdds;
			}
		
		//print triangular array
		//输出二维数组时，外层for each用数组保存各行的首地址
		for(int[] row: odds)
		{
			for(int odd : row)//内层for each输出各行的数据
				System.out.printf("%4d",odd);
			System.out.println();
		}
	}
}
