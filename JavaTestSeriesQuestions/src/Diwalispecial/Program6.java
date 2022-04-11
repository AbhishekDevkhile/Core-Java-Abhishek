package Diwalispecial;

/*6.Show average of elements from given range of positions in 1D array
 with size 10. Eg. In array {4,5,2,3,7,8,9,5,12,8} avarege 
 of elements from range 3 to 8 is 5.6 	*/
public class Program6 {

	public static void main(String[] args) {
		int[] a={4,5,2,3,7,8,9,5,12,8};
		float sum=0;
		int count=0;
		float avg=0;
		
		for(int i=3;i<a.length-2;i++)
		{
			sum=sum+a[i];
			count++;
		}
		System.out.println(sum);
		avg=sum/count;
		System.out.println("Avg:"+avg);

	}

}
