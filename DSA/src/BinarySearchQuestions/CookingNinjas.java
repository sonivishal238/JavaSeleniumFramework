package BinarySearchQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class CookingNinjas {

	public static void main(String[] args) {
		ArrayList<Integer> ranks = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		
		System.out.println("Answer is : " + getValue(ranks, 11));
	}
	
	static int getValue(ArrayList<Integer> ranks, int noOfDishes) {
		
        int s = 1;
        int e = Integer.MAX_VALUE; // Upper bound estimation
        
        int mid;
        int ans = -1;
        
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (isPossibleSolution(ranks, noOfDishes, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        
        return ans;
    }

    private static boolean isPossibleSolution(ArrayList<Integer> ranks, int noOfDishes, int mid) {
        int totalDishes = 0;
        
        for (int rank : ranks) {
            int time = 0;
            int dishes = 0;
            int increment = rank;
            
            while (time + increment <= mid) {
                dishes++;
                time += increment;
                increment += rank;
            }
            
            totalDishes += dishes;
            if (totalDishes >= noOfDishes) {
                return true;
            }
        }
        
        return totalDishes >= noOfDishes;
    }

}
