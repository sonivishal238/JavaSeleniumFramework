package BinarySearchQuestions;

public class FirstAndLastOccuranceOfElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		
		int first = firstOccurance(arr, 5);
		int last = lastOccurance(arr, 5);
		System.out.println("first:" + first);
		System.out.println("last:" + last);
		System.out.println("Total:" + (last+1 - first));
	}

	static int firstOccurance(int[] arr, int key) {
		
		int s = 0, length = arr.length, e = length - 1;
		int mid = s + (e-s)/2;
		int ans = -1;
		
		while(s < e) {
			
			if(arr[mid] == key) {
				ans = mid;
				e = mid-1;
			}
			
			else if(key > arr[mid]) { // right me jaao
				s = mid+1;
			}
			
			else if(key < arr[mid]){ // left me jaao
				e = mid - 1;
			}
			
			mid = s + (e-s)/2;
		}
		
		return ans;
	}
	
	static int lastOccurance(int[] arr, int key) {
		
		int s = 0, length = arr.length, e = length - 1;
		int mid = s + (e-s)/2;
		int ans = -1;
		
		while(s < e) {
			
			if(arr[mid] == key) {
				ans = mid;
				s = mid+1;
			}
			
			else if(key > arr[mid]) { // right me jaao
				s = mid+1;
			}
			
			else if(key < arr[mid]){ // left me jaao
				e = mid - 1;
			}
			mid = s + (e-s)/2;
		}
		
		return ans;
	}

}
