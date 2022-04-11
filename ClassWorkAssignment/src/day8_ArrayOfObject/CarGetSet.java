 package day8_ArrayOfObject;
/*create array of car it contains cid,cname,cprice,and display only those car
 which price is greater than one lakh .Use getter setter method
  */
import java.util.Scanner;

public class CarGetSet 
{	
	int cid;
	String cname;
	double cprice;
	public void setId(int id)
	{
		this.cid=id;
	}
	public void setName(String nm)
	{
		this.cname=nm;
	}
	public void setPrice(int pri)
	{
		this.cprice=pri;
	}
	public int getId()
	{
		return cid;
	}
    public String getName()
    {
    	return cname;
    }
    public double getPrice()
    {
    	return cprice;
    }

	public static void main(String[] args) {
		CarGetSet c[]=new CarGetSet[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter car id");
			int id=sc.nextInt();
			System.out.println("Enter car name");
			String nm=sc.next();
			System.out.println("Enter car price");
			int pri=sc.nextInt();
			
			CarGetSet p=new CarGetSet();
			p.setId(id);
			p.setName(nm);
			p.setPrice(pri);
		
			c[i]=p;
		}
		
		System.out.println("Display only those car price is > 100000::");
		for(int i=0;i<c.length;i++)
		{
			if(c[i].cprice>100000)
			{
			System.out.println("Car id::"+c[i].getId());
			System.out.println("Car name::"+c[i].getName());
			System.out.println("car price::"+c[i].getPrice());
			}
			System.out.println("__________________");
		}

	}

}
