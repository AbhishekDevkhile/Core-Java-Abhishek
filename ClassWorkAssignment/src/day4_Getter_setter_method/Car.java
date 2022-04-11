 package day4_Getter_setter_method;

public class Car {
	
	int modelId;
	String carName;
	String carColor;
	double carPrice;
	float carSpeed;
	
	public void setmodelId(int modelid)
	{
		this.modelId=modelid; 
	}
	public void setcarName(String carname)
	{
		this.carName=carname;
	}
	public void setcarColor(String carcolor)
	{
		this.carColor=carcolor;
	}
	public void setcarPrice(double carprice)
	{
		this.carPrice=carprice;
	}
	public void setcarSpeed(float carspeed)
	{
		if(carspeed>80)
		{
			System.out.println("pls control the speed");
		}
		else
		{
		this.carSpeed=carspeed;
		}
	}
	
	
	
	
	
	
	public int getmodelId()
	{
		return modelId;
	}
	public String getcarName()
	{
		return carName;
	}
	public String getcarColor()
	{
		return carColor;
	}
	public double getcarPrice()
	{
		return carPrice;
	}
	public float getcarSpeed()
	{
		return carSpeed;
	}

	

}
