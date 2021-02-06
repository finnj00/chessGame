package board;

import java.util.HashSet;
import java.util.Set;
import game.ChessMove;

public abstract class ChessPiece {

    public int x;

    public int y;

    // True is white
    boolean team;

    public Set<ChessMove> moves;

    public ChessPiece(int x, int y, boolean team) {
        this.x = x;
        this.y = y;
        this.team = team;
        this.moves = new HashSet<ChessMove>();
    }

    public void setMoves(Set<ChessMove> newMoves) {
        this.moves = moves;
    }

    public void getMoves() {

    }

    public void getDiagonals() {
        for(int i = 1; i < 8 - Math.max(x, y); i++) {
            this.moves.add(new ChessMove(x + i, y + i));
        }
        for(int i = 1; i < Math.min(7 - x, y) + 1; i++) {
            this.moves.add(new ChessMove(x + i, y - i));
        }
        for(int i = 1; i < Math.min(x,y) + 1; i++) {
            this.moves.add(new ChessMove(x - i, y - i));
        }
        for(int i = 1; i < Math.min(x, 7 - y) + 1; i++) {
            this.moves.add(new ChessMove(x - i, y + i));
        }
    }

    public void getPerpendiculars() {
        for(int i = 1; i < 8 - this.x; i++) {
            this.moves.add(new ChessMove(x + i, y));
        }
        for(int i = 1; i < 8 - this.y; i++) {
            this.moves.add(new ChessMove(x, y + i));
        }
        for(int i = 1; i < x + 1; i++) {
            this.moves.add(new ChessMove(x - i, y));
        }
        for(int i = 1; i < y + 1; i++) {
            this.moves.add(new ChessMove(x, y - i));
        }
    }
}
