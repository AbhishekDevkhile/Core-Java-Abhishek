package Day11_Enum_Methods;

public class PrintOrdinal 
{
	enum Days
	{
		Sunday,Monday,Tuesday,Wednesday,thursday,Friday,Saturday;
	}

	public static void main(String[] args) 
	{
		for(Days d:Days.values())
		{
			System.out.println(d.ordinal());
		}
		
		//OR
		/*
		System.out.println(Days.valueOf("Sunday").ordinal());
		System.out.println(Days.valueOf("Monday").ordinal());
		System.out.println(Days.valueOf("Tuesday").ordinal());
		System.out.println(Days.valueOf("Wednesday").ordinal());
		System.out.println(Days.valueOf("thursday").ordinal());
		System.out.println(Days.valueOf("Friday").ordinal());
		System.out.println(Days.valueOf("Saturday").ordinal());
		*/
		
		
		

	}

}
