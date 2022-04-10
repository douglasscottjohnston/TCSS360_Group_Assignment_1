import java.util.Scanner;

public class Main {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {
        int field = 1;
        int rlen = 1;
        int clen = 1;
        while(SCAN.hasNextInt() && (rlen != 0 && clen !=  0)) {
            rlen = SCAN.nextInt();
            clen = SCAN.nextInt();
            if(rlen == 0 && clen == 0) {
                System.exit(0);
            }
            SCAN.nextLine();
            generateOutput(createBoardGenerator(rlen, clen), field);
            field++;
        }
        System.exit(0);

    }

    /**
     * Creates a new board generator from the input
     * @param theRLen the row length
     * @param theCLen the column length
     * @return the board generator made from the input
     */
    private static BoardGenerator createBoardGenerator(final int theRLen, final int theCLen) {
        char[][] board = new char[theRLen][theCLen];
        String[] rows = new String[theRLen];

        for (int i = 0; i < theRLen; i++) {
            rows[i] = SCAN.nextLine();
        }

        return new BoardGenerator(board, rows);
    }

    /**
     * Generates the output based on the board generator and the field number
     * @param theGen The board generator
     * @param theField The field number
     */
    private static void generateOutput(final BoardGenerator theGen, final int theField) {
        System.out.printf("Field #%d:%c", theField, '\n');
        System.out.println(theGen.toString());
    }
}
