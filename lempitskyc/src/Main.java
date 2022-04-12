import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {

		final Scanner SCAN = new Scanner(System.in);

		int rows = 0;
		int columns = 0;
		int fieldCount = 1;
		
		while (SCAN.hasNext()) {
			if (SCAN.hasNextInt()) {
				rows = SCAN.nextInt();
				columns = SCAN.nextInt();

				if(rows == 0 && columns == 0) {
					break;
				}
				System.out.println("Field #" + fieldCount + ":");
				SCAN.nextLine();
			}
			
			char [][] inputArr = createInputArr(rows, columns, SCAN);
			char [][] hintArr = MinesweeperBoard.getHints(inputArr);
			MinesweeperBoard.printArr(hintArr);
			fieldCount++;
			System.out.println();
		}
	}
	
	public static char[][] createInputArr(int theRows, int theColumns, Scanner SCAN) {
		
		char[][] inputBoard = new char[theRows][theColumns];
		
		for(int i = 0; i < theRows; i++) {
			char[] row = SCAN.nextLine().toCharArray();
			inputBoard[i] = row;
		}
		return inputBoard;
	}

}
