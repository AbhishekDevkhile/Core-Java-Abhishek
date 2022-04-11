package day4_MethodQuestion;

public class Shopping {
	int item;
	int quantity;
	double price;
	double total;
	
	void acceptDetails(int item,int quantity,double price) 
	{
		this.item=item;
		this.quantity=quantity;
		this.price=price;
		
		if(quantity<=0)
		{
			System.out.println("Error");
		}
		else 
		{
		 billcalculate();
		 display();
		}
		
	}
	void billcalculate()
	{
		total=quantity*price;
		
		
	}
	void display()
	{
		System.out.println(item);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println(total);
	}
    
	public static void main(String[] args) {

		Shopping s=new Shopping();
		s.acceptDetails(10,5, 50);
	

	}

}
