import src.Generator;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Component;
import java.io.IOException;
import java.util.Random;

public class Builder {
    public static void main(String[] args) {
        Random rm = new Random();
        for (int i = 0; i < 20; i++) {
            Generator g = new Generator();
            JPanel o = g.buildRectangle(rm.nextInt(300) + 50, rm.nextInt(300) + 50);
            getSaveSnapShot(o, "images/rooms/room_" + i + ".jpeg");
        }
        System.exit(0);
    }

    private static void getSaveSnapShot(Component component, String fileName) {
        try {
            BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
            component.paint(image.getGraphics());
            File outputFile = new File(fileName);
            ImageIO.write(image, "jpeg", outputFile);
        } catch (IOException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
    }
}
