package recursion;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		
	}
	
	static boolean isSorted(int arr[], int size) {
		
		if(size <=1) return true;
		return sortedHelper(arr , 1 , size);
	}
	
    static boolean sortedHelper(int[] arr , int idx , int size){
        //base case
        if(idx == size)
            return true;

        //case to check previous element is greater than current element
        if(arr[idx - 1] > arr[idx])
            return false;
        return sortedHelper(arr , idx + 1 , size); // if reached till here we have to check for remaining element
    }
}
