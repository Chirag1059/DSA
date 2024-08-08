package Graph;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mygraph g=new Mygraph();
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(2, 3);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(4, 5);
		g.addEdge(5, 3);
		g.display();
	}

}
