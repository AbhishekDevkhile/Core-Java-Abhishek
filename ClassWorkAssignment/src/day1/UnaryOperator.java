package day1;

public class UnaryOperator {

	public static void main(String[] args) {
		/*
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

        
        int x5=4+(5*8);
        System.out.println("x5="+x5);
        
        
        int x6=2+((3*4)-(4/2));
        System.out.println("x6="+x6);
        
        
        int x7= ((51%9)-(2*4));
        System.out.println("x7="+x7);
        
        
        int x8= ((5*2)/2) +((4*5)/2);
        System.out.println("x8="+x8);
        
        
        int x9=(6*7)+2-2-1;
        System.out.println("x9="+x9);

       */
        int a=5, b=20;
        int x = a++ + --b + --b + b/a + --a * b++;
        System.out.println(x);
        
		
		//int x=2,y=5,z=4;
		//int k=y/z*x;
		//System.out.println(k);
	}

}
