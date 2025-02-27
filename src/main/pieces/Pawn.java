package main.pieces;

public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "P" : "p";  // White pawn 'P', Black pawn 'p'
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        int direction = isWhite ? 1 : -1; // White moves up, Black moves down

        // Normal move: 1 step forward
        if (startX == endX && endY - startY == direction) {
            return true;
        }

        // First move: Can move 2 steps forward
        if (startX == endX && endY - startY == 2 * direction && (startY == 1 || startY == 6)) {
            return true;
        }

        // Diagonal capture
        if (Math.abs(startX - endX) == 1 && endY - startY == direction) {
            return true;
        }

        return false;
    }
}
