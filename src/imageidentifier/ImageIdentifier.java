package imageidentifier;

import java.io.IOException;

public class ImageIdentifier {

    public static void main(String args[]) throws IOException {
        ImgPercent ip = new ImgPercent();
        GrayMaker gr = new GrayMaker();
        ip.ImgDiff("C:\\Users\\Kevin\\Dropbox\\BDO\\ImageProject\\Cut Images\\W-gr.png",
                "C:\\Users\\Kevin\\Dropbox\\BDO\\ImageProject\\Cut Images\\W-g.png");
        gr.makeGray("C:\\Users\\Kevin\\Dropbox\\BDO\\ImageProject\\Cut Images\\S-c.png","S");
    }
}
