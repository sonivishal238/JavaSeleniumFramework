package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {1,2,3,67,78,666}, 67, 0, 5));

	}

	private static int binarySearch(int[] arr, int key, int start, int end) {
		
		// baseCase
		if(arr.length == 0 || start > end)
			return -1;
		
		if(arr[0] == key) {
			return 0;
		}
		
		int mid = start + (end-start)/2;
		
        if(arr[mid] == key) // key is found
            return mid;
		
        if(arr[mid] < key) // search in right part
            return binarySearch(arr , key, mid + 1 , end); // recurrence relation
        else // search in left part
            return binarySearch(arr , key,  start , mid - 1);// recurrence relation
	}

}
