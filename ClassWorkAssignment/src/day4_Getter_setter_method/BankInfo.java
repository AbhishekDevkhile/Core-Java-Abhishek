package day4_Getter_setter_method;

import java.util.Scanner;

public class BankInfo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bankId:");
		int id=sc.nextInt();
        System.out.println("Enter Bank Name:");
        String name=sc.next();
        System.out.println("Enter Account number:");
        double no=sc.nextDouble();
        System.out.println("Enter bank balence");
        float bal=sc.nextFloat();
        
		Bank b=new Bank();
		
		b.setbankId(id);
		b.setbankName(name);
		b.setaccNo(no);
		b.setbankBalence(bal);
	
		if(b.getbankBalence()<3000)
		{
			System.out.println("Balence is less than 3000");
		}
		else 
		{
			System.out.println(b.getbankId());
			System.out.println(b.getbankName());
			System.out.println(b.getaccNo());
			System.out.println(b.getbankBalence());
		}
		//System.out.println(b.getbankId());
		//System.out.println(b.getbankName());
		//System.out.println(b.getaccNo());
		//System.out.println(b.getbankBalence());
		
		sc.close();
	}
}
