package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class Order
{
	int oId;
	int moid;
	int oQuantity;
	public Order(int oId, int moid , int oQuantity) {
		super();
		this.oId = oId;
		this.moid = moid;
		this.oQuantity = oQuantity;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oName=" + moid + ", oQuantity=" + oQuantity + "]";
	}
	
	
}
class Menu
{
	int mid;
	String mName;
	int mPrice;
	public Menu(int mid, String mName, int mPrice) {
		super();
		this.mid = mid;
		this.mName = mName;
		this.mPrice = mPrice;
	}
	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mName=" + mName + ", mPrice=" + mPrice + "]";
	}
	
	
}
public class Menu_OrderList_Arraylist {

	public static void main(String[] args) {
		ArrayList<Menu> m=new ArrayList();
		m.add(new Menu(101,"Pavbhaji",100));
		m.add(new Menu(102,"Dosa",150));
		m.add(new Menu(101,"Misal",150));
		
		ArrayList<Order> o=new ArrayList();
		o.add(new Order(111,101,2));
		o.add(new Order(112,102,3));
		o.add(new Order(113,103,4));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OrderName:");
		String input=sc.next();
		
	/*	//Way 1
		
		int mnid=0;
		int price=0;
		for(Menu x:m)
		{
			if(x.mName.equalsIgnoreCase(input))
			{
				mnid=x.mid;
				price=x.mPrice;
			}
			
		}
	//	System.out.println(orid);
		System.out.println("Price is:"+price);
		
		int bill=0;
		for(Order y:o)
		{
			if(y.moid==mnid)
			{
				//System.out.println(y);
				bill=y.oQuantity*price;
			}
			
		}
		System.out.println("Total bill:"+bill);
		
	*/	
	
		
		//Way 2
		
		int mnid=0;
		int pri=0;
		int total=0;
		Iterator<Menu>itr=m.iterator();
		while(itr.hasNext())
		{
			Menu nu=itr.next();
			if(nu.mName.equalsIgnoreCase(input))
			{
				int q=nu.mid;
				pri=nu.mPrice;
			
				Iterator<Order> itr2=o.iterator();
				while(itr2.hasNext())
				{
					Order o1=itr2.next();
					if(q==mnid)
					{
						total=pri*o1.oQuantity;
						
					}
					System.out.println(total);
				
				}
		}
		}
		

	}

}
