package day25_Serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*java object write in file.  Student st type object*/

public class Demo_Serilization_Student {

	public static void main(String[] args) 
	{
		Student ss=new Student(101,"Abhishek",88);
		try {
		FileOutputStream fos=new  FileOutputStream("D:\\JAVA WORK SPACE\\Serilization\\abc.txt");
		ObjectOutputStream oos=new  ObjectOutputStream(fos);
		oos.writeObject(ss);
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Abhi");
		al.add("Nitin");
		al.add("Chaitanya");
		oos.writeObject(al);
		
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
