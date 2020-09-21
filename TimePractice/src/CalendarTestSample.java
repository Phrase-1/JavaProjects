import java.time.*;
public class CalendarTestSample {
	public static void main(String[] args)
	{
		LocalDate Date = LocalDate.now();
		//System.out.println(Date);
		int month = Date.getMonthValue();
		int today = Date.getDayOfMonth();
		
		Date = Date.minusDays(today - 1);
		DayOfWeek weekday = Date.getDayOfWeek();
		int value = weekday.getValue();
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i = 1; i<value; i++)
		{
			System.out.print("    ");
		}
		
		while(Date.getMonthValue() == month)
		{
			System.out.printf("%3d",Date.getDayOfMonth());
			if(Date.getDayOfMonth() == today)
				System.out.print("*");
			else 
				System.out.print(" ");
			Date = Date.plusDays(1);
			if(Date.getDayOfWeek().getValue() == 1) System.out.println();
			
		}
		if(Date.getDayOfWeek().getValue() != 1) System.out.println();
	}
}
