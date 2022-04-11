package day4_Types_of_method;

import java.util.Scanner;

public class Bank {
	int bankId;
	String bankName;
	String custName;
	double accountNo;
	float accountBalence;
	int depositBalence;
	
	
	
	
	
	public void acceptDetails(int BI,String BN,String CN,double AN,float AB)
	{
		bankId = BI;
		bankName=BN;
		custName=CN;
		accountNo=AN;
		accountBalence=AB;
		
	}
	
	void displayDetails()
	{
		System.out.println("Bank id is :"+bankId);
		System.out.println("Bank name is :"+bankName);
		System.out.println("Customer name is :"+custName);
		System.out.println("Account name is:"+accountNo);
		System.out.println("Balence is:"+accountBalence);
		
	}
	
	void DepositBalence(int depositBalence)
	{
		accountBalence=accountBalence+depositBalence;
		//System.out.println(accountBalence);
	}
	
	void withdrawal(int withdrawal)
	{
		accountBalence=accountBalence-withdrawal;
	}
	
	void checkBalence()
	{
		System.out.println("Current balence is :"+accountBalence);
		
	} 
 
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Deposite Amount :");
		int depositBalence=sc.nextInt();
		
		System.out.println("Enter Withdrawal Amount :");
		int b=sc.nextInt();
		
		
		Bank bank = new Bank();
		bank.acceptDetails(123,"HDFC","Abhi",123456,500f);
		bank.displayDetails();
		
		
		/*System.out.println();
		System.out.println("Next details :");
		Bank bank2 = new Bank();
		bank2.acceptDetails(456,"SBI","Abhishek",456789,100f);
		bank2.displayDetails();*/
		
		
		bank.DepositBalence(depositBalence);
		bank.checkBalence();
		
 		bank.withdrawal(b);
 		bank.checkBalence();
 		
 		sc.close();
	}

}
