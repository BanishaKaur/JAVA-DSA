package csw;
import java.util.*;
public class StackDecToBin {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Stack<Integer> st=new Stack<>();
	System.out.println("Enter a decimal number");
	int dec=sc.nextInt();
	while(dec!=0)
	{
		int rem=dec%2;
		//System.out.print(rem);
		st.push(rem);
		dec=dec/2;
		//System.out.print(dec);
	}
	Iterator<Integer> it=st.iterator();
	while(it.hasNext())
	{
		System.out.print(st.pop());
	}
}
}
