package Day11_Enum_Methods;
// Create Enum for Days (Outside of class)


import Day11_Enum_Methods.EnumForDays.Days;


//enum declare outside of class and  access in another (Days_of_week) class


public class Days_of_Week 
{

	public static void main(String[] args) 
	{
        Days today = Days.Friday;
		
	    Days holiday = Days.Sunday;
	    System.out.println("Today = " + today);
	    System.out.println(holiday+ " is holiday");
		

	}

}
