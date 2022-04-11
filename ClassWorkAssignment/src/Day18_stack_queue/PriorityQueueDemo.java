package Day18_stack_queue;
/*Create a queue using priority Queue and display using all possible ways.*/
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo 
{

	public static void main(String[] args) 
	{
		Queue<Integer> q=new PriorityQueue();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		
		System.out.println("  "+q);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Using Iterator");
		Iterator<Integer>itr=q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("ForEach loop");
		for(Integer i:q)
		{
			System.out.println(i);
		}
		

	}

}
