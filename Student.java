package csw;
import java.util.*;
public class Student {

	    String name;
	    int age;
	    int mark;
	    Student(String name,int age,int mark)
	    {
	      this.name=name;
	      this.age=age;
	      this.mark=mark;
	    }
	    void display()
	    {
	        System.out.println("Name:"+name);
	        System.out.println("age:"+age);
	        System.out.println("marks:"+mark);
	    }
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        LinkedList<Student> ll=new LinkedList<>();
	        System.out.println("Enter name,age and marks of Students");
	        for(int i=0;i<5;i++)
	        {
	        	String name=sc.next();
	        	int age=sc.nextInt();
	        	int marks=sc.nextInt();
	        	ll.add(new Student(name,age,marks));
	        }
	        Iterator<Student> it=ll.iterator();
	        while(it.hasNext())
	        {
	            it.next().display();
	        }
	        System.out.println("Enter name,age and marks to be found");
	        String n=sc.next();
	        int a=sc.nextInt();
	        int m=sc.nextInt();
	        for(int j=0;j<ll.size();j++)
	        {
	        	if((ll.get(j).name==n)||(ll.get(j).age==a)||(ll.get(j).mark==m))
	        	{
	        		System.out.println("Found at position:"+j);
	        	}
	        }
	        System.out.println("Enter the position of the object to be removed fromt the list");
	        int pos=sc.nextInt();
	        ll.remove(pos);
	        int count=0;
	        Iterator<Student> dis=ll.iterator();
	        while(dis.hasNext())
	        {
	            dis.next().display();
	            count++;
	        }
	        System.out.println("Number of objects present in the list:"+count);
	    }
	}


