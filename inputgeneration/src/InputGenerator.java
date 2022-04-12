public class InputGenerator {

	public static void main(String[] theArgs) {
		
		final int rows = 100;
		final int columns = 100;
		final int bombPercentage = 100;

		MinesweeperBoard.printArr(createArray(rows, columns, bombPercentage));

		//rows columns bombPercentage random randomR randomC randomB
	}

	private static char[][] createArray(final int theRows, final int theCols, final int theBombPer) {
		
		char[][] hintArr = new char[theRows][theCols];
		
		for (int i = 0; i < theRows; i++) {
			for (int j = 0; j < theCols; j ++) {
				double randNumber = Math.random();
				double percent = randNumber * 100;
				if(percent < theBombPer) {
					hintArr[i][j] = '*';
				} else {
					hintArr[i][j] = '.';
				}
			}
		}
		System.out.print(theRows + " ");
		System.out.println(theCols);
		return hintArr;
		
	}


}
