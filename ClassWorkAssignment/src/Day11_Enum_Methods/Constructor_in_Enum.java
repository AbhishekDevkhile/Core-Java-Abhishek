package Day11_Enum_Methods;
/*Create parameterized constructor in enum*/


public enum Constructor_in_Enum 
{
	Auto(900),tata(2),audi(50),Maruti(15),honda(12);
     int price;
	   
	   Constructor_in_Enum (int p)  //constructor
	   {
	      this.price = p;
	   }
	   
	   int getPrice() 
	   {
	      return price;
	   } 
	   
	   public static void main(String args[])
	   {
		   System.out.println("All car prices:");
		   for (Constructor_in_Enum c : Constructor_in_Enum.values()) 
		   {
			   System.out.println(c + " costs " + c.getPrice() + " thousand .");
		   }
     }
}
