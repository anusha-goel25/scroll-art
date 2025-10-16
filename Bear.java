import java.util.Random;

public class Bear {
    static final Random rand = new Random();
    
    public static void main(String[] args) throws Exception {
        for (int m = 0; m < 10; m++) {
            char[][] bear = makeBear();
            int num = rand.nextInt(80);
            for (int i = 0; i < bear.length; i++) {
                System.out.print(" ".repeat(num));
                for (int l = 0; l < bear[i].length; l++) {
                    System.out.print(bear[i][l]);
                }
                System.out.println();
            }
            Thread.sleep(1000);
        }
    }

    static char[][] makeBear() {
        //while (true){
        //
        char[][] img = new char[8][12];
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 12; x++) {
                img[y][x] = ' ';
            }
            //
        }
        // bear
        img[0][2] = '\u26E7';
        img[1][2] = '\u028C';
        img[2][1] = '/';
        img[2][3] = '\\';
        img[3][0] = '@';
        img[3][1] = '_';
        img[3][2] = '_';
        img[3][3] = '_';
        img[3][4] = '@';
        img[4][0] = '(';
        img[4][1] = '-';
        img[4][2] = '_';
        img[4][3] = '-';
        img[4][4] = ')';
        img[5][1] = '-';
        img[5][2] = '-';
        img[5][3] = '-';
        img[5][0] = '<';
        img[5][4] = '>';
        img[6][0] = '/';
        img[6][1] = '|';
        img[6][3] = '|';
        img[6][4] = '\\';
        img[6][5] = '/';
        img[7][0] = '~';
        img[7][1] = '~';
        img[7][2] = '~';
        img[7][3] = '~';
        img[7][4] = '~';
        img[7][5] = '~';

        // speech bubble
        img[4][7] = '<';
        img[4][9] = 'h';
        img[4][10] = 'i';
        img[4][11] = ')';
        img[5][9] = '\uFE36';
        return img;
    }
}
//}

