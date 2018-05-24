package src;

import javax.swing.JPanel;
import java.awt.*;

public class StandardRoom extends JPanel {
    private int xPos, yPos;
    private int width, height, frameWidth, frameHeight;

    StandardRoom(int w, int h, int fw, int fh) {
        this.width = w;
        this.height = h;
        this.frameWidth = fw;
        this.frameHeight = fh;
        calcX();
        calcY();
    }

    private void calcX() {
        this.xPos = (this.frameWidth - width) / 2;
    }

    private void calcY() {
        this.yPos = (this.frameHeight - height) / 2;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(0, 0, 0));
        g2d.drawRect(xPos, yPos, width, height);
    }
}
