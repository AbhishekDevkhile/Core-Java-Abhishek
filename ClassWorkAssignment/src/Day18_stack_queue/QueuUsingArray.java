package Day18_stack_queue;
/*Insert and Delete operation.*/
public class QueuUsingArray {
	
	int rear,front;
	int a[];
	
	QueuUsingArray()
	{
		rear=front=0;
		a=new int[4];
	}
	
	void insert(int n)
	{
		if(rear<a.length)
		{
			a[rear]=n;
			rear++;
		}
		else
		{
			System.out.println("QUEUE is Full");
		}
	}
	
	void show()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	void delete()
	{
		if(rear>front)
		{
			for(int temp=front;temp<rear-1;temp++)
			{
				a[temp]=a[temp+1];
			}
			rear--;
			a[rear]=0;
			}
			else
			{
				System.out.println("Queue is empty");
			}	
	}
	

	public static void main(String[] args) {
		QueuUsingArray a=new QueuUsingArray();
		a.insert(11);
		a.insert(67);
		a.insert(34);
		a.insert(89);
		a.insert(56);
		a.insert(90);
		a.show();
		System.out.println("///////////////////////////////////");
	
	
		a.delete();
		a.show();
	
	}

}
