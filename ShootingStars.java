import java.util.Random;

public class ShootingStars {
    static final Random rand = new Random();

    public static void main(String[] args) throws Exception {
        while (true) {
            boolean choice = rand.nextBoolean();
            char[][] star = makeStar();
            char[][] asterisk = makeAsterisk();
            int num = rand.nextInt(10);

            if (choice == true) {
                System.out.print(" ".repeat(num));
                for (int i = 0; i < star.length; i++) {
                    for (int l = 0; l < star[i].length; l++) {
                        System.out.print(star[i][l]);
                        star[i][0] = '|';
                        if (i<9){
                        star[i+1][0] = '\u26E7';
                        }
                    }
                    num = rand.nextInt(10);
                }
            } else if (choice == false) {
                System.out.print(" ".repeat(num));
                for (int i = 0; i < asterisk.length; i++) {    
                    for (int l = 0; l < asterisk[i].length; l++) {
                        System.out.print(asterisk[i][l]);
                        asterisk[i][0] = ' ';
                    if (i < 9){
                        asterisk[i+1][0] = '*';
                    }
                    }
                    num = rand.nextInt(30);
                }
            }
            System.out.println();
            Thread.sleep(1000);
        }
    }

    static char[][] makeStar() {
        char[][] img = new char[10][1];
        for (int x = 0; x < img[x].length; x++) {
            img[x][0] = ' ';
        }
        img[0][0] = '\u26E7';
        return img;
    }

    static char[][] makeAsterisk() {
        char[][] img = new char[10][1];
        for (int x = 0; x < img[x].length; x++) {
            img[x][0] = ' ';
        }
        img[0][0] = '*';
        return img;
    }
}
