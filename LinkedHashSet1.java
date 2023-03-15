package csw;
import java.util.*;
public class LinkedHashSet1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	LinkedHashSet<Double> lhs=new LinkedHashSet<>();
	lhs.add(23.45);
	lhs.add(12.6785);
	lhs.add(12345.678);
	lhs.add(99999.99999);
	lhs.add(0.012067);
	System.out.println(lhs);
}
}
