
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import MineSweeper.Minefield;

public class MinefiledTest {


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
}
