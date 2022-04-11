package day4_StaticVariableOrMethod;

public class StaticMethod {
	int id;
    String name;
   static String cname="IBM";
   
   static void input()              //Declare static method
   {
	   StaticMethod d=new StaticMethod();  //local variable initialization that time create obj. first
	   
	   d.id=123;          //do not accept local variable in static method first create static object then access 
	   d.name="Abhi";
	   d.showDetails();
	   
   }
   void showDetails()
   {
 	  System.out.println("id="+id+"  "+"Name="+name+" "+"Company name="+cname );
	}
   
	public static void main(String[] args) {
		
		
		input();            //Static method -> do not object is compulsory
		
		
		
	}

}
