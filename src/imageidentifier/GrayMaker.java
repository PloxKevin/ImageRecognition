/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageidentifier;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Kevin
 */
public class GrayMaker {

    public void makeGray(String str1, String name) throws IOException {
        File file1 = new File(str1);
        BufferedImage img = null;
        try {
            img = ImageIO.read(file1);
        } catch (IOException e) {
        }
        for (int x = 0; x < img.getWidth(); ++x) {
            for (int y = 0; y < img.getHeight(); ++y) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb & 0xFF);

                int grayLevel = (int) (0.2126*r + 0.7152*g + 0.0722*b);
                //int grayLevel = (r + g + b) / 3;
                int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel;
                img.setRGB(x, y, gray);
            }
        }
      File outputfile = new File("C:\\Users\\Kevin\\Dropbox\\BDO\\ImageProject\\Grey Scale Images\\"+name+".jpg");
      ImageIO.write(img, "jpg", outputfile);  
    }
}
