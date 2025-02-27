package main.pieces;

public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "Q" : "q";  // White queen 'Q', Black queen 'q'
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        // Queen moves like a bishop (diagonally) or like a rook (straight)
        return (startX == endX || startY == endY) || (Math.abs(startX - endX) == Math.abs(startY - endY));
    }
}
