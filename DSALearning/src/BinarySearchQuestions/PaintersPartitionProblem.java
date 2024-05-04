package BinarySearchQuestions;

import java.util.ArrayList;
import java.util.List;

public class PaintersPartitionProblem {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(
				
				List.of(10, 20, 30, 40));
		System.out.println("Answer is : " + getValue(list, list.size(), 2));
	}
	
	static int getValue(ArrayList<Integer> list, int size, int noOfPainters) {
		
		int s = 0, e = 0;
		
		for(int val: list) {
			e+=val;
		}
		
		int mid = s + (e-s)/2;
		int ans = -1;
		
		while(s <= e) {
			if(isPossibleSolution(list, size, noOfPainters, mid)) {
				ans = mid;
				e = mid - 1;
			}
			
			else {
				s = mid + 1;
			}
			
			mid = s + (e-s)/2;
		}
		
		return ans;
	}

	
	private static boolean isPossibleSolution(ArrayList<Integer> list, int size, int noOfPainters, int mid) {
		
		int studentCount = 1;
		int pagesCount = 0;
		
		for(int i = 0; i < size; i++) {
			if(pagesCount+list.get(i) <= mid) {
				pagesCount+=list.get(i);
			}
			
			else {
				studentCount++;
				if(studentCount > noOfPainters || list.get(i) > mid) {
					return false;
				}
				
				pagesCount = 0;
				pagesCount = list.get(i);
			}
		}
		return true;
	}

}
