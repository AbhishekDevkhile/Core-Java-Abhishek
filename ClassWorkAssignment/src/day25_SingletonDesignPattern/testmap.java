package day25_SingletonDesignPattern;
/*refer employee class(Singleton Design Pattern) */


public class testmap {

	public static void main(String[] args) {
		
		Employee e1=Employee.getInstance();
		System.out.println(e1.hashCode());

		Employee e2=Employee.getInstance();
		System.out.println(e2.hashCode());
		

	}

}
