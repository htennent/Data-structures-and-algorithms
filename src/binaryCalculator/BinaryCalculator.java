package binaryCalculator;
import java.util.ArrayList;

import stack.Stack;

public class BinaryCalculator {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	public BinaryCalculator() {
		super();
	}
	
	private ArrayList<Integer> calculate(int input) {
		
		
		while (input > 0) {
			this.stack.push(input%2);
			input = (int) Math.floor(input/2);
		}
		
		
		return stack.popAll();
	}
	
	public static void main(String[] args)
	{
		BinaryCalculator calc = new BinaryCalculator();
		
		ArrayList<Integer> list = calc.calculate(51);
		
		for(Integer i : list) {
			System.out.print(i);
		}
	}

}
