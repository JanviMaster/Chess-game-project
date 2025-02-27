package main.pieces;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "B" : "b";  // White bishop 'B', Black bishop 'b'
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        // Bishop moves diagonally (row difference == column difference)
        return Math.abs(startX - endX) == Math.abs(startY - endY);
    }
}
