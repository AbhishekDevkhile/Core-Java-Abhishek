package day4_StaticVariableOrMethod;

public class StaticVariable {
	int id;
    String name;
   static String cname="IBM";  //Static variable
   
   void acceptdetails()
   {
	  id=123;
	  name="Abhi";
	  
   }
   void acceptdetails1()
   {
	   id=456;
	   name="Abhishek";
   }
     
    void showDetails()
    {
  	  System.out.println("id="+id+  "Name="+name  + "Company name="+cname );
  	  
    }

	public static void main(String[] args) {
		StaticVariable s=new StaticVariable();
		
		s.acceptdetails();
		s.showDetails();
		
		s.acceptdetails1();
		s.showDetails();
		
		System.out.println(cname);  //Static variable access in anywhere
      

	}

}
