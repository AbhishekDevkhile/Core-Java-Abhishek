package Day5_Inheritance_And_Polymorphism;


class X
{
	public X(int i)
	{
		System.out.println(1);
	}
}
class Y extends X
{
	public Y()    //error:Implicit super constructor X() is undefined. Must explicitly invoke another constructor
	{
		super(10);  //if remove this(super()) :->that time above error will be display
		System.out.println(2);
	}
}
public class ShowOutput7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
