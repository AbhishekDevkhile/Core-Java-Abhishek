package JavaTest3;

public class Demo8 {
	int x;
	public Demo8(int n)
	{
		System.out.println(x=n);
	}

	public static void main(String[] args) {
	//	Demo8 d=new Demo8();  //The constructor Demo8() is undefined
		
	//correct error in below 
		Demo8 d=new Demo8(5);
	}

}
