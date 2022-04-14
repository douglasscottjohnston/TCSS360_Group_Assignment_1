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
            if(height == 0 && width == 0) {
                System.exit(0);
            }
            char[][] minefield = new char[height][width];
            String[] rows = new String[height];

            SCANNER.nextLine();
            for (int i = 0; i < height; i++) {
                rows[i] = SCANNER.nextLine();
            }
            System.out.printf("Field #%d:\n", fieldTracker);
            System.out.println(new Minefield(minefield, rows));
            fieldTracker++;
        }
        SCANNER.close();
    }
}
