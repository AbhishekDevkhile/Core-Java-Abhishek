package Day16_Collection_TreeSet;

import java.util.TreeSet;

public class Car implements Comparable<Car> {

	int id;
	String cname;
	String color;

	public Car(int id, String cname, String color) {
		super();
		this.id = id;
		this.cname = cname;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", cname=" + cname + ", color=" + color + "]";
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

	public static void main(String[] args) {
		TreeSet<Car>t=new TreeSet();
		t.add(new Car(200,"Audi","red"));
		t.add(new Car(101,"Maruti","Black"));
		t.add(new Car(150,"BMW","White"));
		
		System.out.println(t);
		
		

	}

	

}
