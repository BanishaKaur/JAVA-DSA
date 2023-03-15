package csw;
import java.util.*;
public class main1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Graph1 g1=new Graph1();
		char input=' ';
		while(input!='0') {
			System.out.println("enter vertex,to break enter 0"); 
			input=sc.next().charAt(0);
			g1.addVextex(new Vertex(input));
		}	
		char start=' ';
		char end=' ';
		while(start!='0') {
			System.out.println("enter start vertex and end vertex,to break enter start vertex 0");
			start=sc.next().charAt(0);
			end=sc.next().charAt(0);
			g1.addEdge(new Vertex(start),new Vertex(end));
		}
		System.out.println("enter source vertex");
		input=sc.next().charAt(0);
		Vertex source=new Vertex(input);
		g1.BFS(source);
		}
		

}
