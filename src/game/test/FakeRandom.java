package game.test;

import java.util.Random;
import java.util.Stack;

public class FakeRandom extends Random {
	private static final long serialVersionUID = 5309926945973436798L;
	private Stack<Integer> moves;
	private Random realRandom;
	
	public FakeRandom(Stack<Integer> fixedNumbers) {
		moves = fixedNumbers;
		realRandom = new Random();
	}
	
	 public int nextInt(int n) {
		 if ( moves.empty() ) {
			 return realRandom.nextInt(n);
		 } else {
			 return moves.pop();
		 }
			 
	 }
}