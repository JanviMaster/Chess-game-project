package main.pieces;

public abstract class Piece {
    protected boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    // This must be implemented by all subclasses
    public abstract String getSymbol();

    // This must be implemented by all subclasses
    public abstract boolean isValidMove(int startX, int startY, int endX, int endY);
}
