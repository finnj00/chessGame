import board.Bishop;
import board.ChessBoard;
import board.ChessPiece;
import board.Queen;
import game.ChessMove;
import game.GameRules;
import org.junit.Test;

import java.util.Iterator;

public class ChessRulesTests {
    @Test
    public void checkBoard() {
        GameRules rules = new GameRules();
    }

    @Test
    public void checkBishopMoves() {
        ChessPiece b = new Bishop(4,4, true);
        b.getMoves();
        for(ChessMove m : b.moves) {
            System.out.println(m.x + " " + m.y);
        }
    }

    @Test
    public void validateMoveOverloading() {
        ChessBoard b = new ChessBoard();
        b.addPiece(new Bishop(0,0, true));
        b.addPiece(new Queen(1,1,true));
        Iterator<ChessPiece> i = b.whiteIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}