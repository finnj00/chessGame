package board;

import game.ChessMove;

public class King extends ChessPiece{
    public King(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    public void getMoves(ChessBoard b) {
        if(y < 7) {
            if(b.canMove(this.team, x, y + 1)) {
                this.moves.add(new ChessMove(x, y + 1));
            }
            if(x > 0) {
                this.moves.add(new ChessMove(x - 1, y + 1));
                this.moves.add(new ChessMove(x - 1, y));
            }
            if(x < 7) {
                this.moves.add(new ChessMove(x + 1, y + 1));
                this.moves.add(new ChessMove(x + 1, y));
            }
        }
        if(y > 0) {
            this.moves.add(new ChessMove(x, y - 1));
            if(x > 0) {
                this.moves.add(new ChessMove(x - 1, y - 1));
            }
            if(x < 7) {
                this.moves.add(new ChessMove(x + 1, y - 1));
            }
        }
    }
}
