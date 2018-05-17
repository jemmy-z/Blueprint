import src.Generator;
import src.Rectangle;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Component;


public class Builder {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 20; i++) {
            Generator g = new Generator();
            g.buildRectangle(100 + i, 50 + i);
            getSaveSnapShot(g.getObject(), "images/rooms/room_" + i + ".jpeg");
        }

    }
    public static BufferedImage getScreenShot(Component component) {
        BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    }

    public static void getSaveSnapShot(Component component, String fileName) throws Exception {
        BufferedImage img = getScreenShot(component);
        ImageIO.write(img, "jpeg", new File(fileName));
    }


}
