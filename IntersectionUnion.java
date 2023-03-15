package csw;
import java.util.*;

import csw.EqualLL.Node;
class IntersectUni {
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
 Node Intersection(IntersectUni List2)
{
	Node ah=this.head;
	Node bh=List2.head;
	//
	while(ah!=null)
	{
		while(bh!=null)
		{
			if(ah.data==bh.data)
			{return bh;
			}
				bh=bh.next;
		}
		ah=ah.next;
		bh=List2.head;
	}
return null;
	
	
}
 void Union(IntersectUni List2) {
	 Node ah=this.head;
	 Node bh=List2.head;
	 while(ah!=null)
	 {
		 
	 }
 }
}
public class IntersectionUnion{
 public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
//		LinkedList List1=new LinkedList<>();
		IntersectUni obj=new IntersectUni();
		IntersectUni List2=new IntersectUni();
		while(true)
		{ System.out.println("Enter data or enter -1 to exit");
		int x=sc.nextInt();
			if(x==-1)
			break;
			
			//obj.InsertAtBeg(x);
		obj.InsertAtEnd(x);
	}
		obj.display();
		while(true)
		{ System.out.println("Enter data or enter -1 to exit");
		int x=sc.nextInt();
			if(x==-1)
			break;
			
			//obj.InsertAtBeg(x);
		List2.InsertAtEnd(x);
	}
		List2.display();
		if(obj.Intersection(List2)==null)
		{
			System.out.println("Intersection not found");
		}
		else
			System.out.println("Intersection found at "+obj.Intersection(List2).data);
	}
}
