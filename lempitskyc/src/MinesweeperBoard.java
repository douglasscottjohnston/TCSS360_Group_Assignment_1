public class MinesweeperBoard {

	public static char[][] getHints(char[][] theArr) {
		 char[][] hintArr = new char[theArr.length][theArr[0].length];
		 
		 for (int i = 0; i < theArr.length; i++) {
				for (int j = 0; j < theArr[i].length; j ++) {
						hintArr[i][j] = checkForBombs(theArr, i, j);
				}
		 }
		
		return hintArr;
	}
	
	public static char checkForBombs(char[][] theArr, int row, int col) {
		
		char temp;
		int count = 0;
		int maxR = theArr.length - 1;
		int maxC = theArr[0].length - 1;
		if(theArr[row][col] == '*') {
			return '*';
		} if(row - 1 >= 0 && theArr[row - 1][col] == '*') { //N
			count++;
			
		}if(row - 1 >= 0 && col + 1 <= maxC && theArr[row - 1][col + 1] == '*') { //NE
			count++;
			
		}if(col + 1 <= maxC && theArr[row][col + 1] == '*') { //E
			count++;
			
		}if(row + 1 <= maxR && col + 1 <= maxC && theArr[row + 1][col + 1] == '*') { //SE
			count++;
			
		}if(row + 1 <= maxR &&theArr[row + 1][col] == '*') { //S
			count++;
			
		}if(row - 1 >= 0 && col - 1 >= 0 && theArr[row - 1][col - 1] == '*') { //SW
			count++;
			
		}if(col - 1 >= 0 && theArr[row][col - 1] == '*') { //W
			count++;
			
		}if(row + 1 <= maxR && col - 1 >= 0 && theArr[row + 1][col - 1] == '*') { //NW
			count++;
			
		}
		
		count = count + 48;
		temp = (char) count;
		return temp;
	}
	
	public static void printArr(char[][] theArr) {
		
		for (int i = 0; i < theArr.length; i++) {
			for (int j = 0; j < theArr[i].length; j ++) {
					System.out.print(theArr[i][j] + "");
			}
			System.out.print("\n");
		}
		
	}
}
