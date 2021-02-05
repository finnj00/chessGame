package board;

import game.ChessMove;

public class Bishop extends ChessPiece{
    public Bishop(int x, int y, boolean team) {
        super(x, y, team);
    }
    @Override
    public void getMoves() {
        int deltaX = 0;
        int deltaY = 0;
        for(int i = 0; i < 4; i++) {
            if(i % 2 == 0) {
                deltaY = -1;
            } else {
                deltaY = 1;
            }
            if(i < 2) {
                deltaX = -1;
                while(x + deltaX > -1 && y + deltaY > -1 && y + deltaY < 8) {
                    this.moves.add(new ChessMove(x + deltaX, y + deltaY));
                    deltaX--;
                    if(i % 2 == 0) {
                        deltaY--;
                    } else {
                        deltaY++;
                    }
                }
            } else {
                deltaX = 1;
                while(x + deltaX < 8 && y + deltaY > -1 && y + deltaY < 8) {
                    this.moves.add(new ChessMove(x + deltaX, y + deltaY));
                    deltaX++;
                    if(i % 2 == 0) {
                        deltaY--;
                    } else {
                        deltaY++;
                    }
                }
            }
        }
    }
}
