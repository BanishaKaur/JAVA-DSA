package csw;
import java.util.*;
public class HashMapSort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(56,"Ramesh");
		hm.put(8,"Mayuresh");
		hm.put(88,"Pakhi");
		hm.put(100,"Banisha");
		hm.put(90,"Alesia");
		//for(int k:hm.keySet())
		//{
		//	System.out.println(k+" marks are obtaine by "+hm.get(k));
		//}
		TreeMap<Integer,String> tm=new TreeMap<>(hm);
		
		for(int j:tm.keySet())
		{
			System.out.println(j+" marks are obtaine by "+tm.get(j));
		}
	}
}
