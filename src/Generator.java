package src;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;

public class Generator {
    private JFrame f;
    private int width = 600;
    private int height = 600;

    public Generator() {
        super();
        f = new JFrame();
        f.setSize(new Dimension(width, height));
        f.setPreferredSize(new Dimension(width, height));
        f.setBackground(new Color(255, 255, 255));
    }

    public JPanel buildStandardRoom(int w, int h) {
        StandardRoom r = new StandardRoom(w, h, width, height);
        f.add(r);
        f.pack();
        return r;
    }

    public JPanel buildAuditorium(int w1, int w2, int h) {
        return null;
    }

    public JPanel buildRoundRoom(int r) {
        return null;
    }
}
