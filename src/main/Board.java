package main;
import java.awt.*;
import javax.swing.*;
import main.pieces.Pawn;
import main.pieces.Piece;
import main.pieces.Rook;

public class Board extends JPanel {
    // public void printBoard() {
    //     System.out.println("Displaying chessboard...");
    // }

    public void movePiece(int startX, int startY, int endX, int endY) {
        System.out.println("Moving piece from (" + startX + ", " + startY + ") to (" + endX + ", " + endY + ")");
    }
    private final Piece[][] squares = new Piece[8][8];

    public Board() {
        setPreferredSize(new Dimension(600, 600)); // Set Board size
        setupBoard();
    }

    private void setupBoard() {
        // Initialize pieces (like Rooks, Pawns, etc.)
        squares[0][0] = new Rook(true);
        squares[0][7] = new Rook(true);
        squares[7][0] = new Rook(false);
        squares[7][7] = new Rook(false);
        // Initialize Pawns
        for (int i = 0; i < 8; i++) {
            squares[1][i] = new Pawn(true);
            squares[6][i] = new Pawn(false);
        }
    }
    public void printBoard() {
        System.out.println("  a b c d e f g h");
        System.out.println("  ----------------");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + "|");
            for (int j = 0; j < 8; j++) {
                if (squares[i][j] == null) {
                    System.out.print(". ");  // Empty square
                } else {
                    System.out.print(squares[i][j].getSymbol() + " ");  // Print piece symbol
                }
            }
            System.out.println("|" + (8 - i));
        }
        System.out.println("  ----------------");
        System.out.println("  a b c d e f g h");
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw board grid
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0)
                    g.setColor(Color.WHITE);
                else
                    g.setColor(Color.GRAY);
                g.fillRect(col * 75, row * 75, 75, 75);
            }
        }
    }
}
