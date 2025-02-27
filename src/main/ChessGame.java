package main;

import javax.swing.*;

public class ChessGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        Board board = new Board();
        frame.add(board); 

        frame.setVisible(true);
    }
}
