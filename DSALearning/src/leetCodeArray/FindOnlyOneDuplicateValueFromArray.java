package leetCodeArray;

public class FindOnlyOneDuplicateValueFromArray {

	public static void main(String[] args) {
		/*
		 * Array of size n diya hai jisme 1-n-1 tak ki values atleast 1 baar hogi hi hogi.
		 * Only 1 value repeat hogi, usko find krna hai
		 * 
		 * Solution: 1 se n-1 tak ke array se problem array ko XOR krvaadenge
		 * Solution:2 Sum krke bhi nikal skte ho
		 */
		
		int arr[] = {1,2,3,4,3};
		int answer = 0;
		
		// XOR all elements
		for(int i = 0; i < arr.length; i++) {
			answer = answer^arr[i];
		}
				
		
		// XOR [1, n-1]
		for(int i = 1; i < arr.length; i++) {
			answer = answer^i;
		}
		
		System.out.println(answer);

	}

}
