package sdetInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// We need to return 
public class TwoSum {

	public static void main(String[] args) {
	
		Arrays.stream(getTwoSumIndexes(new int[]{2, 11, 7, 25, 1, 56, 78, 9, 10}, 10)).forEach(x -> System.out.println(x));
	}
	
	static int[] getTwoSumIndexes(int[] arr, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			int comp = target - arr[i];
			
			if(map.containsKey(comp)) {
				return new int[] {map.get(comp), i};
			}
			
			map.put(arr[i], i);
		}
		return null;
	}

}
