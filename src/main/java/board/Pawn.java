package board;

import game.ChessMove;

public class Pawn extends ChessPiece {

    public Pawn(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    public void getMoves(ChessBoard b) {
        this.moves.clear();
        if(team) {
            if(this.y == 1) {
                b.canMove(this, x, y + 2);
            }
            b.canMove(this, x, y + 1);
            if(x > 0 && b.pieces[x - 1][y + 1] != null && b.pieces[x - 1][y + 1].team != this.team) {
                this.moves.add(new ChessMove(x - 1, y + 1));
            }
            if(x < 7 && b.pieces[x + 1][y + 1] != null && b.pieces[x + 1][y + 1].team != this.team) {
                this.moves.add(new ChessMove(x + 1, y + 1));
            }
        } else {
            if(this.y == 6) {
                b.canMove(this, x, y - 2);
            }
            b.canMove(this, x, y - 1);
            if(x > 0 && b.pieces[x - 1][y - 1] != null && b.pieces[x - 1][y - 1].team != this.team) {
                this.moves.add(new ChessMove(x - 1, y - 1));
            }
            if(x < 7 && b.pieces[x + 1][y - 1] != null && b.pieces[x + 1][y - 1].team != this.team) {
                this.moves.add(new ChessMove(x + 1, y - 1));
            }
        }
    }
}
