
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import MineSweeper.Minefield;

public class MinefieldTest {

    /**
     * 11
     * 1*
     */
    @Test
    void testCorrectMinefield() {
        String expectedField =
                "11\n1*\n";

        char[][] field = new char[2][2];

        field[0][0] = '.';
        field[0][1] = '.';
        field[1][0] = '.';
        field[1][1] = '*';

        Minefield mine = new Minefield(field);

        System.out.println(mine.toString());

        assertEquals(expectedField, mine.toString());

    }

    /**
     * *1
     * 1*
     * NOT
     * ..
     * .*
     */
    @Test
    void testIncorrectMinefield() {
        String expectedField =
                "*1\n1*\n";

        char[][] field = new char[2][2];

        field[0][0] = '.';
        field[0][1] = '.';
        field[1][0] = '.';
        field[1][1] = '*';

        Minefield mine = new Minefield(field);

        System.out.println(mine.toString());

        assertNotEquals(expectedField, mine.toString());

    }

    /**
     * testing a null minefield
     */
    @Test
    void testSmallMinefield() {
        String expectedField =
                "";

        char[][] field = new char[0][0];

        Minefield mine = new Minefield(field);

        System.out.println(mine.toString());

        assertEquals(expectedField, mine.toString());

    }

    /**
     * testing an all mines minefield
     */
    @Test
    void testAllMines() {
        String expectedField =
                "****\n****\n****\n****\n";

        char[][] field = new char[4][4];

        field[0][0] = '*';
        field[0][1] = '*';
        field[0][2] = '*';
        field[0][3] = '*';
        field[1][0] = '*';
        field[1][1] = '*';
        field[1][2] = '*';
        field[1][3] = '*';
        field[2][0] = '*';
        field[2][1] = '*';
        field[2][2] = '*';
        field[2][3] = '*';
        field[3][0] = '*';
        field[3][1] = '*';
        field[3][2] = '*';
        field[3][3] = '*';

        Minefield mine = new Minefield(field);

        System.out.println(mine.toString());

        assertEquals(expectedField, mine.toString());

    }

    /**
     * testing a no mines minefield
     */
    @Test
    void testNoMines() {
        String expectedField =
                "0000\n0000\n0000\n0000\n";

        char[][] field = new char[4][4];

        field[0][0] = '.';
        field[0][1] = '.';
        field[0][2] = '.';
        field[0][3] = '.';
        field[1][0] = '.';
        field[1][1] = '.';
        field[1][2] = '.';
        field[1][3] = '.';
        field[2][0] = '.';
        field[2][1] = '.';
        field[2][2] = '.';
        field[2][3] = '.';
        field[3][0] = '.';
        field[3][1] = '.';
        field[3][2] = '.';
        field[3][3] = '.';

        Minefield mine = new Minefield(field);

        System.out.println(mine.toString());

        assertEquals(expectedField, mine.toString());

    }
}
