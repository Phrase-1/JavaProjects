import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarOfYear {
	public static void main(String[] args)
	{
		//LocalDate day = LocalDate.of(1998, 11, 28);
		//System.out.println(day);
		LocalDate date = LocalDate.of(2019, 1,1);

		//System.out.println("value:"+value);
		System.out.println(date.getYear()+"年日历");
		for(int j = 1;j < 13;j ++)
		{
			int month = date.getMonthValue();
			int today = date.getDayOfMonth();
			
			date = date.minusDays(today - 1);//date 重置为1
			DayOfWeek weekday = date.getDayOfWeek();
			today = date.getDayOfMonth();//today = 1,每次循环开始时today会被置1
			int value = weekday.getValue();//value 为星期几
			
			System.out.println(date.getMonthValue()+"月");
			System.out.println("  MON TUE WEN THU FRI SAT SUN");
			//System.out.println(value);
			for(int i = 0;i < value;i++)
				System.out.print("   ");
			while(date.getDayOfMonth() == today)//参考课本
			{	
			
				if(date.getDayOfWeek().getValue() == 1)//若为星期一则换行，参考课本
					System.out.println();
				System.out.printf("%4d",date.getDayOfMonth());
				date = date.plusDays(1);//date指向下一天，到月末时date自动变为下一月
				today += 1;
				value++;
			}
			System.out.println();
			//date = date.plusMonths(1);
		}
	}
}
