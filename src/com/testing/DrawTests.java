package com.testing;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawTests extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test of Life");
        Canvas canvas = new DrawTests();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        // Overide paint method that is run when initializing Canvas
        g.fillRect(100, 100, 5, 5); // This is a method of the Canvas class

    }
}
