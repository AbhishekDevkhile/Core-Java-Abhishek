package Day11_Enum_Methods;
/*
 * Create Enum for Days (inside of class)
 */
public class EnumForDays 
{
	enum Days 
	{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

	public static void main(String[] args) 
	{
		Days today = Days.Wednesday;
		
	    Days holiday = Days.Sunday;
	    System.out.println("Today = " + today);
	    System.out.println(holiday+ " is holiday");
		

	}

}
