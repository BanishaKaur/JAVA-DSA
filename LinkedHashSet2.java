package csw;
import java.util.*;
public class LinkedHashSet2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
	System.out.println("Enter the number of elements to be entered");
	int N=sc.nextInt();
	System.out.println("Enter the numbers to be added in linked hash set");
	for(int i=0;i<N;i++)
	{
		lhs.add(sc.nextInt());
	}
	System.out.println(lhs);
}
}
