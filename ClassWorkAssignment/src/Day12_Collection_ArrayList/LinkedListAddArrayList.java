package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAddArrayList {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("a");
		l.add("b");
		l.add("g");
		l.add("d");
		
		ArrayList al=new ArrayList();
	//	ArrayList al=new ArrayList(l);  //LinkedList Add in ArrayList using constructor
		
		al.add("e");
		al.add("f");
		al.add("t");
		al.add("p");
		al.addAll(l);   //LinkedList Add IN ArrayList
		
		System.out.println(al);
		

	}

}
