package csw;
import java.util.*;
public class PostfixEvaluate {
		static String inp="23+1-4";
		static int op1,op2;
		static int output;
	public static void main(String args[]) {
	Stack<Integer> s=new Stack<Integer>();
	for(int i=0;i<inp.length();i++)
	{          
		char ch=inp.charAt(i);
		if(isOperator(ch))
		{
			op2=s.pop();
			op1=s.pop();
			s.push(Calculate(op1,op2,ch));
		}
		else {
			s.push(Character.getNumericValue(inp.charAt(i)));
		}
	}
	System.out.println(s);
		}
	public static boolean isOperator(char ch)
	{
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
			return true;
		
		else return false;
	}
	public static int Calculate(int op1,int op2,char ch)
	{
		int output=1;
		if(ch=='+')
			output=op1+op2;
		else if(ch=='-')
			output=op1-op2;
		else if(ch=='*')
			output=op1*op2;
		else if(ch=='/')
			output=op1/op2;
		return output;
	}
	}
