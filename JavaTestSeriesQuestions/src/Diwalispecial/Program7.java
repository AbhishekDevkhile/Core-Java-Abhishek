package Diwalispecial;

import java.util.Scanner;

/*7.	Write a java program to create a array of 3 person .Take input or
hardcode  for all  three person from console. Person class is as follows 
 Person (int id, String name, Vehicle v[] )
 Vehicle (int vid, String vname) 
*/
class Vehicle
{
	int vid;
	String vname;
	Vehicle(int vid,String vname)
	{
		this.vid=vid;
		this.vname=vname;
	}
	void DisplayVehicleDetails()
	{
		System.out.println("Vehicle id:"+vid+"  "+"Vehicle name:"+vname);
	}
}
class Person
{
	int id;
	String name;
	Vehicle v[];
	
	Person(int id,String nm,Vehicle vcl[])
	{
		this.id=id;
		this.name=nm;
		this.v=vcl;
	}
	void DisplayPersonDetails()
	{
		System.out.println("Person id:"+id+" "+"Person name:"+name);
	for(int i=0;i<v.length;i++)
	{
		v[i].DisplayVehicleDetails();
	}
	}
}
public class Program7 
{

	public static void main(String[] args)
	{
		Person p[]=new Person[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Person id:");
			int pid=sc.nextInt();
			System.out.println("Person name:");
			String pnm=sc.next();
			
			Vehicle v[]=new Vehicle[2];
			for(int j=0;j<v.length;j++)
			{
				System.out.println("Vehicle id:");
				int vid=sc.nextInt();
				System.out.println("Vehicle name:");
				String vnm=sc.next();
				
				v[j]=new Vehicle(vid,vnm);
			}
			p[i]=new Person(pid,pnm,v);
		}
		
		System.out.println("Display All Details:");
		for(int i=0;i<p.length;i++)
		{
			p[i].DisplayPersonDetails();
		}

	}

}
