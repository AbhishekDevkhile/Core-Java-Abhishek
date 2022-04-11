package day4_Getter_setter_method;

public class StudInfo {

	public static void main(String[] args) {

		Student s=new Student();
		
		s.setId(101);
		s.setName("Abhi");
		s.setPer(89.45f);
		
		//int sid=s.getId();
		//System.out.println(sid);
		       //OR
		System.out.println(s.getId());
		
		//String sname=s.getName();
		//System.out.println(sname);
				    //OR
		System.out.println(s.getName());
		
		
		//float sper=s.getPer();
		//System.out.println(sper);
				    //OR
		System.out.println(s.getPer()+"%");

	}

}
