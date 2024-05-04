package leetCodeArray;

import java.util.Scanner;

public class FindMinMaxInArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		System.out.println("Enter 5 array elements");
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("max value is: " + getMax(arr));
		System.out.println("min value is: " + getMin(arr));
	}
	
	static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		
		return max;
	}
	
	static int getMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		
		return min;
	}

}
