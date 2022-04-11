package JavaTest7;

import java.util.ArrayList;
import java.util.Scanner;



/*8)WAP to create a ArrayList<Emp> and search for Emp object whose	
Empno=10 and delete all the records whose dept is same as
empno 10. 
Emp [Empno,ename,Dept d]
Dept [did,dname]
*/
class Dept
{
	int did;
	String dname;
	public Dept(int did, String dname) 
	{
		super();
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
}
class Emp
{
	int empno;
	String empname;
	Dept d;
	public Emp(int empno, String empname, Dept d) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", empname=" + empname + ", d=" + d + "]";
	}
	
}
public class Program8 {

	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		ArrayList<Dept> d=new ArrayList();
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter Dept Id:");
			int did=sc.nextInt();
			System.out.println("Enter Dept Name:" );
			String dnm=sc.next();
			d.add(new Dept(did,dnm));
			
		}
		ArrayList<Emp> e=new ArrayList();
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter Emp Id:");
			int eid=sc.nextInt();
			System.out.println("Enter Emp Name:");
			String enm=sc.next();
			System.out.println("Enter Dept Id:");
			int did=sc.nextInt();
			System.out.println("Enter Dept Name:" );
			String dnm=sc.next();
		
			
			
			e.add(new Emp(eid,enm,new Dept(did,dnm)));
		}
		System.out.println("Before"+e);
	
		
		System.out.println("Enetr Employee number:");
		int input=sc.nextInt();
		
		//way1
				int p=0;
				for(int i=0;i<e.size();i++)
				{
					if(e.get(i).empno==input)
					{
						p=e.get(i).d.did;
					}
				}
				for(int i=0;i<e.size();i++)
				{
					if(e.get(i).d.did==p)
					{
						//System.out.println(d.get(i).dname);
						e.remove(i);
					}
				}
				System.out.println(e);
		

	}

}
