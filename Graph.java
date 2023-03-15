package csw;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
	Vertex V[];
	int adj[][];
	int vertexCount;
	
	public Graph() {
		V=new Vertex[10];
		adj=new int[10][10];
		vertexCount=0;
	}
	
	public void addVextex(Vertex newVertex) {
		V[vertexCount]=newVertex;
		vertexCount++;
	}
	
	public void addEdge(Vertex source,Vertex destination) {
		int sourceIndex=search(source);
		int destinationIndex=search(destination);
		adj[sourceIndex][destinationIndex]=1;
	}
	
	public int search(Vertex tempV) {
		for(int i=0;i<vertexCount;i++) {
			if(V[i].label==tempV.label)
				return i;
		}
		return -1;
	}
	
	public void DFS(Vertex source) {
		Stack<Character>s=new Stack<Character>();
		int sourceIndex=search(source);
		V[sourceIndex].visited=true;
		V[sourceIndex].display();
		s.push(V[sourceIndex].label);
		
		while(!s.isEmpty()) {
			char curr=s.pop();
			int indexCurrentVertex=search(new Vertex(curr));
			if(indexCurrentVertex!=sourceIndex)
			{
				V[indexCurrentVertex].visited=true;
				V[indexCurrentVertex].display();	
			}
			for(int i=0;i<vertexCount;i++) {
				if(adj[indexCurrentVertex][i]==1 && V[i].visited==false) {
					
					s.push(V[i].label);
				}
				
			}
			
		}
	}
	
}
