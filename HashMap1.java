package csw;
import java.util.*;
public class HashMap1{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("Ramesh",56);
	hm.put("Mayuresh",78);
	hm.put("Pakhi",88);
	hm.put("Banisha",100);
	hm.put("Alesia",90);
	for(String k:hm.keySet())
	{
		System.out.println(k+" obtains total marks "+hm.get(k));
	}
}
}
