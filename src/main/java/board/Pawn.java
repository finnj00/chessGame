package board;

import game.ChessMove;

public class Pawn extends ChessPiece {

    public Pawn(int x, int y, boolean team) {
        super(x, y, team);
    }
    @Override
    public void getMoves() {
        this.moves.clear();
        if(team) {
            if(this.y == 1) {
                this.moves.add(new ChessMove(x, y + 2));
            }
            this.moves.add(new ChessMove(x, y + 1));
            this.moves.add(new ChessMove(x + 1, y + 1));
            this.moves.add(new ChessMove(x - 1, y + 1));
        } else {
            if(this.y == 6) {
                this.moves.add(new ChessMove(x, y - 2));
            }
            this.moves.add(new ChessMove(x, y - 1));
            this.moves.add(new ChessMove(x + 1, y - 1));
            this.moves.add(new ChessMove(x - 1, y - 1));
        }
    }
}
