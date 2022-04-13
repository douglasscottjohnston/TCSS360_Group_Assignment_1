public class Minefield {

    final char[][] myField;
    final String[] myHeight;

    static final char MINE = '*';

    public Minefield(final char[][] theField, final String[] theHeight) {
        myField = theField;
        myHeight = theHeight;
        for (int i = 0; i < myField.length; i++) {
            myField[i] = myHeight[i].toCharArray();
        }
        for (int x = 0; x < myField.length; x++) {
            for (int y = 0; y < myField[x].length; y++) {
                if (myField[x][y] == MINE) {
                    myField[x][y] = MINE;
                } else {
                    myField[x][y] = (char) (mineCounter(x, y) + 48);
                }
            }
        }
    }

    private int mineCounter(int theHeight, int theWidth) {
        int mineCount = 0;
        boolean top = theHeight > 0;
        boolean left = theWidth > 0;
        boolean right = theWidth < myField[theHeight].length - 1;
        boolean bottom = theHeight < myField.length - 1;
        if (top) {
            if (left) {
                if (myField[theHeight-1][theWidth-1] == MINE) {
                    mineCount++;
                }
            }
            if (myField[theHeight-1][theWidth] == MINE) {
                mineCount++;
            }
            if (right) {
                if (myField[theHeight-1][theWidth+1] == MINE) {
                    mineCount++;
                }
            }
        }
        if (left) {
            if (myField[theHeight][theWidth-1] == MINE) {
                mineCount++;
            }
        }
        if (right) {
            if (myField[theHeight][theWidth+1] == MINE) {
                mineCount++;
            }
        }
        if (bottom) {
            if (left) {
                if (myField[theHeight+1][theWidth-1] == MINE) {
                    mineCount++;
                }
            }
            if (myField[theHeight+1][theWidth] == MINE) {
                mineCount++;
            }
            if (right) {
                if (myField[theHeight+1][theWidth+1] == MINE) {
                    mineCount++;
                }
            }
        }
        return mineCount;
    }

    @Override
    public String toString() {
        StringBuilder stringy = new StringBuilder();
        for (int i = 0; i < myField.length; i++) {
            stringy.append(myField[i]);
            stringy.append('\n');
        }
        return stringy.toString();
    }
}
