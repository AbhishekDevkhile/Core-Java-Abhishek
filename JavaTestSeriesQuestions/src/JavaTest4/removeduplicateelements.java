package JavaTest4;

import java.util.Scanner;

public class removeduplicateelements {
	public static void main(String[] args) {
		
		int[] a= {4,3,2,4,9,2};
		
		 
        int j=0;
        a[j]=a[0];
        for(int i=0;i<a.length;i++)
        {
            if (a[j] != a[i])
            {
               
                a[j]=a[i];
                j++;
            }
         //   System.out.print(a[i]+"  ");
        }
        System.out.print(a[j]+"  ");
	

}
}
