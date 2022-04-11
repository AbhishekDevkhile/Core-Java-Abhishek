package day25_Serilization;
import java.io.EOFException;
/* */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class Demo_DeSerilization_ArrayList {

	public static void main(String[] args) {
		try(
			     FileInputStream fis=new FileInputStream("D:\\JAVA WORK SPACE\\Serilization\\abc.txt");
			     ObjectInputStream ois=new  ObjectInputStream(fis);
			    )
		{
				while(true) 
				{
					try 
					{
						Object obj=ois.readObject();
						if(Student.class.isInstance(obj))
						{
							Student ob=(Student)obj;
							System.out.println("  "+ob);
							
						}
						else if(Student.class.isInstance(obj))
						{
							ArrayList<String> ob=(ArrayList<String>) obj;
							System.out.println("   "+ob);
						}
					}
					catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					catch (EOFException e) {
						// TODO Auto-generated catch block
						break;
					//	e.printStackTrace();
					}
						
					
				}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
	}

}
