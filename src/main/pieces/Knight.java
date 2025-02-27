package main.pieces;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "N" : "n";  // White knight 'N', Black knight 'n'
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        // Knight moves in an "L" shape
        int dx = Math.abs(startX - endX);
        int dy = Math.abs(startY - endY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
