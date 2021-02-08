package board;

import board.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChessBoard {

    Set<ChessPiece> whiteTeam;
    Set<ChessPiece> blackTeam;
    ChessPiece [][] pieces;
    public ChessBoard() {
        this.pieces = new ChessPiece[8][8];
        this.whiteTeam = new HashSet<ChessPiece>();
        this.blackTeam = new HashSet<ChessPiece>();
    }


    public void addPiece(ChessPiece p) {
        pieces[p.x][p.y] = p;
        if(p.team) {
            whiteTeam.add(p);
        } else {
            blackTeam.add(p);
        }
    }

    public void movePiece(int startX, int startY, int endX, int endY) {
        ChessPiece p = pieces[startX][startY];
        p.x = endX;
        p.y = endY;
        pieces[startX][startY] = null;
        pieces[endX][endY] = p;
    }

    public boolean canMove(boolean team, int x, int y) {
        return pieces[x][y] == null || pieces[x][y].team != team;
    }

    public Iterator<ChessPiece> whiteIterator() {
        return whiteTeam.iterator();
    }

    public Iterator<ChessPiece> blackIterator() {
        return blackTeam.iterator();
    }
}
