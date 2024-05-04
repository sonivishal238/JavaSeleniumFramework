package multiDimentionalArrays;

public class SpiralPrint {

	public static void main(String[] args) {

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		spiralPrint(myNumbers);

	}


	public static void spiralPrint(int matrix[][]) {
		int row = matrix.length;
		if(row == 0){
			return;
		}	
		int col = matrix[0].length;

		int total = row * col;
		int count = 0;

		int startingRow = 0;
		int startingCol = 0;
		int endingRow = row - 1;
		int endingCol = col - 1;

		while (count < total) {

			// print starting row
			for (int index = startingCol; count < total && index <= endingCol; index++) {
				System.out.print(matrix[startingRow][index]+" ");
				count++;
			}

			startingRow++;

			// printing ending column
			for (int index = startingRow; count < total && index <= endingRow; index++) {
				System.out.print(matrix[index][endingCol]+" ");
				count++;
			}

			endingCol--;

			// Printing ending row
			for (int index = endingCol; count < total && index >= startingCol; index--) {
				System.out.print(matrix[endingRow][index]+" ");
				count++;
			}

			endingRow--;

			// print first column
			for (int index = endingRow; count < total && index >= startingRow; index--) {
				System.out.print(matrix[index][startingCol]+" ");
				count++;
			}

			startingCol++;
		}

	}
}
