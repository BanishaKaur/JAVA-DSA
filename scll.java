package csw;
import java.util.*;
class SingleCLL {
Node start;
SingleCLL()
{
	start=null;
}
class Node
{
	int data;
	Node next;
	Node(int data)
	
	{
		this.data=data;
		this.next=null;
		//size++;
	}
	
}
void Insertion_at_Beg(int x)
{
	Node n=new Node(x);
	if(isEmpty())
	{
		start=n;
		n.next=start;
	}
	else
	{
		Node p=start;
		while(p.next!=start)
		{
			p=p.next;
		}
		p.next=n;
		n.next=start;
		start=n;
	}
}
void Insertion_at_End(int x)
{
	Node n=new Node(x);
	if(isEmpty())
	{
		start=n;
		n.next=start;
	}
	else
	{
		Node p=start;
		while(p.next!=start)
		{
			p=p.next;
		}
		p.next=n;
		n.next=start;
	}
}
void delete_at_Beg()
{
	if(isEmpty())
	{
		System.out.println(" Circular Linked List Empty");
	}
	else {
		Node p=start;
		while(p.next!=start)
		{
			p=p.next;
		}
		p.next=start.next;
		start=start.next;
	}
}
void delete_at_End()
{
	if(isEmpty())
	{
		System.out.println("Circular Linked List is Empty");
	}
	else
	{
		Node p=start;
		while(p.next.next!=start)
		{
			p=p.next;
		}
//	p.next=null;
	p.next=start;//p.next=p.next.next
	}
}
boolean isEmpty()
{
	if(start==null)
		return true;
	return false;
}
void display(){
	Node p=start;
	while(p.next!=start)
	{
		System.out.print(p.data+" ");
		p=p.next;
	}
	System.out.print(p.data+" ");
	p=p.next;
}
void Search(int value)
{
	
	if(isEmpty())
	{
		System.out.println("No elements in scll");
	}
	else {
		Node p=start;
		int pos=0;
		while(p.next!=start)
		{ pos++;
			if(p.data==value)
			{
				System.out.println("Found at position "+pos);
			}
			p=p.next;
		}
		if(pos==0)
			System.out.println("Element not found");
		
	}
}
void deleteParticularvalue(int value)
{
	if(isEmpty())
	{
		System.out.println("No elements in scll");
	}
	else {
		Node p=start;
		while(p.next.next!=start)
		{
			if(p.next.data==value)
			{
				p.next=p.next.next;
			}
			p=p.next;
				
		}
	}
}
}
public class scll{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		SingleCLL ob=new SingleCLL();
		while(true)
		{ System.out.println("Enter data or enter -1 to exit");
		int x=sc.nextInt();
			if(x==-1)
			break;
		ob.Insertion_at_End(x);
	}
		ob.display();
		System.out.println();
//		ob.Search(5);
		ob.deleteParticularvalue(25);
		ob.display();
		//ob.delete_at_Beg();
		//ob.display();
//		ob.delete_at_End();
//		ob.display();
		//ob.display();
	
	}
}

