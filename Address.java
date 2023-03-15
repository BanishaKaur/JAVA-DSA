package csw;
import java.util.*;
public class Address{
static int plot;
static String post;
Address(int plot,String post)
{
this.plot=plot;
this.post=post;
//System.out.println(this.plot);
//System.out.println(this.post);
}
//void display()
//{
//System.out.println(plot+" "+post);	
//}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Map<String,Address> tm=new TreeMap<>();
	System.out.println("Enter name and address");
	for(int i=0;i<5;i++)
	{
		String name=sc.next();
		int plot=sc.nextInt();
		String post=sc.next();
		tm.put(name,new Address(plot,post));
		
		//System.out.println(tm.get(i).plot+" "+tm.get(i).post);
	}
	//System.out.println(tm);
	Set set=tm.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext())
	{
		Map.Entry me=(Map.Entry)it.next();
		System.out.println(me.getKey()+" "+"lives at the address "+me.getValue());
	}
	//System.out.println(tm);
	
}
}
