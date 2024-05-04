package sdetInterviewQuestions;

public class SmallestAndLargestNumberFromArray {

	public static void main(String[] args) {
		
		int numbers[] = {-9, 45, 2, 46, 90, 88, 66, 34};

		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 1; i< numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
			
			else if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Smallest: "+ smallest);
		System.out.println("Largest: " + largest);
	}
}
