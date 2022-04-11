package day6_ImplementsAndExtends;
interface Method
{
	int Factor(int a);
}
public class Calculatefactor implements Method {
	@Override
	public int Factor(int a)
	{
		 int sum=0;
		    for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					sum=sum+i;
				}
			}
				return sum;
	}

	public static void main(String[] args) {
		Calculatefactor c=new Calculatefactor();
		System.out.println(c.Factor(10));
		
	}

}
