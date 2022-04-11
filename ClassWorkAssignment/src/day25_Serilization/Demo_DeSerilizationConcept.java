package day25_Serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo_DeSerilizationConcept {

	public static void main(String[] args)
	{
		try(
		     FileInputStream fis=new FileInputStream("D:\\JAVA WORK SPACE\\Serilization\\abc.txt");
		     ObjectInputStream ois=new  ObjectInputStream(fis);
		    )
		{
			//Student_Deserilization
			Student ob=(Student) ois.readObject();
			System.out.println(ob);
			
			
			
			//ArrayList_Deserilization
			
			ArrayList<String> al=(ArrayList<String>) ois.readObject();
			System.out.println(al);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
