package Day12_Collection_ArrayList;
/*Create Arraylist of is student type which  contain id,name,address,marks.display above 60 marks
 the student how got more than 60 marks.*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Student
{
	int id;
	String name;
	String address;
	int marks;
	Student(int id,String nm,String add,int mrk)
	{
		this.id=id;
		this.name=nm;
		this.address=add;
		this.marks=mrk;
	}
	public String toString()
	{
		return id+"  "+name+"  "+address+"  "+marks;  
	}
	
}
public class DisplayStudentMarkAbove60 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList<Student> s2=new ArrayList();
		
		for(int i=0;i<=2;i++)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String nm=sc.next();
			System.out.println("Enter Address:");
			String add=sc.next();
			System.out.println("Enter marks:");
			int mrk=sc.nextInt();
			
			s2.add(new Student(id,nm,add,mrk));
		}
	/*	s.add(new Student(101,"Abhi","Pune",65));
		s.add(new Student(102,"Nainesh","Pune",58));
		s.add(new Student(103,"Chaitanya","Ahmednagar",89));
		s.add(new Student(104,"Nikhil","Mumbai",55));  */
		
		//1.using foreach loop
		System.out.println("Student details(marks>60):");
		for(Student x:s2)
		{
			if(x.marks>60)
			{
				System.out.println(x);
			}
		}
		
		//2.Using iterator
		System.out.println("Student details(marks>60)");
		Iterator<Student> itr=s2.iterator();
		while(itr.hasNext())
		{
			Student s1=itr.next();                  //store in student iterator
			if(s1.marks>60)
			{
				System.out.println(s1);
			}
			
		}
		

	}

}
