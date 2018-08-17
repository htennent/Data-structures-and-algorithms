package com.htennent.syntaxchecker;
import com.htennent.datastructures.Stack;

public class Checker {
	
	private Stack<Character> stack = new Stack<Character>();

	public Checker() {
		super();
	}
	
	public boolean checkBalanced(String input) {
		if(input == null) {
			throw new IllegalArgumentException("Input must not be null");
		}
		for(char c : input.toCharArray()) {
			if(c == '{' || c == '(' || c == '[' || c == '"' || c == '\'' ) {
				stack.push(c);
			}else if(c == '}' || c == ')' || c == ']' || c == '"' || c == '\'' ) {
				if(!stack.pop()) {
					System.out.println("Following character doesn't have a pair : "  + c);
					return false;
				}
			}	
		}
		
		if(stack.isEmpty()) {
			return true;
		}else {
			System.out.println("Following characters don't have a pair");
			while(!stack.isEmpty()) {
				System.out.println(stack.topAndPop());
			}
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checker checker = new Checker();
		
		System.out.println(checker.checkBalanced("{{}}"));

	}

}
