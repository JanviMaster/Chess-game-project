package main.pieces;

public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        int rowDiff = Math.abs(endRow - startRow);
        int colDiff = Math.abs(endCol - startCol);
        
        // King can move one square in any direction
        return rowDiff <= 1 && colDiff <= 1;
    }

    @Override
    public String toString() {
        return isWhite() ? "♔" : "♚";
    }
}
