package game;

import board.*;

import java.util.*;

public class GameRules {
    Map<ChessPiece, Set<ChessMove>> moves;
    boolean check;
    // True is white
    boolean turn;

    public ChessBoard board;

    public static void main(String[] args) {
        GameRules game = new GameRules();
        while(true) {
            game.setMoves();
            if(game.moves.isEmpty()) {
                break;
            } else {
                for(ChessPiece piece : game.moves.keySet()) {
                    System.out.println("Piece: " + piece.getClass());
                    for(ChessMove m : piece.moves) {
                        System.out.println(m.x + ", " + m.y);
                    }
                }
                System.out.print("Move? ");
                Scanner s = new Scanner(System.in);
                String move = s.nextLine();
            }
        }
    }

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

    public void setMoves() {
        int count = 1;
        Iterator<ChessPiece> i = null;
        if(this.turn) {
             i = board.whiteIterator();
        } else {
            i = board.blackIterator();
        }
        this.moves = new HashMap<ChessPiece, Set<ChessMove>>();
        while(i.hasNext()) {
            ChessPiece next = i.next();
            next.getMoves(this.board);
            this.moves.put(next, next.moves);
        }
    }

}
