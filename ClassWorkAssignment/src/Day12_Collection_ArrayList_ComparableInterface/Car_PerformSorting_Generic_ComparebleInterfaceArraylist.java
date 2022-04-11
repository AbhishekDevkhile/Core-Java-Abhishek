package Day12_Collection_ArrayList_ComparableInterface;
/*Create Arraylist is of Car type .car has id,cname,cprice,ccolor.Sorting the car on the basic of
 carprice .If the carPrice is same then sort on the basic of carColor(Using Generic)*/
import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>
{
	int cId;
	String cName;
	int cPrice;
	String cColor;
	Car(int id,String nm,int pri,String col)
	{
		this.cId=id;
		this.cName=nm;
		this.cPrice=pri;
		this.cColor=col;
	}
	public String toString() 
	{
		return cId+" "+cName+" "+cPrice+" "+cColor;
	}
	//Logic:1
/*	@Override
	public int compareTo(Car o) 
	{
	
		if(this.cPrice>o.cPrice)                  //Sorting with carPrice 
		{
			return 1;
		}
		else if(this.cPrice<o.cPrice)
		{
			return -1;
		}
		else
		{
			if(this.cColor.compareTo(o.cColor)>0)            //if price is same then sorting color wise 
			{
				return 1;
			}
			else if(this.cColor.compareTo(o.cColor)<0)
			{
				return -1;
			}
			else
				return 0;
		}	
	
	
	}
	*/
	
	//Logic:2
	@Override
	public int compareTo(Car o) 
	{
		if(this.cPrice==o.cPrice)
		{
			return this.cColor.compareTo(o.cColor);
		}
		return this.cPrice-o.cPrice;
	}
	
	
}
public class Car_PerformSorting_Generic_ComparebleInterfaceArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList<Car> c=new ArrayList();
		c.add(new Car(111,"Nexon",568952,"Red."));
		c.add(new Car(112,"Celerio",568952,"Black."));
		c.add(new Car(113,"Baleno",674568,"Yellow."));
		c.add(new Car(114,"XUV700",220589,"White."));
		c.add(new Car(115,"Creta",118563,"Blue."));
		
		
		Collections.sort(c);

	}

}
