package day1;

public class Factorial {

	/*public static void main(String[] args) {
		int a=10;
		int b=2;
	
		//System.out.println(a++);
	//	System.out.println(++a);
		
	//	int x= a++ + b++ + a;
		
		int x=++b + a + ++a +b;
		
		System.out.println("x"+x);
		
		System.out.println(a+" "+b);

	}*/
	
	public static void main(String[] args) {
        int a=2;
        int b=2;

        

        int x= a + ++a + b + a ;
 
        System.out.println("x="+x);

        System.out.println(a+" "+b);
        
        int x1= a++ + b++ + --b ;
        
        System.out.println("x1="+x1);

        System.out.println(a+" "+b);

        
        
        int x2= (--a) - (b++) + ++a ;
        
        System.out.println("x2="+x2);

        System.out.println(a+" "+b);

        
        
        int x3= a++ + ++b + a ;
        
        System.out.println("x3="+x3);

        System.out.println(a+" "+b);
        
        
        int x4= ++b + ++a - a;
        
        System.out.println("x4="+x4);

        System.out.println(a+" "+b);

        
        

    }
    

}
