package src;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;

public class Generator {
    private JFrame f;
    private Rectangle r;
    private int width = 600;
    private int height = 600;

    public Generator() {
        super();
        f = new JFrame();
        f.setSize(new Dimension(width, height));
        f.setPreferredSize(new Dimension(width, height));
        f.setBackground(new Color(255, 255, 255));
    }

    public void buildRectangle(int w, int h) {
        r = new Rectangle(w, h, width, height);
        f.add(r);
        f.pack();
    }

    public JPanel getObject() {
        return r;
    }
}
