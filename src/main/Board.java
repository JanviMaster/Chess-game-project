package main;
import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
    private static final int SIZE = 8;
    private JButton[][] squares;

    public Board() {
        setLayout(new GridLayout(SIZE, SIZE));
        squares = new JButton[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                squares[row][col] = new JButton();
                squares[row][col].setPreferredSize(new Dimension(75, 75));

                // Set alternating colors
                if ((row + col) % 2 == 0) {
                    squares[row][col].setBackground(Color.WHITE);
                } else {
                    squares[row][col].setBackground(Color.GRAY);
                }
                add(squares[row][col]);
            }
        }
    }

    public JButton getSquare(int row, int col) {
        return squares[row][col];
    }
}
