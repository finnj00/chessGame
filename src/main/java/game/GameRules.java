package game;

import board.*;

import java.util.Map;
import java.util.Set;

public class GameRules {
    Map<String, Set<ChessMove>> WhiteMoves;
    Map<String, Set<ChessMove>> BlackMoves;
    boolean check;
    // True is white
    boolean turn;

    ChessBoard board;

    public GameRules() {
        this.turn = true;
        this.check = false;
        this.board = new ChessBoard();
        for(int i = 0; i < 8; i++) {
            board.addPiece(new Pawn(i, 1, true));
            board.addPiece(new Pawn(i, 6, false));
            if(i == 0 || i == 7) {
                board.addPiece(new Rook(i, 0, true));
                board.addPiece(new Rook(i, 7, false));
            } else if(i == 1 || i == 6) {
                board.addPiece(new Knight(i, 0, true));
                board.addPiece(new Knight(i, 7, false));
            } else if(i == 2 || i == 5) {
                board.addPiece(new Bishop(i, 0, true));
                board.addPiece(new Bishop(i, 7, false));
            } else if(i == 3) {
                board.addPiece(new Queen(i, 0, true));
                board.addPiece(new Queen(i, 7, false));
            } else {
                board.addPiece(new King(i, 0, true));
                board.addPiece(new King(i, 7, false));
            }
        }
    }
}
