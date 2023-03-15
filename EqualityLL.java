package csw;
import java.util.*;

import csw.LLinsertAtPos.Node;
class EqualLL {
	Node head;
class Node{
	
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	void display()
	{
		System.out.println(data);
	}
}
void InsertAtEnd(int x)
{ Node newNode=new Node(x);
	if(head==null)
	{
		head=newNode;
		return;
	}
	Node currNode=head;
	while(currNode.next!=null)
	{
		currNode=currNode.next;
	}
	currNode.next=newNode;
}
void display()
{
	Node currNode=head;
	while(currNode!=null)
	{
		System.out.print(currNode.data+" ");
		currNode=currNode.next;
	}
	System.out.println("Null");
}
boolean equality(EqualLL listb)
{
	Node ah=this.head;
	Node bh=listb.head;
	
	while(ah!=null||bh!=null)
	{
		if(ah.data==bh.data)
			return true;
		else
		{ ah=ah.next;
		  bh=bh.next;
			return false;
		}
	}
	if(ah==null&&bh==null)
		return true;
	else
		return false;
}


}
public class EqualityLL{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	LinkedList List2=new LinkedList<>();
//	LinkedList List1=new LinkedList<>();
	EqualLL ob=new EqualLL();
	EqualLL Listb=new EqualLL();
	while(true)
	{ System.out.println("Enter data or enter -1 to exit");
	int x=sc.nextInt();
		if(x==-1)
		break;
		
		//obj.InsertAtBeg(x);
	ob.InsertAtEnd(x);
}
	ob.display();
	while(true)
	{ System.out.println("Enter data or enter -1 to exit");
	int x=sc.nextInt();
		if(x==-1)
		break;
		
		//obj.InsertAtBeg(x);
	Listb.InsertAtEnd(x);
}
	Listb.display();
	if(ob.equality(Listb)==true)
	{
		System.out.println("Linked Lists are Equal");
	}
	else
		System.out.println("Linked Lists are not Equal");
}
}
