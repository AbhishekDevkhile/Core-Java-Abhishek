package Day13_ComparableAndComparatorInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;



/*Write Customer with custId,custMobile,custName . WAP to add elements to LinkedList which
  should accept Customer type objects only.Sort given Linkedlist by custId in ascending order .*/
class Customer1 implements Comparable
{
	int custId;
	int custMobile;
	String custName;
	public Customer1(int custId, int custMobile, String custName) {
		super();
		this.custId = custId;
		this.custMobile = custMobile;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer1 [custId=" + custId + ", custMobile=" + custMobile + ", custName=" + custName + "]";
	}
	
	//Non-Generic comparable
	
	
	@Override
	public int compareTo(Object o) {
		Customer1 s=(Customer1)o;         //casting Customer1 to object o   //Integer comparision
		if(this.custId>s.custId)         //compare using Ascii value
		{
			return 1;
		}
		else if(this.custId<s.custId)
		{
			return -1;
		}
		else
			return 0;
	}
	
	//
	
}
public class Program7 {

	public static void main(String[] args) {
		LinkedList<Customer1> ll = new LinkedList();
		ll.add(new Customer1(101,9856,"Abhishek"));
		ll.add(new Customer1(105,1122,"Chaitanya"));
		ll.add(new Customer1(104,7876,"Siddhant"));
		ll.add(new Customer1(103,6677,"Nainesh"));
		ll.add(new Customer1(106,9911,"Sushant"));
		ll.add(new Customer1(102,9580,"Nikhil"));
		
		Collections.sort(ll);
		System.out.print(ll);
		

	}

}
