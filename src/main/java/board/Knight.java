package board;

import game.ChessMove;

public class Knight extends ChessPiece{
    public Knight(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    public void getMoves() {
        // Top two moves
        if(y < 6) {
            if(x > 0) {
                this.moves.add(new ChessMove(x - 1, y + 2));
            }
            if(x < 7) {
                this.moves.add(new ChessMove(x + 1, y + 2));
            }
        }

        // Two right moves
        if(x < 6) {
            if(y > 0) {
                this.moves.add(new ChessMove(x + 2, y - 1));
            }
            if(y < 7) {
                this.moves.add(new ChessMove(x + 2, y + 1));
            }
        }

        // Two left moves
        if(x > 1) {
            if(y > 0) {
                this.moves.add(new ChessMove(x - 2, y - 1));
            }
            if(y < 7) {
                this.moves.add(new ChessMove(x - 2, y + 1));
            }
        }

        // Two bottom moves
        if(y > 1) {
            if(x > 0) {
                this.moves.add(new ChessMove(x - 1, y - 2));
            }
            if(x < 7) {
                this.moves.add(new ChessMove(x + 1, y - 2));
            }
        }
    }
}
