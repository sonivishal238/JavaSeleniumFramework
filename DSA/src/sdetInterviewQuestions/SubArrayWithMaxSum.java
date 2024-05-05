package sdetInterviewQuestions;

public class SubArrayWithMaxSum {

	public static void main(String[] args) {
		/*
		 * Array me aise subarray jiska sub maximum ho, usme max sum dena hai
		 */
		
		int arr[] = {-1,4,-6,8};
		
		// Assume that first subarray has the max sum
		int currentSum = arr[0];
		int maxSum = arr[0];
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > currentSum + arr[i])
				currentSum= arr[i];
			
			else {
				currentSum += arr[i];
			}
			if(currentSum > maxSum)
				maxSum = currentSum;
		}
		
		System.out.println(maxSum);
	}

}
