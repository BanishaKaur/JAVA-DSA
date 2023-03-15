package csw;
import java.util.*;
public class Vertex1 {
	char label;
	boolean visited;
	
	public Vertex1(char label) {
		this.label=label;
		visited=false;
	}
	
	public void display() {
		System.out.println(label);
	}
}
