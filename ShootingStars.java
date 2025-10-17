import java.util.Random;

public class ShootingStars {
    static final Random rand = new Random();

    public static void main(String[] args) throws Exception {

        char[][] total = new char[20][40];
        for (int i = 0; i < total.length; i++) {
            for (int l = 0; l < total[i].length; l++) {
                total[i][l] = ' ';
            }
        }
        for (int j = 0; j < 6; j++) {
            loadStar(total);
            for (int i = 0; i < total.length; i++) {
                for (int l = 0; l < total[i].length; l++) {
                    System.out.print(total[i][l]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    static void loadStar(char[][] total) {
        int spaces = rand.nextInt(20);
        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < total[i].length; j++) {
                if (j < spaces + i) {
                    total[i][j] = ' ';
                }
                else if (j == spaces + i) {
                    total[i][j] = randomizeChar();
                } else {
                    total[i][j] = '|';
                }
            }
        }
    }

    static char randomizeChar() {
        boolean choice = rand.nextBoolean();
        if (choice) {
            return '\u26E7';
        } else {
            return '*';
        }
    }
}
