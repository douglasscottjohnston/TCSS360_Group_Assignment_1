import java.util.Scanner;

public class KatieMain {
    static int height = 1;
    static int width = 1;
    static int fieldTracker = 1;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while(SCANNER.hasNextInt()) {
            height = SCANNER.nextInt();
            width = SCANNER.nextInt();
            char[][] minefield = new char[height][width];
            String[] rows = new String[height];

            SCANNER.nextLine();

            System.out.println();
            System.out.printf("Field #%d:", fieldTracker);
            System.out.println();
            for (int i = 0; i < height; i++) {
                rows[i] = SCANNER.nextLine();
            }
            System.out.print(new Minefield(minefield, rows));
            fieldTracker++;
        }
        SCANNER.close();
    }
}
