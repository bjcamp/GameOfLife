package com.testing;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawTests extends Canvas {

    public static int canvasSize = 400;
    public static int numOfPixels = 10;
    public static int pixelSize = 5;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test of Life");
        Canvas canvas = new DrawTests();
        canvas.setSize(canvasSize,canvasSize);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        // Overide paint method that is run when initializing Canvas

        // Create randomized coordinates for initialization
        int[][] coordinates = randomPixels(numOfPixels);

        // Plot random pixels
        for(int i=0; i<numOfPixels; i++){
            g.fillRect(coordinates[i][0], coordinates[i][1], pixelSize, pixelSize);

        }


    }

    public static int[][] randomPixels(int numOfPixels){
        // Function to create random pixel coordinates
        int[][] coordinates = new int[numOfPixels][2]; // Creates 2D array to store pixel locations


        for(int i=0; i<numOfPixels; i++) {
            coordinates[i][0] = (int) (Math.random() * canvasSize);
            coordinates[i][1] = (int) (Math.random() * canvasSize);
        }

        return coordinates;
    }


}
