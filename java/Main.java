public class Main {

	public static void main(String args []) {

		// EightQueen queen = new EightQueen();
		// queen.solve(0);
		  int [] array = {1,2,3};
		//int [] array  = {1,2,3,4,5,6,7};

		// array =  ArrayShuffle.shuffle(array);
		// Utils.printArray(array);
		//System.out.println(Prime.isPrime(12)+"");
		// Permutation perm = new Permutation(array);
		// perm.printPermutate();
		// Fibo fibo = new Fibo(7);
		// fibo.printFibo();
		// DecimalConverter converter = new DecimalConverter(44832109);
		// converter.printAll();

		//graph.printGraph();
		// Graph graph = Graph.createSampleGraph();
		Dijkstra dijkstra = new Dijkstra();
		dijkstra.findShortestPath(0);
			
	}
}