package recursion;

public class LinearSearch {

	public static void main(String[] args) {

		System.out.println(linearSearch(new int[] {3,5,1,2,6}, 2, 5));

	}

	private static boolean linearSearch(int[] arr, int key, int size) {
		
		if(size == 0)
			return false;
		
		return searchHelper(arr, key, size, 0);
		
	}

	private static boolean searchHelper(int[] arr, int key, int size, int index) {
		if(index == size)
			return false;
		
		if(arr[index] == key)
			return true;
		
		return searchHelper(arr, key, size, index + 1);
	}

}
