package day5_Containment;
// containment of 3 class using Getter Setter

class Address2
{
	String city;
	
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	
}

class Student1
{
	int sid;
	String sname;
	Address2 adr;
	
	public void setsId(int sid)
	{
		this.sid=sid;
	}
	public void setsName(String sname)
	{
		this.sname=sname;
	}
	public void setAddress2(Address2 adr)
	{
		this.adr=adr;
	}
	
	public int getsId()
	{
		return sid;
	}
	public String getsName()
	{
		return sname;
	}
	public Address2 getAddress2()
	{
		return adr;
	}
}

public class Course_getset
{
	int cid;
	String cname;
	Student1 std;
	public void setId(int cid)
	{
		this.cid=cid;
	}
	public void setcName(String cname)
	{
		this.cname=cname;
	}
	public void setStudent1(Student1 std)
	{
		this.std=std;
	}
	public int getcId()
	{
		return cid;
	}
	public String getcName()
	{
		return cname;
	}
	public Student1 getStudent1()
	{
		return std;
	}

	public static void main(String[] args) {
		
		Address2 a=new Address2();
		a.setCity("Pune");

		Student1 s=new Student1();
		s.setsId(101);
		s.setsName("Abhi");
		s.setAddress2(a);
		
		Course_getset c=new Course_getset();
		c.setId(101);
		c.setcName("Java");
		c.setStudent1(s);
		
		System.out.println(s.getsId()+" "+s.getsName());
		s.setAddress2(a);
		System.out.println(a.getCity());
		System.out.println(c.getcId()+" "+c.getcName());
		c.setStudent1(s);
	}

}
