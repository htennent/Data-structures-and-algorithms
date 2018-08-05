package stack;
import java.util.ArrayList;

public class Stack<T> {
	
	private int head = -1;
	private ArrayList<T> stack = new ArrayList<T>();
	
	public Stack(){
		super();
	}
	
	/**
	 * Add data to the head of the Stack, increment the head index
	 * @param data
	 */
	public void push(T data) {
		if(data == null) {
			throw new IllegalArgumentException("Cannot push null values");
		}
		this.stack.add(data);
		this.head++;
	}
	
	/**
	 * Take the top element off of the stack without returning it
	 */
	public boolean pop() {
		if(!this.isEmpty()) {
			this.head--;
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 
	 * @return the top element in the stack
	 */
	public T top() {
		if(!this.isEmpty()) {
			return this.stack.get(head);
		}else {
			throw new NullPointerException("Stack is currently empty");
		}
		
	}
	
	/**
	 * Remove and return the top element in the stack
	 * @return the top element in the stack
	 */
	public T topAndPop() {
		if(!this.isEmpty()) {
			T ret = null;
			ret = this.top();
			this.head--;
			return ret;
		}else {
			throw new NullPointerException("Stack is currently empty");

		}
	}
	
	public ArrayList<T> popAll() {
		
		ArrayList<T> retList = new ArrayList<T>();
		
		while(head > -1) {
			retList.add(this.topAndPop());
		}
		
		return retList;
		
	}
	
	/**
	 * Check to see if the stack has elements in it
	 * @return boolean
	 */
	public boolean isEmpty() {
		if(this.head == -1) {
			return true;
		}
		return false;
	}
}
