package csw;
import java.util.*;
class Duplicate{
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
	Node DuplicateElements()
	{
		Node start=this.head;
		
		while(start!=null)
		{Node nextpos=head.next;
			while(nextpos!=null)
			{
				if(start.data==nextpos.data)
				{
					return nextpos;
				}
				nextpos=nextpos.next;
			}
			start=start.next;
//			nextpos=start.next;
		}
		return null;
	}
	public void removeDuplicate() {
		 Node curr = head;
		 while (curr != null) {
		 if (curr.next != null && curr.data == curr.next.data) {
		 curr.next = curr.next.next;
		 } else {
		 curr = curr.next;
		 }
		 }
		}
}
public class LinkListDuplicate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Duplicate ob=new Duplicate();
		while(true)  
		{ System.out.println("Enter data or enter -1 to exit");
		int x=sc.nextInt();
			if(x==-1)
			break;
			
			//obj.InsertAtBeg(x);
		ob.InsertAtEnd(x);
	}
		ob.display();
//		System.out.println(ob.DuplicateElements().data);
		ob.removeDuplicate();
		ob.display();
	
		
}
}
