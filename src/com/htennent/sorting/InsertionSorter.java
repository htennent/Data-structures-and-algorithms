package com.htennent.sorting;

import com.htennent.helloworld.HelloWorld;

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {
	
	private final T[] input;

	public InsertionSorter(T[] input) {
		super();
		this.input = input;
	}

	@Override
	public T[] sort() {
		for(int i = 1; i < this.input.length; i++) {
			int j = i;
			while(j > 0 && (this.input[j-1].compareTo(this.input[j]) > 0)) {
				T temp = this.input[j-1];
				this.input[j-1] = this.input[j];
				this.input[j] = temp;
				j--;
			}
		}
		return input;
	}
	
	public static void main(String[] args)
	{
		Integer[] unsortedInt = {6,9,1,6,3,4,12,2,17,5,9};
		InsertionSorter<Integer> intSorter = new InsertionSorter<Integer>(unsortedInt);
		
		Integer[] sortedInt = intSorter.sort();
		
		for(int i : sortedInt) {
			System.out.print("" + i + ",");
		}
		
		System.out.println("\n");
		
		String[] unsortedString = {"j","M","5","4","v","4","b","A","s","A","2","I","K","s","G","V","x","b","9","t"};
		InsertionSorter<String> stringSorter = new InsertionSorter<String>(unsortedString);
		
		String[] sortedString = stringSorter.sort();
		for(String i : sortedString) {
			System.out.print(i + ",");
		}
		
		
	}

	

}
