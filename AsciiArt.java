public class AsciiArt {
    char[][] img;
    int height;
    int width;

     //constructors
    public AsciiArt(char[][] img) {
        this.img = img;
        this.height = img.length;
        this.width = img[0].length;
    } 

    public AsciiArt(String art) {
        this.processArt(art);
    }

    //processing the art
    private void processArt(String art) {
        String[] lines = art.split("\n");
        this.height = lines.length;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() > this.width) {
                this.width = lines[i].length(); // max width!
            }
        }
        this.img = new char[height][width];
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {
                img[i][j] = lines[i].charAt(j);
            }
        }
        // fill all zeroes with empty space
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (img[i][j] == 0) {
                    img[i][j] = ' ';
                } // will not allow overlap.
            }
        }
    }
}
