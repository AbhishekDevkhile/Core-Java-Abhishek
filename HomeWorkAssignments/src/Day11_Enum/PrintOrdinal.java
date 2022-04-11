package Day11_Enum;
/*Create enum Days with all 7 days. Write a java program to display all values and its 
 indexes of enum Days. Show use of values and ordinal methods. Create enum Days with 
 all 7 days. Write a java program to display all values and its indexes of enum Days.
  Show use of values and ordinal methods.*/


public enum PrintOrdinal 
{	
		Sunday,Monday,Tuesday,Wednesday,thursday,Friday,Saturday;

public static void main(String[] args) 
{
	for(PrintOrdinal d:PrintOrdinal.values())
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