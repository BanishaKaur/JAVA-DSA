package csw;
import java.util.*;
public class RevStck {

		static int top=-1;
		 
		boolean isEmpty()
		{
			return(top==-1);
		}
		static void Rev(Stack<Character> str)
		{ while(top!=-1) {
			System.out.print(str.peek());
			str.pop();
		}
		}
			public static void main(String args[]){

				Stack<Character> str=new Stack<>();
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a string");
				String st=sc.nextLine();
				for(int i=0;i<st.length();i++)
				{
					char ch=st.charAt(i);
					str.push(ch);
					top++;
				}
				Rev(str);
				
			}
	}

