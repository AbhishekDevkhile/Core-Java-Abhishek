package day4_Constructor;

public class Test1 {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.showDetails();
		
	   System.out.println();
	   
		Test t2=new Test(123,123456,"cvb","blue");
		t2.showDetails();
		}

	}


