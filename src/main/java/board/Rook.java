package board;

import game.ChessMove;

public class Rook extends ChessPiece{
    public Rook(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    public void getMoves(ChessBoard b) {
        getPerpendiculars(b);
    }
}
