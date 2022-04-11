package Day13_ComparableAndComparatorInterface;


import java.util.Collections;
import java.util.LinkedList;

/*Write Customer with custId,custMobile,custName . WAP to add elements to LinkedList which
  should accept Customer type objects only.Sort LinkedList  by custName in ascending order,if custNames are same then sort that objects
 further by custId in descending order.*/


class Cust implements Comparable<Cust>
{
	int cid;
	int cmobileno;
	String cname;
	public Cust(int cid, int cmobileno, String cname) {
		super();
		this.cid = cid;
		this.cmobileno = cmobileno;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Cust [cid=" + cid + ", cmobileno=" + cmobileno + ", cname=" + cname + "]";
	}
	
	//Generic comparable
	
	
	@Override
	public int compareTo(Cust o) {
		if(this.cname.compareTo(o.cname)>0)
		{
			return 1;
		}
		else if(this.cname.compareTo(o.cname)<0)
		{
			return -1;
		}
		else
		{
			if(o.cid>this.cid)
			{
				return 1;
			}
			else if(o.cid<this.cid)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}	
	}	
}


public class Program11 {

	public static void main(String[] args) {
		LinkedList<Cust> ll = new LinkedList();
		ll.add(new Cust(101,9856,"Abhishek"));
		ll.add(new Cust(105,1122,"Chaitanya"));
		ll.add(new Cust(104,7876,"Siddhant"));
		ll.add(new Cust(103,6677,"Nainesh"));
		ll.add(new Cust(106,9911,"Abhishek"));
		ll.add(new Cust(102,9580,"Nikhil"));
		ll.add(new Cust(109,1122,"Chaitanya"));
		
		Collections.sort(ll);
		System.out.println(ll);
		
		

	}

}
