package main.pieces;

public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "K" : "k";  // White king 'K', Black king 'k'
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        // King moves one step in any direction
        return Math.abs(startX - endX) <= 1 && Math.abs(startY - endY) <= 1;
    }
}
