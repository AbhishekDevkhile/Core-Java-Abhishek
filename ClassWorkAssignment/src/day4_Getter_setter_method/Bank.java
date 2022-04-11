 package day4_Getter_setter_method;

public class Bank {
	
	private int bankid;
	private String bankname;
	private double accno;
	private float bankbalence;
	
	public void setbankId(int bankid)
	{
		this.bankid=bankid;
	}
	public void setbankName(String bankname)
	{
		this.bankname=bankname;
	}
	public void setaccNo(double accno)
	{
		this.accno=accno;
	}
	public void setbankBalence(float bankbalence)
	{
		/*if(bankbalence<3000)
		{
			System.out.println("Balence is less than 3000");
		}
		else 
		{
		    this.bankbalence=bankbalence;
		}*/
		this.bankbalence=bankbalence;
	}
	
	
	public int getbankId()
	{
		return bankid;
	}
	public String getbankName()
	{
		return bankname;
	}
	public double getaccNo()
	{
		return accno;
	}
	public float getbankBalence()
	{
		return bankbalence;
	}

}
