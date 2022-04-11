package Day12_Collection_HashMap;
/*Create one map which contain Integer as a key And ArrayList Of Student as a value .
 Create map and  display it.*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student
{
	int sid;
	String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}
public class MapInsideArrayList_Map_Student 
{
	public static void main(String[] args) 
	{
		ArrayList<Student>al=new ArrayList();
		al.add(new Student(101,"a"));
		al.add(new Student(102,"b"));
		ArrayList<Student>al1=new ArrayList();
		al1.add(new Student(103,"d"));
		al1.add(new Student(104,"e"));
		ArrayList<Student>al2=new ArrayList();
		al2.add(new Student(105,"g"));
		al2.add(new Student(106,"h"));
		
		
		
	
		HashMap<Integer,ArrayList<Student>> hm=new HashMap();
		hm.put(1, al);
		hm.put(2, al1);
		hm.put(3, al2);
		
		Set s=hm.entrySet();
		Iterator<Map.Entry<Integer,ArrayList<Student>>> it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,ArrayList<Student>> hm1=it.next();
			System.out.println("Key= "+hm1.getKey()+" Values="+hm1.getValue());
		}
		
		//Using Scanner 
		



	}

}
