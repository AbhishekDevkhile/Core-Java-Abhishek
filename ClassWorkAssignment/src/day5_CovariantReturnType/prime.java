 package day5_CovariantReturnType;

public class prime {
	boolean isCheckValid(int num)
	{
	boolean flag;
	int sum=0;
	while(num>0)
	{
		int r=num%10;
		sum=sum+r;
		num=num/10;
	}
	System.out.println(sum);
	if(sum%10==0)
	{
		flag=true;
		return flag;
	}
	else
	{
		flag=false;
		return flag;
	}
	}
	public static void main(String[] args) {

		prime b=new prime();
		
	//	System.out.println(b.isCheckValid(5500));
		              //OR
		boolean isValid=b.isCheckValid(6700);
		System.out.println(isValid);

	}

}
