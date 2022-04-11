package day5_Containment;

	class Order
	{
		int oid;
		String custname;
		String city;
	public void setoId(int oid)
	{
		this.oid=oid;
	}
	public void setcustName(String custname)
	{
		this.custname=custname;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	public int getoId()
	{
		return oid;
	}
	public String getcustName()
	{
		return custname;
	}
	public String getcity()
	{
		return city;
	}
	}
	class Mydate
	{
		int dd;
		int mm;
		int yy;
		
		public void setDD(int dd)
		{
			this.dd=dd;
		}
		public void setMM(int mm)
		{
			this.mm=mm;
		}
	    public void setYY(int yy)
	    {
	    	this.yy=yy;
	    }
	    public int getDD()
	    {
	    	return dd;
	    }
	    public int getMM()
	    {
	    	return mm;
	    }
	    public int getYY()
	    {
	    	return yy;
	    }
	}


public class Shipman {
	
	int sid;
	Order odr;
	Mydate  date;
	
	public void setsId(int sid)
	{
		this.sid=sid;
	}
	public void setOrder(Order odr)
	{
		this.odr=odr;
	}
	public void setMydate(Mydate date)
	{
		this.date=date;
	}
	public int getsId()
	{
		return sid;
	}
    public Order getOrder()
    {
    	return odr;
    }
    public Mydate getMydate()
    {
    	return date;
    }
	public static void main(String[] args) {
		Order o=new Order();
		o.setoId(101);
		o.setcustName("Ritu");
		o.setcity("Mumbai");
		
		Mydate m=new Mydate();
		m.setDD(10);
		m.setMM(10);
		m.setYY(2020);
		
		Shipman s=new Shipman();
		s.setsId(101);
		s.setOrder(o);
		s.setMydate(m);
		
		System.out.println(o.getoId()+"  "+o.getcustName()+"  "+o.getcity());
		System.out.println(m.getDD()+"/"+m.getMM()+"/"+m.getYY());
		System.out.println(s.getsId());
		}

}
