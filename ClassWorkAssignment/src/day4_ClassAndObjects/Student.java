package day4_ClassAndObjects;

import java.util.Scanner;

public class Student {
	
	int studId;
	String studName;
	int marks,m1,m2,m3;
	int percentage;
	String grade;
	Scanner sc = new Scanner(System.in);
	
	void acceptDetails()
	{
		System.out.println("Enter Student ID :");
		studId=sc.nextInt();
		System.out.println("Enter Student Name :");
		studName=sc.next();
		/*System.out.println("Enter Student M1 marks:");
		m1=sc.nextInt();
		System.out.println("Enter Student M2 marks :");
		m2=sc.nextInt();
		System.out.println("Enter Student M3 marks :");
		m3=sc.nextInt();
	*/
	}
	void percentageCalculate()
	{
		System.out.println("Enter Student M1 marks:");
		m1=sc.nextInt();
		System.out.println("Enter Student M2 marks :");
		m2=sc.nextInt();
		System.out.println("Enter Student M3 marks :");
		m3=sc.nextInt();
		
	    percentage=((m1+m2+m3)*100)/300;
		//System.out.println(percentage);

		if(percentage>=80 && percentage<=100) 
		{
			//System.out.println("Grade:-First Class");
			grade="A+ grade";
	    }
		else if(percentage>=60 && percentage<80) 
		{
			//System.out.println("Grade:-Second Class");
			grade="B grade";
		}
		else if(percentage>=35 && percentage<60) 
		{
			//System.out.println("Grade:-Third Class");
			grade="C grade";
		}
		else if(percentage>=0 && percentage<35)
		{
			System.out.println("failed");
		}
		else
		{
			System.out.println("invalid");
		}
		
		
	}
	void showDetails()
	{
		System.out.println("Student ID is :"+studId);
		System.out.println("Name of Student is :"+studName);
		System.out.println("Percntage is: "+percentage+ "%");
		System.out.println("Grade is :"+grade);

	}

	public static void main(String[] args) {
		
		
		Student stu =new Student();
		stu.acceptDetails();
		stu.percentageCalculate();
		stu.showDetails();
		
		/*System.out.println();
		System.out.println("Enter Second Student Details:");
		
		Student stu1 =new Student();
		stu1.acceptDetails();
		stu1.percentageCalculate();
		stu1.showDetails();*/



	}

}
