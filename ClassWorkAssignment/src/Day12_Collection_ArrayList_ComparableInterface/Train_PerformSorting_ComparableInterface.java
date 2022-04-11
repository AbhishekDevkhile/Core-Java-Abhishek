package Day12_Collection_ArrayList_ComparableInterface;
/*Create class is of train type,train has id,name,no. of seats.Sort the train in descending
 * order of no.of seats.if the no,of seats are same the sort in the basic of train name. */
import java.util.ArrayList;
import java.util.Collections;

class Train implements Comparable<Train>
{
	int trainId;
	String trainName;
	int noOfSeats;
	Train(int id,String nm,int seats)
	{
		this.trainId=id;
		this.trainName=nm;
		this.noOfSeats=seats;
	}
	public String toString()
	{
		return trainId+"  "+trainName+"  "+noOfSeats;
	}
	
	
	//Logic 1
	
	@Override
	public int compareTo(Train o) {
		if(this.noOfSeats>o.noOfSeats)                  
		{
			return -1;
		}
		else if(this.noOfSeats<o.noOfSeats)
		{
			return 1;
		}
		else
		{
			if(this.trainName.compareTo(o.trainName)>0)          
			{
				return -1;
			}
			else if(this.trainName.compareTo(o.trainName)<0)
			{
				return 1;
			}
			else
				return 0;
		}	
	
	}
	/*//logic:2
	@Override
	public int compareTo(Train o) 
	{
		if(this.noOfSeats==o.noOfSeats)                  
		{
			return o.trainName.compareTo(this.trainName);
			
		}
		else
		{
			return o.noOfSeats-this.noOfSeats;
		}
	}*/
	
}
public class Train_PerformSorting_ComparableInterface {

	public static void main(String[] args) 
	{
		ArrayList<Train> t= new ArrayList();
		t.add(new Train(1101,"Raipur Durg MEMU",5));
		t.add(new Train(1102,"Punjab Mail Special",3));
		t.add(new Train(1103,"	Kalindi Express",5));
		t.add(new Train(1104,"Ajanta Express",1));
		t.add(new Train(1105,"Ala Hazrat Express",10));
		
		Collections.sort(t);
		
		System.out.println(t);

	}

}
