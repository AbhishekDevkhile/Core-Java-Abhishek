package Day2;
import java.util.Scanner;

public class if_else_Gross_salary_calculation {

	public static void main(String[] args) {
		System.out.println("Calculate its Gross salary.");
		 
		  Scanner scan=new Scanner(System.in);

		  System.out.println("Enter Basic Salary Of Employee: ");
		  float salary=scan.nextFloat();

		
		  double da, hra, GP=0;
		  
		  if ( salary <= 100000) 
		    {
			  da = (salary * 0.8)/100 ;
			  hra = ( salary * 0.2)/100;
			  GP = salary + da + hra;
			  System.out.println("Gross Salary Of Employee: "+GP);
  		  }
		  else if ( salary <= 200000) 
		    {
			  da = (salary * 0.9) / 100;
			  hra = ( salary * 0.25) / 100;
			  GP = salary + da + hra;
			  System.out.println("Gross Salary Of Employee: "+GP);
		    }
		  else if (salary > 200000) 
		    {
			  da = (salary * 0.95) / 100;
			  hra = ( salary * 0.30) / 100;
			  GP = salary + da + hra;
			  System.out.println("Gross Salary Of Employee: "+GP);
		  }
		  else
			  System.out.println("Invalid salary");
			  
 
	}

}
