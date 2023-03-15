package csw;

public class Vertex {
		char label;
		boolean visited;
		
		public Vertex(char label) {
			this.label=label;
			visited=false;
		}
		
		public void display() {
			System.out.println(label);
		}
		
	}

