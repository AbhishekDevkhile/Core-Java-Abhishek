package Day3_ClassAndObject;

//Give the real time example of encapsulation with code.


public class Encapsulation {
	
	private int accno;           //Encapsulation ->  data hiding (Private)
	public String cname;
	
	public void setaccno(int accno)
	{
		this.accno=accno;
	}
	public void setcName(String cname)
	{
		this.cname=cname;
	}
	public int getaccno()
	{
		return accno;
	}
	public String getcName()
	{
		return cname;
	}

	public static void main(String[] args) {

		Encapsulation e=new Encapsulation();
		e.setaccno(778899);
		e.setcName("Abhishek");
		
		System.out.println("Account no="+e.getaccno());
		System.out.println("Account holder name="+e.getcName());
	}

}
