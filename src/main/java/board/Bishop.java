package board;

import game.ChessMove;

public class Bishop extends ChessPiece{
    public Bishop(int x, int y, boolean team) {
        super(x, y, team);
    }
    @Override
    public void getMoves() {
        getDiagonals();
    }
}
