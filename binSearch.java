package csw;
import java.util.*;
public class binSearch{

	public static int BinarySearch(int nums[],int target)
	{
		int start=0;
		int end=(nums.length)-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			System.out.println(mid);
			if(target==nums[mid])
			{
				return mid;
			}
			if((nums[mid]-nums[mid-1])<nums[mid]-target)
			{
				start=mid+1;
				System.out.println(start);
			}
			else
			{
				end=mid-1;
				System.out.println(end);
			}
		}
		return -1;
		
	}
	public static void main(String args[])
	{
		int nums[]= {4,5,6,7,0,1,2};
		int target=2;
		System.out.println(BinarySearch(nums,target));
	}
	
}
