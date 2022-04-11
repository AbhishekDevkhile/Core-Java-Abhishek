package day25_FactorDesignPattern;

public class CarFactory {

	public static Car1 getCar(String  cartype)
	
	{
		if(cartype.equals("Honda"))
		{
			return new HondaCity();
		}
		else if(cartype.equals("Swift"))
		{
			return new Swift();
		}
		else
			return null;
		
		

	}

}
