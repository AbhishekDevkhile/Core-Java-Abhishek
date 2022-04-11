package Day18_stack;

public class StackDemo {
	
	int top;
	int a[];
	
	public StackDemo()
	{
		top=-1;
		a=new int[4];
	}
	
	void push(int n)
	{
		top++;
		if(top<a.length)
		{
		
//		a[top]=n;
		a[top]=n;
		}
		else
		{
			System.out.println("Stack Overflow");
		}
		
	}
	
	void display()
	{
		for(int i=0;i<top;i++)
		{
			System.out.println(a[i]);
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			top--;
			int x=a[top];
			
			return x;
		}
	}

	public static void main(String[] args) {
		StackDemo d=new StackDemo();
		d.push(45);
		d.push(90);
		d.push(23);
		d.push(78);
		d.push(56);
		d.display();
		
		System.out.println("deleted     "+d.pop());
		
	}

}
