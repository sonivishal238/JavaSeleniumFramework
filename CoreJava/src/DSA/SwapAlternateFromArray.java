package DSA;

public class SwapAlternateFromArray {

	public static void main(String[] args) {
		int evenSizedArray[] = {5,2,9,4,7,6,1,0};
		int oddSizedArray[] = {11, 33, 9, 76, 43};
		
		// For even
		System.out.println("Even:");
		swapAlternate(evenSizedArray, 8);
		printArray(evenSizedArray, 8);
		
		// For odd
		System.out.println("Odd:");
		swapAlternate(oddSizedArray, 5);
		printArray(oddSizedArray, 5);
	}
	
	static void swapAlternate(int arr[], int size) {
	
		for(int i = 0; i<size; i+=2) {
			if(i+1 < size) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
	}
	
	static void printArray(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	
}
