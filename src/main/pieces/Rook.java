package main.pieces;

public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "R" : "r";  // White rook 'R', Black rook 'r'
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        // Rook moves either horizontally or vertically
        return startX == endX || startY == endY;
    }
}
