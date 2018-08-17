package com.htennent.datastructures;

public class SingleLinkedList<T>{
	
	private Node<T> head;
	private Node<T> tail;
	private int length;

	public SingleLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}


	public void addFirst(Node<T> node) {
		if(node == null) {
			throw new IllegalArgumentException("Node cannot be Null");
		}
		if(this.head == null) {
			this.head = node;
			this.tail = node;
		}else { 
			node.next = head;
			this.head = node;
			
		}
		
	}

	public void addLast(Node<T> node) {
		if(node == null) {
			throw new IllegalArgumentException("Node cannot be Null");
		}
		if(this.head == null){
			this.head = node;
			this.tail = node;
		}else {
			this.tail.next = node;
			this.tail = node;
		}
		
	}

	public void delete(Node<T> node) {
		if(node == null) {
			throw new IllegalArgumentException("Node cannot be Null");
		}
		if(this.head == null){
			throw new IllegalArgumentException("Cannot delete from an empty list");
		}else {
			Node<T> temp = head;
			Node<T> prev = null;
			while(temp!=node && temp!=null) {
				prev = temp;
				temp = temp.next;
			}
			if(temp == null) {
				throw new IllegalArgumentException("Element does not exist in list");
			}else {
				if(temp == tail) {
					prev.next = null;
					tail = prev;
				}
				else {
					prev.next = temp.next;
				}
			}
		}
	}


}
