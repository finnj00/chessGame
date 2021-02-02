package board;

import java.util.HashSet;
import java.util.Set;
import game.ChessMove;

public abstract class ChessPiece {

    public int x;

    public int y;

    // True is white
    boolean team;

    private Set<ChessMove> moves;

    public ChessPiece(int x, int y, boolean team) {
        this.x = x;
        this.y = y;
        this.team = team;
        this.moves = new HashSet<ChessMove>();
    }

    public void setMoves(Set<ChessMove> newMoves) {
        this.moves = moves;
    }
}
