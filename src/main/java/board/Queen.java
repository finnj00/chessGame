package board;

import game.ChessMove;

public class Queen extends ChessPiece{
    public Queen(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    public void getMoves(ChessBoard b) {
        getDiagonals();
        getPerpendiculars();
    }
}
