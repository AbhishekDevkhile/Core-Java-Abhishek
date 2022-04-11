package day25_Serilization;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr=new FileReader("D:\\JAVA WORK SPACE\\Serilization.txt");
			
			int ch=fr.read();
			while(ch!= -1)                          //read method at a time only one char is read(while loop use) 
			{
				System.out.print((char)ch);
				ch=fr.read();
			}
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
