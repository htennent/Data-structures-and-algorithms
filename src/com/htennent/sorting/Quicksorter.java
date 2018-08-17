package com.htennent.sorting;
import java.util.Arrays;

public class Quicksorter<T extends Comparable<T>> implements Sorter{

	private final T[] input;
	public Quicksorter(T[] input) {
		this.input = input;
	}
	@Override
	public T[] sort() {
		return sortHelper(this.input, 0, this.input.length-1);
	}
	
	
	private T[] sortHelper(T[] input, int low, int high) {
		
		if(low < high) {
			int partitionIndex = this.partition(input, low, high);
			
			this.sortHelper(input, low, partitionIndex -1);
			this.sortHelper(input, partitionIndex+1, high);
		}
		
		
		return input;
	}
	
	private int partition(T[]input, int low, int high) {
		T pivot = input[high];
		int i = low - 1;
		
		for(int j = low; j < high - 1; j++) {
			if(input[j].compareTo(pivot) < 1) {
				i++;
				T temp = input[i];
				input[i] =  input[j];
				input[j] = input[i];
			}
		}
		
		T temp = input[i+1];
		input[i+1] = pivot;
		input[high] = temp;
		
		return i+1;
	}

	public static void main(String[] args)
	{
		Integer[] unsortedInt = {65, 98, 38, 84, 17, 3, 52, 97, 86, 83, 50, 44, 19, 82, 23, 5, 58, 79, 71, 72, 53, 42, 78, 10, 68, 92, 49, 99, 93, 61, 9, 14, 62, 13, 6, 54, 48, 15, 94, 73, 8, 34, 18, 56, 22, 4, 91, 20, 96, 46};
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

