package day25_Serilization;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int sid;
	private String sname;
	private int percent;
	

	public Student(int sid, String sname, int percent) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
	}
	
	


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public int getPercent() {
		return percent;
	}



	public void setPercent(int percent) {
		this.percent = percent;
	}


	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + "]";
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	
	

}
