package csw;
import java.util.*;
public class Graph1 {
	Vertex V[];
	int adj[][];
	int vertexCount;
	
	public Graph1() {
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
	
	public void BFS(Vertex source) {
		Queue<Character>q=new ArrayDeque<Character>();
		int sourceIndex=search(source);
		V[sourceIndex].visited=true;
		V[sourceIndex].display();
		q.add(V[sourceIndex].label);
		
		while(!q.isEmpty()) {
			char curr=q.remove();
			int indexCurrentVertex=search(new Vertex(curr));
			if(indexCurrentVertex!=sourceIndex)
			{
				V[indexCurrentVertex].visited=true;
				V[indexCurrentVertex].display();	
			}
			for(int i=0;i<vertexCount;i++) {
				if(adj[indexCurrentVertex][i]==1 && V[i].visited==false) {
					
					q.add(V[i].label);
				}
				
			}
			
		}
	}
	
}
