package csw;
import java.util.*;

import csw.IntersectUni.Node;
class CopyLinkList
{
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
	void Copy(CopyLinkList Listb)
	{
		Node start=this.head;
		Node bHead=Listb.head;
		
		while(start!=null)
		{
			bHead=start;
			start=start.next;
			
		}
	  Listb.display();
	}
}
public class CopyLL {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		CopyLinkList ob=new CopyLinkList();
		CopyLinkList  Listb=new CopyLinkList();
		while(true)
		{ System.out.println("Enter data or enter -1 to exit");
		int x=sc.nextInt();
			if(x==-1)
			break;
			
			//obj.InsertAtBeg(x);
		ob.InsertAtEnd(x);
	}
		ob.display();
		ob.Copy(Listb);
}
}
