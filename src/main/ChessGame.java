package main;
import javax.swing.*;

public class ChessGame {
    private final JFrame frame;
    private final Board board;

    public ChessGame() {
        frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        
        board = new Board();
        frame.add(board);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChessGame::new);
    }
}
