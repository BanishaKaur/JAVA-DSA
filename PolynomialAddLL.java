package csw;
import java.util.*;

	class PolynomialAddition
{
		class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
    public static Node addPolynomial(Node p1,Node p2)
    {
Node res=new Node(-1,-1);
Node temp=res;
while(p1!=null&&p2!=null){
    if(p1.pow==p2.pow){
        temp.next=new Node(p1.coeff+p2.coeff,p2.pow);
        p1=p1.next;
        p2=p2.next;
    }
   else if(p1.pow>p2.pow){
temp.next=p1;
p1=p1.next;
    }
    else{
     temp.next=p2;
p2=p2.next;   
    } 
temp=temp.next;
    }
    if(p1==null)
    temp.next=p2;
    else
    temp.next=p1;
    return res.next;
}
}

public class PolynomialAddLL
{
	public static void main(String args[])
	{PolynomialAddition ob=new PolynomialAddition();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Enter a number for polynomial expression 1 or enter -1 to exit");
			System.out.println("Enter power of that number in polynomial expression 1 or enter -1 to exit");
			int x1=sc.nextInt();
			int p1=sc.nextInt();
			System.out.println("Enter a number for polynomial expression 2 or enter -1 to exit");
			System.out.println("Enter power of that number in polynomial expression 2 or enter -1 to exit");
			int x2=sc.nextInt();
			int p2=sc.nextInt();
		if(x1==-1||p1==-1||x2==-1||p2==-1)
			break;
		Node n1=new Node(x1,p1);
		Node n2=new Node(x2,p2);
		ob.addPolynomial(n1, n2);
//		System.out.println(ob.addPolynomial(n1, n2).coeff+ " "+ob.addPolynomial(n1, n2).pow);
		}
		
		System.out.println(ob.hashCode()+" ");
		
		
	}
}


 

