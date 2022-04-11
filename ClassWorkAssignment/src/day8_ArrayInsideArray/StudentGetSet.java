package day8_ArrayInsideArray;
/*Array inside array Using Getter Setter*/


import java.util.Scanner;

import day8_ArrayOfObject.CarGetSet;

public class StudentGetSet 
{
	int sid;
	String sname;
	int smark[];
	public void setId(int id)
	{
		this.sid=id;
	}
	public void setName(String nm)
	{
		this.sname=nm;
	}
	public void setMark(int mrk[])
	{
		this.smark=mrk;
	}
	public int getId()
	{
		return sid;
	}
    public String getName()
    {
    	return sname;
    }
    public int[] getMark()
    {
    	return smark;
    }

	public static void main(String[] args) 
	{
		StudentGetSet s[]=new StudentGetSet[2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Detailss:");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String nm=sc.next();
			System.out.println("Enter Student marks: ");
			int marks[]=new int[3];                          
			for(int j=0;j<marks.length;j++)        
			{	
				marks[j]=sc.nextInt();                         			             
			}
			
			StudentGetSet p=new StudentGetSet();
			p.setId(id);
			p.setName(nm);
			p.setMark(marks);
		
			s[i]=p;
		}
		
		for(int j=0;j<s.length;j++)
		{
			System.out.println("  " +s[j].getId());
			System.out.println("  "+s[j].getName());
			for(int x:s[j].getMark())
			{
				System.out.println(x);
			
		    }
		}
		

	}

}
