import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarOfYear {
	public static void main(String[] args)
	{
		//LocalDate day = LocalDate.of(1998, 11, 28);
		//System.out.println(day);
		LocalDate date = LocalDate.of(2019, 1,1);

		//System.out.println("value:"+value);
		System.out.println(date.getYear()+"������");
		for(int j = 1;j < 13;j ++)
		{
			int month = date.getMonthValue();
			int today = date.getDayOfMonth();
			
			date = date.minusDays(today - 1);//date ����Ϊ1
			DayOfWeek weekday = date.getDayOfWeek();
			today = date.getDayOfMonth();//today = 1,ÿ��ѭ����ʼʱtoday�ᱻ��1
			int value = weekday.getValue();//value Ϊ���ڼ�
			
			System.out.println(date.getMonthValue()+"��");
			System.out.println("  MON TUE WEN THU FRI SAT SUN");
			//System.out.println(value);
			for(int i = 0;i < value;i++)
				System.out.print("   ");
			while(date.getDayOfMonth() == today)//�ο��α�
			{	
			
				if(date.getDayOfWeek().getValue() == 1)//��Ϊ����һ���У��ο��α�
					System.out.println();
				System.out.printf("%4d",date.getDayOfMonth());
				date = date.plusDays(1);//dateָ����һ�죬����ĩʱdate�Զ���Ϊ��һ��
				today += 1;
				value++;
			}
			System.out.println();
			//date = date.plusMonths(1);
		}
	}
}
