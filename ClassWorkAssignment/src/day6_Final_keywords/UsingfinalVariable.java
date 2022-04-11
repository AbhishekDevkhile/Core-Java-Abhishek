package day6_Final_keywords;

class Animal            
{
	final int did=123;        //final variable
	String dname;
public void Animal(String n)      
 	{
//	did=5000;         //The final field Animal.did cannot be assigned
	dname=n;
	}
public String toString()
	{
	
	String str="Animal id="+did+" "+"Animal name="+dname;
	return str;
	}
	}
public class UsingfinalVariable {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.Animal("pitbull");
		System.out.println(a);

	}

}
