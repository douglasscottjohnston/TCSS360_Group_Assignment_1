import java.util.Scanner;

public class Main {
    static int height = 1;
    static int width = 1;
    static int fieldTracker = 1;

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while(SCANNER.hasNextInt()) {
            Main.height = SCANNER.nextInt();
            width = SCANNER.nextInt();
            char[][] minefield = new char[Main.height][width];
            String[] height = new String[Main.height];

            SCANNER.nextLine();

            System.out.println();
            System.out.printf("Field #%d:", fieldTracker);
            System.out.println();
            for (int i = 0; i < Main.height; i++) {
                height[i] = SCANNER.nextLine();
            }
           System.out.print(new Minefield(minefield, height).toString());
           fieldTracker++;
        }
        SCANNER.close();
    }
}
