package leetCodeArray;

import java.util.Arrays;

public class ShiftZeroToEndOfArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 0, 8, 0, 9, 0, 89, 11, 0, 56};
		
		// sort array then left shift equal to the number of zero to move them at the end of the array
		
		moveZeros(arr);
		for(int num : arr) {
			System.out.print(num+" ");
		}

	}

	// Two pointer approach
	static void moveZeros(int arr[]) {
	
		int nonZero = 0;
		
		for(int j = 0; j<arr.length; j++) {
			if(arr[j]!=0) {
				
				int temp = arr[nonZero];
				arr[nonZero] = arr[j];
				arr[j] = temp;
				nonZero++;
			}
		}
	}
	// Left shift approach
	static int[] leftShift(int[] arr) {
		
		Arrays.sort(arr);
		int noOfLeftShifts = 0;
		int i = 0;
		while(arr[i] == 0) {
			noOfLeftShifts++;
			i++;
		}
		
        int n = arr.length;
        noOfLeftShifts = n - noOfLeftShifts;
        int[] temp = new int[n];

        for(i = 0; i < n; i++){
            temp[(i+noOfLeftShifts)%n] = arr[i];
        }

        return temp;	
		
	}
}
