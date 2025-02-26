package main.pieces;

public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        int rowDiff = Math.abs(endRow - startRow);
        int colDiff = Math.abs(endCol - startCol);
        
        return (startRow == endRow || startCol == endCol) || (rowDiff == colDiff);
    }

    @Override
    public String toString() {
        return isWhite() ? "♕" : "♛";
    }
}
