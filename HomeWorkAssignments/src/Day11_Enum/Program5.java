package Day11_Enum;
/*5. Show different constructors of each wrapper class.*/
public class Program5 
{

	public static void main(String[] args) 
	{
		// Short Constructor
				Short S1 = new Short((short) 20);
				Short S2 = new Short("10");
				System.out.println(S1 + "  " + S2);

				// Integer Constructor
				Integer I1 = new Integer(30);
				Integer I2 = new Integer("30");
				System.out.println(I1 + "  " + I2);

				// Long Construtor
				Long L1 = new Long(40);
				Long L2 = new Long("40");
				System.out.println(L1 + "  " + L2);

				// Float constructor
				Float F1 = new Float(12.2f);
				Float F2 = new Float("15.6");
				Float F3 = new Float(15.6d);
				System.out.println(F1 + "  " + F2 + "  " + F3);

				// Double constructor
				Double D1 = new Double(17.8d);
				Double D2 = new Double("17.8");
				System.out.println(D1 + "  " + D2);

				// Boolean constructor
				Boolean BLN1 = new Boolean(false);
				Boolean BLN2 = new Boolean("true");
				System.out.println(BLN1 + "  " + BLN2);
		

	}

}
