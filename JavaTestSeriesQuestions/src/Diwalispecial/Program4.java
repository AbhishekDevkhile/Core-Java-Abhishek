package Diwalispecial;
/*4.	Create Person class with age, name,AdharNo. Create array of Person type objects with    
 * size 100.Person class has method  to accept values for each object by accepting it from user.
 *  It also has method to display all records.
-1.Write a method in Person class to arrange a records in array by AdharNo  in ascending order.
-2.Write a method in Person class to arrange a records in array by name  in descending order.
-3.Write another class Application and see person array sorted by name and AdharNo.
*/
import java.util.Scanner;

class Person1
{
	int age;
	String name;
	int Adharnum;
	Person1(int age,String nm,int adhrnum)
	{
		this.age=age;
		this.name=nm;
		this.Adharnum=adhrnum;
	}
	void DisplayDetails()
	{
		System.out.println(name+" "+age+"  "+Adharnum);
	}
	//1.Sort by Adharnum
	static void sortAdhar(Person1 p[])
	{
		System.out.println("Before Sorting:");
		for(Person1 p1:p)
		{
			p1.DisplayDetails();
		}
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].Adharnum>p[j].Adharnum)
				{
					Person1 temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		System.out.println("Display After Sorting:");
		for(Person1 p1:p)
		{
			p1.DisplayDetails();
		}
	}
	//2.Sort by Name
	static void sortName(Person1 p[])
	{
		System.out.println("Before Sorting:");
		for(Person1 p1:p)
		{
			p1.DisplayDetails();
		}
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].name.compareToIgnoreCase(p[j].name)<0)
				{
					if(p[i].Adharnum>p[j].Adharnum)
					{
						Person1 temp=p[i];
						p[i]=p[j];
						p[j]=temp;
					}
				}
			}
		}
		System.out.println("Display After Sorting(using Name):");
		for(Person1 p1:p)
		{
			p1.DisplayDetails();
		}
	}
	//3.if Name is same then Sort by aadhar number
	static void sortNameOrAdhar(Person1 p[])
	{
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].name.compareToIgnoreCase(p[j].name)==0)
				{
					if(p[i].Adharnum>p[j].Adharnum)
					{
						Person1 temp=p[i];
						p[i]=p[j];
						p[j]=temp;
					}
				}
			}
		}
		System.out.println("Display After Sorting(if Name is same then Sort by aadhar number):");
		for(Person1 p1:p)
		{
			p1.DisplayDetails();
		}
	}
	
}
public class Program4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Person1 p[]=new Person1[3];
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter age:");
			int ag=sc.nextInt();
			System.out.println("Enter Name:");
			String nm=sc.next();
			System.out.println("Enter Aabhar number:");
			int Adrnum=sc.nextInt();
			
			p[i]=new Person1(ag,nm,Adrnum);
		}
		
//		for(int i=0;i<p.length;i++)
//		{
//			p[i].DisplayDetails();
//		}
	
		
		Person1.sortAdhar(p);
		
		Person1.sortName(p);
	
		Person1.sortNameOrAdhar(p);

	}

}
