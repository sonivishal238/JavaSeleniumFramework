package recursion;

public class SumOfArrayElements {

	public static void main(String[] args) {
		System.out.println(printSum(new int[] {1,2,3,4,5,6,7,1,31}, 9));

	}

	private static int printSum(int[] arr, int size) {
		
		if(size == 1)
			return arr[0];
		
		return sumHelper(arr, 0, size, 0);
		
	}
	
	static int sumHelper(int[] arr, int index, int size, int sum) {
		
		if(index == size)
			return sum;
		
		return sumHelper(arr, index + 1, size, sum + arr[index]);
	}

}
