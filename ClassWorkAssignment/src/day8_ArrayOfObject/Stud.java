package day8_ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

public class Stud {
	int id;
	String name;
	int marks[];
	
	Stud(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	void display()
	{
//		System.out.println(id+"  "+name);
//		for(int x:marks)
//		{
//			System.out.println(x);
//		}
		
		
		System.out.println(id+" "+name+" "+Arrays.toString(marks));
	}

	public static void main(String[] args) {
	
		Stud s[]=new Stud[2];
//		int mk[]= {45,67,78};
//		int mk2[]= {34,56,34};
//		s[0]=new Stud(1,"amit",mk);
//		s[1]=new Stud(2,"Yash",mk2);
		Scanner sc=new Scanner(System.in);
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
			
			Stud st=new Stud(id,nm,marks);
			
			s[i]=st;
			//s[i]=new Stud(id,nm,marks);
			
		}
		
		
	/*display without display method	
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].id+" "+s[i].name);
//			int mk[]=s[i].marks;
//			for(int x:mk)
//			{
//				System.out.println(x);
//			}
			
//			for(int x:s[i].marks)
//			{
//				System.out.println(x);
//			}
			
			System.out.println(Arrays.toString(s[i].marks));
			
			
		} */
		
		
		
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
		

	}

}
