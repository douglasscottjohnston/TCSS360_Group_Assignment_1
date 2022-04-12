/**
 * The class that generates minesweeper boards
 *
 * @author Douglas Johnston
 */
public class BoardGenerator {

    static final char MINE = '*';

    final char[][] myBoard;
    final String[] myRows;

    public BoardGenerator(final char[][] theBoard, final String[] theRows) {
        myBoard = theBoard;
        myRows = theRows;
        generateBoard();
        generateNums();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (char[] a : myBoard) {
            for (char c : a) {
                sb.append(c);
            }
            sb.append('\n');
        }

        return sb.toString();
    }

    /**
     * Creates the board from the rows
     */
    private void generateBoard() {
        for (int i = 0; i < myBoard.length; i++) {
            myBoard[i] = myRows[i].toCharArray();
        }
    }

    /**
     * generates the numbers in each node through a simple search
     */
    private void generateNums() {
        for (int i = 0; i < myBoard.length; i++) {
            for (int j = 0; j < myBoard[i].length; j++) {
                if(myBoard[i][j] != MINE) {
                    myBoard[i][j] = (char) (countAdjacentMines(i, j) + 48);
                }
            }
        }
    }

    private int countAdjacentMines(int row, int col) {
        int adjMines = 0;


        // top left
        if(row > 0 && col > 0) {
            if(myBoard[row - 1][col - 1] == MINE) {
                adjMines++;
            }
        }

        // top mid
        if(row > 0) {
            if(myBoard[row - 1][col] == MINE) {
                adjMines++;
            }
        }

        // top right
        if(row > 0 && col < myBoard[row].length - 1) {
            if(myBoard[row - 1][col + 1] == MINE) {
                adjMines++;
            }
        }

        // mid left
        if(col > 0) {
            if(myBoard[row][col - 1] == MINE) {
                adjMines++;
            }
        }

        // mid right
        if(col < myBoard[row].length - 1) {
            if(myBoard[row][col + 1] == MINE) {
                adjMines++;
            }
        }

        // bottom left
        if(row < myBoard.length - 1 && col > 0) {
            if(myBoard[row + 1][col - 1] == MINE) {
                adjMines++;
            }
        }

        // bottom mid
        if(row < myBoard.length - 1) {
            if(myBoard[row + 1][col] == MINE) {
                adjMines++;
            }
        }

        // bottom right
        if(row < myBoard.length - 1 && col < myBoard[row].length - 1) {
            if(myBoard[row + 1][col + 1] == MINE) {
                adjMines++;
            }
        }

        return adjMines;
    }
}
