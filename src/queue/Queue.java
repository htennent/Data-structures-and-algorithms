package queue;
import java.util.ArrayList;

public class Queue<T> {
	
	private ArrayList<T> queue;
	private int head = 0;
	private int tail = 0;

	public Queue() {
		super();
		this.queue = new ArrayList<T>();
		
	}
	
	public void enque(T input) {
		if(input == null) {
			throw new IllegalArgumentException("Input must not be null");
		}else {
			this.queue.add(input);
			this.tail ++;
		}
	}
	
	public void deque() {
		if(this.tail > this.head) {
			this.head++;
		}
	}
	
	public T getFront() {
		return queue.get(head);
	}

}
