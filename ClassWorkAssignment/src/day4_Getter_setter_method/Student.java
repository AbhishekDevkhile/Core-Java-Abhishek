package day4_Getter_setter_method;

public class Student {
	private int id;
	private String name;
	private float per;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPer(float per)
	{
		this.per=per;
	}
	
	//read permission
	
	public int getId()
	{
		return id;
	}
    public String getName()
    {
    	return name;
    }
    public float getPer()
    {
    	return per;
    }
    
}
