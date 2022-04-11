package day25_InnerClass;


interface cake
{
	void Chocolate();
}



public class AnonomoyousDemo 
{

	public static void main(String[] args) {
		
		cake c=new cake()
		{

			@Override
			public void Chocolate() {
				// TODO Auto-generated method stub
				System.out.println("Producing chocolates");
				
			}
	
		};
		c.Chocolate();

	}

}
