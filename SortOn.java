package csw;
import java.util.*;
public class SortOn {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrray");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int j=0;j<arr.length-1;j++)
		{
			while((arr[j]!=arr[j+1])&&(arr[j]>1))
					{
				temp=arr[j];
				arr[j]=arr[temp-1];
				arr[temp-1]=temp;
				
				
					}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}
