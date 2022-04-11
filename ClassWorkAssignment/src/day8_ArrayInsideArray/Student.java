package day8_ArrayInsideArray;


/*Array inside Array Demo  Without display method */

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	int marks[];
	
	Student(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	

	public static void main(String[] args) {
	
		Student s[]=new Student[2];              //create student Array
		
		//Hardcoded value
//		int mk[]= {45,67,78};
//		int mk2[]= {34,56,34};
//		s[0]=new Student(1,"amit",mk);
//		s[1]=new Student(2,"Yash",mk2);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details::");
		for(int i=0;i<s.length;i++)                                //input Student details Access Array
		{
			
			System.out.println("enter id::");
			int id=sc.nextInt();
			System.out.println("enter name::");
			String nm=sc.next();
			
			
			System.out.println("enter Student 3 subjet marks::");   
			
			int marks[]=new int[3];                          //create marks Array of 3 student
			for(int j=0;j<marks.length;j++)                  //input marks details Array
			{
				
				int x=sc.nextInt();                         //Give input of marks and store in x variable
				marks[j]=x;                                 //Marks Assign marks[j]
			
				    //OR
				  
	//		    marks[j]=sc.nextInt();                    // give input and  assign array
			}
			
			Student st=new Student(id,nm,marks);         //create Student Object 
			s[i]=st;                                     //object value Assign Array
			                 
			                  //OR
			
			
			//s[i]=new Stud(id,nm,marks);            //anonomous Object
			
		}
		
		//display without display method	
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Student id:"+s[i].id+" "+"Student name:"+s[i].name);
			
			//method 1:marks display using Array 
//			int mk[]=s[i].marks;             //create marks[] array and store marks inside array
//			for(int x:mk)                     //display array using foreach loop
//			{
//				System.out.println(x);
//			}
			
			            //OR
			              
			//method 2:
			for(int x:s[i].marks)
			{
				System.out.println(x);
			
		    }
                           //OR 
			
		/*	//method 3:using toString method
		
			System.out.println(Arrays.toString(s[i].marks));
		*/   
			
		
		
		
		}
	}
}
