package board;

import game.ChessMove;

public class King extends ChessPiece{
    public King(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    public void getMoves(ChessBoard b) {
        b.canMove(this, x, y + 1);
        b.canMove(this, x - 1, y + 1);
        b.canMove(this,x + 1, y + 1);
        b.canMove(this,x + 1, y);
        b.canMove(this,x, y - 1);
        b.canMove(this,x - 1, y - 1);
        b.canMove(this,x + 1, y - 1);
    }
}
