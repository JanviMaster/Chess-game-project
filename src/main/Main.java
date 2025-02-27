package main;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard(); 

        System.out.println("\nTrying to move a rook...");
        board.movePiece(0, 0, 0, 4); 
        board.printBoard();
    }
}
