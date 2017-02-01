/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageidentifier;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javafx.scene.image.Image;

/**
 *
 * @author Kevin
 */
public class ScreenCapture {

    public BufferedImage Capture(int x, int y, int width, int height) throws AWTException {
        Robot r = new Robot();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        Rectangle bounds = new Rectangle();
        bounds.setBounds(x, y, width, height);
        BufferedImage i = r.createScreenCapture(bounds);
        return i;
    }
}
//833,395