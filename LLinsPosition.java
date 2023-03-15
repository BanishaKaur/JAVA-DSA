package csw;

import java.util.*;

import csw.LLinsertAtPos.Node;

class LLinsertAtPos {
Node head;
private int size=0;
//LLinsertAtPos()
//{
//	this.size=0;
//}
int c=1;
int p=1;
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
public void InsertAtBeg(int data)
{
	Node newNode=new Node(data);
	if(head==null)
	{
		head=newNode;
		return;
	}
	newNode.next=head;
	head=newNode;
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
public void InsertAtAPosition(int data,int pos)
{Node newNode=new Node(data);
	if(head==null) {
//	{ newNode.next=head;
		head=newNode;
	//size++;
	return;
		
	}
	if(head.next==null)
	{
		head.next=newNode;
		newNode.next=null;
		//size++;
		return;
	}
	//size++;
	Node currNode=head;
	while(currNode.next!=null)
	{
	 c++;
	 if(c==pos)
	 { Node nextNode=currNode.next;
	  currNode.next=newNode;
	 newNode.next=nextNode;
	break;
	 }
	 currNode=currNode.next;
	}
	

	
}
public void sortedInsert(int value) {
	 Node newNode = new Node(value);
	 Node curr = head;
	 if (curr == null || curr.data > value) {
	 newNode.next = head;
	 head = newNode;
	 return;
	 }
	 while (curr.next != null && curr.next.data < value) {
	 curr = curr.next;
	 }
	 newNode.next = curr.next;
	 curr.next = newNode;
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
void DeleteAtPos(int pos)
{
	if(head==null)
	{
		System.out.println("UnderFlow");
		return;
	}
	size--;
	if(head.next==null)
	{
		head=null;
		return;
	}
	Node lastnode=head;
	Node secondlast=head.next;
	while(lastnode.next!=null)
	{
		p++;
		if(p==pos)
		{ 
			lastnode.next=lastnode.next.next;
			break;
		}
		lastnode=lastnode.next;
		secondlast=secondlast.next;	
	}

	
}
void reverse()
{ //LinkedList l=new LinkedList<>();
	//Node currhead=head;
	//while(currhead!=null)
//	{ 
	//	l.addFirst(currhead.data);
	//	currhead=currhead.next;
		
	//}
	//l.addFirst(null);
	//System.out.println(l);
	
	}


}


public class LLinsPosition
{              
       public static void main (String args[])
       {
    		LLinsertAtPos obj=new LLinsertAtPos();
    		LinkedList<Integer> List1=new LinkedList<>();
     	   LinkedList<Integer> List2=new LinkedList<>();
	            Scanner sc=new Scanner(System.in);
//	              Node ah=new Node(10);
//	              Node bh=new Node(10);
	List2.push(1);
	List2.push(2);
	List2.push(3);
while(true)
	{ System.out.println("Enter data or enter -1 to exit");
	int x=sc.nextInt();
		if(x==-1)
		break;
		
		//obj.InsertAtBeg(x);
//	obj.InsertAtEnd(x);
		obj.sortedInsert(x);
}
	obj.display();
	
	//obj.DeleteAtPos(2);
	//obj.display();
	//obj.reverse();
	//obj.InsertAtAPosition(7,3);
	//obj.display();
	//obj.sortedInsert(25);
	//obj.display();
	
       }
}


    
