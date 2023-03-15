package csw;
import java.util.*;
class ArrayList1
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("Enter the size of arraylist");
        int size=sc.nextInt();
        System.out.println("Enter values in array list");
        for(int i=0;i<size;i++)
        {
            al.add(sc.nextInt());
        }
        System.out.println(al);
        System.out.println("Enter the number to be searched in list");
        int val=sc.nextInt();
        int p=0;
        for(int temp:al)
        {
            if(temp==val)
            p++;
        }
        if(p==1)
        {
            System.out.println("Present");
        }
        else
        {
        System.out.println("Not Present");
        }
        System.out.println("Enter a position from which an element is to be removed");
        int delete=sc.nextInt();
        al.remove(delete);
        System.out.println(al);
        if(al.isEmpty())
        System.out.println("array list is empty");
        else
        System.out.println("Array List has elements");
        
    }
}