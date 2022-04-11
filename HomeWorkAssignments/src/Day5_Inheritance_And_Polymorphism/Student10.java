package Day5_Inheritance_And_Polymorphism;
/*10. Create class Student (id, name) then create 2 objects of 
 Student using new keyword. Print 2 objects and see its hashcode
 is different E.g. tudent@15db9742 and Student@2329742. 
 If you do this Student s1 = new Student (); 
 Student s2 = s1; 
 Now print s1 and s2 see both reference variables are pointing 
 to same location now override the toString () method in student 
 class and see the beautiful output.*/
public class Student10 {
	int id;
	String name;
	Student10(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	
	public static void main(String[] args) {
		Student10 s1=new Student10(123,"Abhishek");
		
		Student10 s2=new Student10(456,"Devkhile");

		System.out.println("Hash code::"+s1);
		System.out.println("Hash code::"+s2);
		
		
		/*If you do this Student s1 = new Student (); Student s2 = s1; 
		  Now print s1 and s2 see both reference variables are pointing 
		  to same location*/
		/*
		Student10 s1=new Student10(123,"Abhishek");
		Student10 s2=s1;

		System.out.println("Hash code::"+s2);
	      */
	}

}
