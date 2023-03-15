package csw;
import java.util.*;
class InfixToPostfix{
static String infixconversionpostfix(String Infix)
{
	String Postfix="";
	Stack<Character> st=new Stack<>();
	Infix+=')';
	st.push('(');
	for(int i=0;i<Infix.length();i++)
	{
		char ch=Infix.charAt(i);
		
		switch(ch)
		{
		case '(':
			st.push(ch);
			break;
		case ')':
			while(st.peek()!='(')
			{
				char c=st.pop();
				Postfix+=c;
			}
			st.pop();
			break;
		case '+':
		case '-':
		case '*':
		case '/':
			  if(st.peek()=='(')
				  st.push(ch);
			  else
			  {
				  while(priority(st.peek())<=priority(ch))
				  {
					  st.push(ch);
				  }
			  }
			  break;
	     default: Postfix+=ch;
	              break;
		}
	}
	return Postfix;
	
}
 static int priority(char chr)

{
	if(chr=='*'||chr=='/')
		return 2;
	else 
		return 1;
}
}
public class InfixToPostfixStack {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter an infix expression");
	 String infi=sc.nextLine();
	 InfixToPostfix ob=new InfixToPostfix();
	 System.out.println(ob.infixconversionpostfix(infi));
	 
 }
}
