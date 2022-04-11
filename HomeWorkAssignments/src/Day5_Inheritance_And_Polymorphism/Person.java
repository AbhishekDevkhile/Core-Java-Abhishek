package Day5_Inheritance_And_Polymorphism;
/*
 3. Create Person class with fields(id,name,job) where job is 
 another class with field(jobid,profile,joiningdate) where 
 joiningdate is another class with fields (day, month, year). 
 Display Person information. 
 (Note - Containment using constructor and getter/setter).
 */
class JoiningDate
{
	int day;
	int month;
	int year;
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
}
class Job
{
	int jobid;
	String profile;
	JoiningDate date;
	public void setjobId(int jobid)
	{
		this.jobid=jobid;
	}
	public void setProfile(String profile)
	{
		this.profile=profile;
	}
	public void setJoiningDate(JoiningDate date)
	{
		this.date=date;
	}
	public int getjobid()
	{
		return jobid;
	}
	public String getProfile()
	{
		return profile;
	}
	public JoiningDate getJoiningDate()
	{
		return date;
	}
}


public class Person 
{	
	int id;
	String name;
	Job job;
	public void setPid(int id)
	{
		this.id=id;
	}
	public void setPname(String name)
	{
		this.name=name;
	}
	public void setJob(Job job)
	{
		this.job=job;
	}
	public int getPid()
	{
		return id;
	}
	public String getPname()
	{
		return name;
	}
	public Job getJob()
	{
		return job;
	}

	public static void main(String[] args) 
	{
		JoiningDate d=new JoiningDate();
		d.setDay(14);
		d.setMonth(11);
		d.setYear(1997);
		
		Job j=new Job();
		j.setjobId(123);
		j.setProfile("Manager");
		j.setJoiningDate(d);
		

		Person p=new Person();
		p.setPid(11111);
		p.setPname("Employee");
		p.setJob(j);
		
		System.out.println(p.getPid()+" "+p.getPname());
		System.out.println(j.getjobid()+"  "+j.getProfile());
		System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());

	}
}
