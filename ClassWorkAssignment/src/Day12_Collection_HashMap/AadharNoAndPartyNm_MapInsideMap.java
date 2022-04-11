package Day12_Collection_HashMap;
/*Create one hashmap which contain string type key and string type value.Key contain aadharno and vale contain partyname.
  now create one another map which contain party type as a key no, of votes party as a value.*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharNoAndPartyNm_MapInsideMap {

	public static void main(String[] args) 
	{
		HashMap<String,String> hm=new HashMap();
		hm.put("1234","NCP");
		hm.put("1122","Shivsena");
		hm.put("1578","MNS");
		hm.put("1258","BJP");
		hm.put("7865","NCP");
		hm.put("2589","AAP");
		hm.put("2645","BJP");
		
		
		HashMap<String,Integer>hm3=new HashMap();
		   /*
		//Using foreach loop
		
		for(Map.Entry<String,String> hm1:hm.entrySet())
		{
			Integer count=0;
			for(Map.Entry<String,String>hm2:hm.entrySet())
			{
				if(hm1.getValue().equalsIgnoreCase(hm2.getValue()))
				{`
					count++;
					
				}
			}
			hm3.put(hm1.getValue(), count);
			
			
		}
		System.out.println(hm3);
		*/
		
		
		//Using Iterator:
		
		Set s=hm.entrySet();
		Iterator<Map.Entry<String,String>> it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String> hm1=it.next();
			Integer count1=0;
			Iterator<Map.Entry<String,String>>it1=s.iterator();
			while(it1.hasNext())
			{
				Map.Entry<String,String> hm2=it1.next();
				if(hm1.getValue().equalsIgnoreCase(hm2.getValue()))
				{
					count1++;	
				}
				hm3.put(hm1.getValue(), count1);		    
			}
		}
		System.out.println(hm3);
	}

}
