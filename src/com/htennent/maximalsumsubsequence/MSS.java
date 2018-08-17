package com.htennent.maximalsumsubsequence;

public class MSS {
	
	public MSS() {
		super();
		
	}
	
	/**
	 * Gets the maxmimal subsequence in O(N) 
	 * 
	 * @param input An array of integers, can be positive and negative
	 * @return The sum of the greatest subset in the input array
	 */
	
	private int subsequence(int[] input) {
		int maxToPoint = 0;
		int maxOverall = 0;

		
		for(int i : input) {
			maxToPoint += i;
			if(maxOverall < maxToPoint) {
				maxOverall = maxToPoint;
			}
		}		
		
		return maxOverall;
		
	}
	
	public static void main(String args[]) {
		
		MSS obj1 = new MSS();
		int[] test = {7,3,8,-5,-15,6,9,11,-8,-5};
		int[] test2 = {1,11,-9,-20,7,10,-6,3,4,-2};
		
		System.out.println(obj1.subsequence(test));
		System.out.println(obj1.subsequence(test2));
				
	}

}
