package csw;
import java.util.*;
public class TreeSet1 {
public static void main(String args[])
{   Scanner sc=new Scanner(System.in);
	TreeSet<Integer> ts=new TreeSet<>();
	System.out.println("Enter elements in tree");
	for(int i=0;i<5;i++)
	{
		ts.add(sc.nextInt());
	}
	Iterator<Integer> it=ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("Enter a number to be found in the list");
	int val=sc.nextInt();
	int output=0;
	for(int temp:ts)
	{
		if(temp==val)
		{ output++;
			
		}
	}
	if(output!=0)
	{
		System.out.println("Present in the tree");
	}
	else
		System.out.println("Not present in tree");
	
	System.out.println("Enter the element to be deleted");
	int delete=sc.nextInt();
	ts.remove(delete);
	Iterator<Integer> dis=ts.iterator();
	while(dis.hasNext())
	{
		System.out.println(dis.next());
	}
}
}
