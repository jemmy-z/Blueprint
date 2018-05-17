package src;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;

public class Generator extends JFrame {
    private String imageNumber;
    private int width = 600;
    private int height = 600;

    public Generator() {
        super();
        initiate();
    }

    public Generator(String number) {
        super(number);
        initiate();
        imageNumber = number;
    }

    private void initiate() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(width, height));
        setLocation(100, 100);
        setBackground(new Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
    }

    public void buildRectangle(int w, int h) {
        Rectangle r = new Rectangle(w, h, width, height);
        add(r);
    }

    public void print() {
        setVisible(true);
    }
}
