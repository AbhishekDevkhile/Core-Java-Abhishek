package Day8_2DArray;

import java.util.Scanner;

/*4. Create an array of Theatre to maintain data in sorted order of Movie Rating
Theatre (Theatreid, Theatrename, location, Movie)
Movie (Movieid, Moviename, Rating).*/

class Movie
{
	int Movieid;
	String Moviename;
	int Rating;
	
	Movie(int mid,String mname,int mrate)
	{
		this.Movieid=mid;
		this.Moviename=mname;
		this.Rating=mrate;
	}
	void DisplayMovieDetails()
	{
		System.out.println("Movie id:"+Movieid+" "+"Movie name:"+Moviename+" "+"Movie Rating:"+Rating);
	}
}

class Theater
{
	int Theatreid;
	String Theatrename;
	String location;
	Movie m;
	Theater(int tid,String tname,String loc,Movie m)
	{
		this.Theatreid=tid;
		this.Theatrename=tname;
		this.location=loc;
		this.m=m;
		
	}
	void DisplayTheaterDetails()
	{
		
		System.out.println("Theater id:"+Theatreid+" "+"Theater name:"+Theatrename+" "+"Location is:"+location);
        m.DisplayMovieDetails();	
	}
}
public class Program4 
{
	public static void main(String[] args) 
	{
		Theater t[]=new Theater[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println("Theater id");
			int tid=sc.nextInt();
			System.out.println("Theater name:");
			String tnm=sc.next();
			System.out.println("Theater location:");
			String lo=sc.next();
			System.out.println("Movie id :");
			int id=sc.nextInt();
			System.out.println("Movie name:");
			String mnm=sc.next();
			System.out.println("Movie Rating:");
			int rt=sc.nextInt();
			
			t[i]=new Theater(tid,tnm,lo,new Movie(id,mnm,rt));
		}
		for(int i=0;i<t.length;i++)
		{
			System.out.println("Display Details:");
			t[i].DisplayTheaterDetails();
		}
	}

}
