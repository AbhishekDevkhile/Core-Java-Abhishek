package Day11_Wrapper_Classes;

/*WAJP to show all Parsing Method*/
public class ParsingMethod {

	public static void main(String[] args) {
		String s = "234";
		int x = Integer.parseInt(s);
		System.out.println(x);

		String a = "147";
		double a1 = Double.parseDouble(a);
		System.out.println(a1);

		String b = "True";
		boolean b1 = Boolean.parseBoolean(b);
		System.out.println(b1);

		String l = "456";
		double l1 = Long.parseLong(l);
		System.out.println(l1);

		String f = "789";
		float f1 = Float.parseFloat(f);
		System.out.println(f1);

	}

}
