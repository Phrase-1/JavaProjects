import java.time.*;
public class CalendarTest {
	public static void main(String[] args)
	{
		//LocalDate day = LocalDate.of(1998, 11, 28);
		//System.out.println(day);
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);
		DayOfWeek weekday = date.getDayOfWeek();
		today = date.getDayOfMonth();
		int value = weekday.getValue();
		//System.out.println("value:"+value);
		//System.out.println(date.getYear()+"年日历");
		//for(int j = 1;j < 13;j ++)
		//{
			System.out.println(date.getMonthValue()+"月");
			System.out.println("MON TUE WEN THU FRI SAT SUN");
			//System.out.println(value);
			for(int i = 1;i < value;i++)
				System.out.print("    ");
			while(date.getDayOfMonth() == today)
			{	
			
				if(date.getDayOfWeek().getValue() == 1)
					System.out.println();
				System.out.printf("%4d",date.getDayOfMonth());
				date = date.plusDays(1);
				today += 1;
				value++;
			}
		//	date = date.plusMonths(1);
		//}


	
	}
}
