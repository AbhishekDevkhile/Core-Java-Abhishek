package Day11_Enum;

import Day11_Enum.WeekDays.Days;

/*What will be the output of the following program?*/

class WeekDays 
{ 
	public enum Days 
	{ 
		MON, TUE, WED, THU, FRI, SAT 
    }
}
public class Program12 {


	public static void main(String[] args) 
	{
		for (Days d : Days.values())
		{
			
			Days[] d2 = Days.values();
			System.out.println(d2[2]);
		}

	}

}
