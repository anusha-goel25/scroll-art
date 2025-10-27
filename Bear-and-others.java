import java.util.Random;

public class Bear {
    static final Random rand = new Random();
    public static void main(String[] args) throws Exception {
        AsciiArt[] imgs = {
           new AsciiArt(makeBear()),
           new AsciiArt(buildLlama()),
           new AsciiArt(makePenguin()),
        }; 
        for (int m = 0; m < 20; m++) {
            int imgNum = rand.nextInt(imgs.length);
            AsciiArt img = imgs[imgNum];
            int num = rand.nextInt(80);
            for (int i = 0; i < img.height; i++) {
                System.out.print(" ".repeat(num));
                for (int l = 0; l < img.width; l++) {
                    System.out.print(img.img[i][l]);
                }
                System.out.println();
            }
            Thread.sleep(1000);
        }
    }

    static char[][] makeBear() {
        char[][] img = new char[8][12];
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 12; x++) {
                img[y][x] = ' ';
            }
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
        img[7][7] = 'A';
        img[7][8] = 'G';

        // speech bubble
        img[4][7] = '<';
        img[4][9] = 'h';
        img[4][10] = 'i';
        img[4][11] = ')';
        img[5][9] = '\uFE36';
        return img;
    }
//Maria's Llama
    private static char[][] buildLlama() {
        char[][] llama = new char[9][20];
        for (int i = 0; i < llama.length; i++) {
            for (int j = 0; j < llama[i].length; j++) {
                llama[i][j] = ' ';
            }
        }

        llama[0][1] = '/';
        llama[0][2] = '^';
        llama[0][3] = '-';
        llama[0][4] = '-';
        llama[0][5] = '-';
        llama[0][6] = '^';
        llama[0][7] = '\\';
        llama[1][1] = '|';
        llama[1][3] = '.';
        llama[1][5] = '.';
        llama[1][7] = '|';
        llama[2][1] = '\\';
        llama[2][4] = '`';
        llama[2][7] = '/';
        llama[2][12] = 'M';
        llama[2][13] = 'S';
        llama[3][1] = '/';
        llama[3][2] = '=';
        llama[3][3] = '=';
        llama[3][4] = '=';
        llama[3][5] = '=';
        llama[3][6] = '=';
        llama[3][7] = '\\';
        llama[3][8] = '_';
        llama[3][9] = '_';
        llama[3][10] = '_';
        llama[3][11] = '_';
        llama[3][12] = '_';
        llama[3][13] = '_';
        llama[3][14] = '_';
        llama[3][15] = '_';
        llama[3][16] = '_';
        llama[4][0] = '/';
        llama[4][17] = '\\';
        llama[4][18] = '[';
        llama[4][19] = ']';
        llama[5][0] = '\\';
        llama[5][17] = '/';
        llama[6][1] = '-';
        llama[6][2] = '-';
        llama[6][3] = '-';
        llama[6][4] = '-';
        llama[6][5] = '-';
        llama[6][6] = '-';
        llama[6][7] = '-';
        llama[6][8] = '-';
        llama[6][9] = '-';
        llama[6][10] = '-';
        llama[6][11] = '-';
        llama[6][12] = '-';
        llama[6][13] = '-';
        llama[6][14] = '-';
        llama[6][15] = '-';
        llama[6][16] = '-';
        llama[7][1] = '|';
        llama[7][3] = '|';
        llama[7][5] = '|';
        llama[7][7] = '|';
        llama[7][10] = '|';
        llama[7][12] = '|';
        llama[7][14] = '|';
        llama[7][16] = '|';
        llama[8][1] = '[';
        llama[8][2] = '|';
        llama[8][3] = ']';
        llama[8][5] = '[';
        llama[8][6] = '|';
        llama[8][7] = ']';
        llama[8][10] = '[';
        llama[8][11] = '|';
        llama[8][12] = ']';
        llama[8][14] = '[';
        llama[8][15] = '|';
        llama[8][16] = ']';
        return llama;
    }

    //Ari's Penguin
    static String makePenguin(){
        String[] penguinArt = {
            "Penguin",
            "  .--.",
            " |o_o |",
            " |/_/ |",
            "//   \\ \\",
            "(|     | )",
            "/'\\_   _/`\\",
            "\\___)=(___/ AH"
        };

        return String.join("\n", penguinArt); 
        //I got this part(the syntax) from this website: https://www.w3schools.com/java/ref_string_join.asp
    }
}
