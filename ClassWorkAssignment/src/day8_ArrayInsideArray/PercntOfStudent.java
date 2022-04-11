package day8_ArrayInsideArray;
/*print above 60 % marks  
 * */
import java.util.Arrays;
import java.util.Scanner;

public class PercntOfStudent {
	int id;
	String name;
	int marks[];
	
	PercntOfStudent(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	void display()
	{
		System.out.println("Marks above 60%:");
		System.out.println(id+"  "+name);
		for(int x:marks)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
	
		PercntOfStudent s[]=new PercntOfStudent[2];
		
//		int mk[]= {45,67,78};
//		int mk2[]= {34,56,34};
//		s[0]=new Stud(1,"amit",mk);
//		s[1]=new Stud(2,"Yash",mk2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details::");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String nm=sc.next();
			System.out.println("enter marks");
			int marks[]=new int[3];
			for(int j=0;j<marks.length;j++)
			{
				int x=sc.nextInt();
				marks[j]=x;
				
			}
			
			PercntOfStudent st=new PercntOfStudent(id,nm,marks);
			
			s[i]=st;
		
		}
		
		for(int i=0;i<s.length;i++)
		{
			int sum=0;
			int mk[]=s[i].marks;
			for(int y:s[i].marks)
			{
				sum=sum+y;
				
			}
			int per=sum/mk.length;
			if(per>60)
			{
				s[i].display();
			}
		}
		

	}

}

