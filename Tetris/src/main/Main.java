package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Simple Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        //Add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack(); //the size of the GamePanel becomes the size of the window

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }
}
