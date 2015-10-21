public class Main {

	public static void main(String args []) {

		// EightQueen queen = new EightQueen();
		// queen.solve(0);
		  int [] array = {1,2,3};
		//int [] array  = {1,2,3,4,5,6,7};

		// array =  ArrayShuffle.shuffle(array);
		// Utils.printArray(array);
		//System.out.println(Prime.isPrime(12)+"");
		Permutation perm = new Permutation(array);
		perm.printPermutate();
	}
}