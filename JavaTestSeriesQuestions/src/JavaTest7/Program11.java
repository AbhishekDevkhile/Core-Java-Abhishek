package JavaTest7;
/*11) A Pen contains variables Refill, capLength and brand. Refill has variables
inkColor, length and Nib (tip). Nib has variables materialType and width. Create
a Java class structure for above. Write a main method which sets values in all the variables
using setter methods and prints all the variables using getter methods. (consider getter,setter are present in all classes only write main method)	
*/


class Nib
{
	String matType;
	float matWidth;
	public void setmatType(String type)
	{
		this.matType=type;
	}
	public void setmatWidth(float width)
	{
		this.matWidth=width;
	}
	public String getmatType()
	{
		return matType;
	}
	public float getmatWidth()
	{
		return matWidth;
	}
	}
class Refill
{
	String inkColor;
	int length;
	Nib nb;
	public void setinkColor(String color)
	{
		this.inkColor=color;
	}
	public void setlength(int len)
	{
		this.length=len;
	}
	public void setNib(Nib nb)
	{
		this.nb=nb;
	}
	public String getinkColor()
	{
		return inkColor;
	}
	public int getlength()
	{
		return length;
	}
	public Nib getNib()
	{
		return nb;
	}
	
	
	}
class Pen 
{
	Refill rfl;
	float caplength;
	String Brand;
	public void setRefill(Refill rfl)
	{
		this.rfl=rfl;
	}
	public void setcaplength(float len )
	{
		this.caplength=len;
	}
	public void setBrand(String bnd)
	{
		this.Brand=bnd;
	}
	public Refill getrfl()
	{
		return rfl;
	}
	public float getcaplength()
	{
		return caplength;
	}
	public String getBrand()
	{
		return Brand;
	}
}
public class Program11 {

	public static void main(String[] args)
    {
		Nib n=new Nib();
		n.setmatType("High");
		n.setmatWidth(0.5f);
		
		Refill r=new Refill();
		r.setinkColor("Black");
		r.setlength(123);
		r.setNib(n);
		
		Pen p=new Pen();
		p.setcaplength(123.2f);
		p.setBrand("Rorito");
		p.setRefill(r);
	
		System.out.println(p.getBrand()+" "+p.getcaplength());
		System.out.println(r.getinkColor()+" "+r.getlength());
		System.out.println(n.getmatType()+" "+n.getmatWidth());

		

	}

}
