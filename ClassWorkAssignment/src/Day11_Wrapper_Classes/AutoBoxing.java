package Day11_Wrapper_Classes;

public class AutoBoxing {
	// 1
	static void m1(int x) {
		System.out.println("A");
	}

	static void m1(Integer x) {
		System.out.println("b");
	}

	// 2
	static void m1(Float y) {
		System.out.println("A");
	}

	static void m1(float y) {
		System.out.println("b");
	}

	// 3
	static void m1(Short x) {
		System.out.println("A");
	}

	static void m1(double l) {
		System.out.println("b");
	}

	public static void main(String[] args) {
		int x = 10;
		m1(x);

		// 2
		float y = 10;
		m1(y);

		// 3
		double z = 15;
		m1(z);

	}

}
