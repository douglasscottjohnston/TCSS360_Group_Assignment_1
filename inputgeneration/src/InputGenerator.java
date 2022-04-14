import java.util.Random;

public class InputGenerator {

	public static void main(String[] theArgs) {
		
		int rows = 14;
		int columns = 23;
		int bombPercentage = 70;
		int exicutions = 10;

		Random random = new Random();

		char[][] out;

		if(theArgs.length > 0) {
			try {
				exicutions = Integer.parseInt(theArgs[0]);
			} catch (NumberFormatException ex) {
				System.err.println("Argument " + theArgs[0] + " must be an integer");
				System.exit(1);
			}
		}


		for(int j = 0; j < exicutions; j++) {
			out = createArray(rows, columns, bombPercentage);
			rows += random.nextInt(0, 50);
			columns += random.nextInt(0, 50);
			bombPercentage = (bombPercentage + random.nextInt(0, 50)) % 100;
			for (int i = 0; i < out.length; i++) {
				System.out.println(new String(out[i]));
			}
		}

		System.out.print("0 0");
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
