package leetCodeArray;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 1, 1, 3 };

		System.out.println(uniqueOccurrences(arr));
	}

	public static boolean uniqueOccurrences(int[] arr) {
		int len = arr.length;
		if (len == 1 || len == 0)
			return true;
		Set<Integer> resultSet = new LinkedHashSet<Integer>();
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			}

			else {
				map.put(num, 1);
			}
		}

		for (int val : map.values()) {
			if (!resultSet.add(val)) {
				return false;
			}
		}
		return true;
	}

}
