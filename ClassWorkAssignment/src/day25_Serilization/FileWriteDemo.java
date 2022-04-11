package day25_Serilization;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw=new FileWriter("D:\\JAVA WORK SPACE\\Serilization\\pqr.txt",true);                           //true:- previoue data connot delete .
			fw.write("I am Abhishek.");
			fw.flush();
			System.out.println("File created");
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
