package board;

import game.ChessMove;

public class Knight extends ChessPiece{
    public Knight(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    public void getMoves(ChessBoard b) {
        b.canMove(this, x - 1, y + 2);
        b.canMove(this, x + 1, y + 2);
        b.canMove(this, x + 2, y - 1);
        b.canMove(this, x + 2, y + 1);
        b.canMove(this, x - 2, y + 1);
        b.canMove(this, x - 2, y - 1);
        b.canMove(this, x - 1, y - 2);
        b.canMove(this, x + 1, y - 2);
    }
}
