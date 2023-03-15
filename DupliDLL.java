package csw;
import java.util.*;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	class DuplicateDll
	{  Node head;
		void InsertAtEnd(int data)
		{
			Node newnode=new Node(data);
			newnode.next=null;
			Node last=head;
			if(head==null)
			{
				newnode.prev=null;
				head=newnode;
				
			}
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newnode;
			newnode.prev=last;
			
		}
		void print()
		{
			Node curr=head;
			Node res=null;
			while(curr!=null)
			{
				System.out.println(curr.data+" ");
				res=curr;
				curr=curr.next;
			}
			System.out.println();
		}
		void duplicate()
		{
			Node curr=head;
			while(curr!=null)
			{ Node point=head;
				while(point!=null)
				{
					if(curr.data==point.data)
					{
						System.out.println(point.data);
					}
					point=point.next;
				}
				curr=curr.next;
			}
		}
		void removeduplicate()
		{
			Node curr=head;
			while(curr!=null)
			{
				if (curr.next != null && curr.data == curr.next.data) {
					 curr.next = curr.next.next;
					 curr.next.prev=curr;
					 }
				curr=curr.next;
			}
		}
	}
public class DupliDLL {
	public static void main(String args[])
	 {
		 DuplicateDll ob=new DuplicateDll();
		 Scanner sc=new Scanner(System.in);
		 while(true)
			{ System.out.println("Enter data or enter -1 to exit");
			int x=sc.nextInt();
				if(x==-1)
				break;
				ob.InsertAtEnd(x);
	 }
		 ob.print();
		 ob.duplicate();
		 ob.removeduplicate();
		 ob.print();
	}
}
