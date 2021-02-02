package board;

import board.*;

import java.util.List;

public class ChessBoard {

    ChessPiece [][] pieces;
    public ChessBoard() {
        this.pieces = new ChessPiece[8][8];
    }

    public void addPiece(ChessPiece p) {
        pieces[p.x][p.y] = p;
    }

    public void movePiece(int startX, int startY, int endX, int endY) {
        ChessPiece p = pieces[startX][startY];
        p.x = endX;
        p.y = endY;
        pieces[startX][startY] = null;
        pieces[endX][endY] = p;
    }
}
