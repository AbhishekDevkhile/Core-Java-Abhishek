package day8_ArrayOfObject;
/*create array of car it contains cid,cname,cprice,and display only those car
which price is greater than one lakh .
 */
import java.util.Scanner;

public class Car 
{
	int cid;
	String cname;
	double cprice;
	
	Car(int id,String name,double price)
	{
		this.cid=id;
		this.cname=name;
		this.cprice=price;
	}
	
	public String toString()
	{
		return "Car id::"+cid
		+"\nCar name::"+cname
		+"\nCar Price::"+cprice;
	}
	

	public static void main(String[] args) 
	{
		Car c[]=new Car[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter car id");
			int id=sc.nextInt();
			System.out.println("Enter car name");
			String nm=sc.next();
			System.out.println("Enter car price");
			int pri=sc.nextInt();
		
			c[i]=new Car(id,nm,pri);
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i].cprice>100000)
			{
				System.out.println(c[i]);
			}
			System.out.println("______________________");
		}
		
	}

}
