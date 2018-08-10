package linkedList;

public class Node<T> {
	
	public T data;
	public Node<T> next;

	public Node(T data, Node<T> next) {
		super();
		if(data == null) {
			throw new IllegalArgumentException("Data must not be null");
		}
		this.data = data;
		this.next = next;
	}

}
