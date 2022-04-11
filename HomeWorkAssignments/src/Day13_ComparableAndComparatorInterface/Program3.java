package Day13_ComparableAndComparatorInterface;

import java.util.Iterator;
import java.util.LinkedList;

/*Write Customer with custId,custMobile,custName . WAP to add elements to LinkedList which should 
 accept Customer type objects only. Print all elements of LinkedList using -
a. Iterator
b. for loop
c. for each*/


class Customer
{
	int custId;
	int custMobile;
	String custName;
	public Customer(int custId, int custMobile, String custName) {
		super();
		this.custId = custId;
		this.custMobile = custMobile;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custMobile=" + custMobile + ", custName=" + custName + "]";
	}
	
}
public class Program3 {

	public static void main(String[] args) 
	{
		LinkedList<Customer> ll = new LinkedList();
		ll.add(new Customer(101,9856,"Abhishek"));
		ll.add(new Customer(105,1122,"Chaitanya"));
		ll.add(new Customer(104,7876,"Siddhant"));
		ll.add(new Customer(103,6677,"Nainesh"));
		ll.add(new Customer(106,9911,"Sushant"));
		ll.add(new Customer(102,9580,"Nikhil"));
		
		//a. Iterator
		System.out.println("Display using iterator:");
		Iterator<Customer>itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("//////////////////////////////////");
		//b. for loop
		System.out.println("Display using Forloop:");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("///////////////////////////////////");
		//c. for each
		System.out.println("Display using Foreach loop:");
		for(Customer c:ll)
		{
			System.out.println(c);
		}
	}

}
