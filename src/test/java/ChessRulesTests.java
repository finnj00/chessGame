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
        rules.setMoves();
    }

    @Test
    public void checkBishopMoves() {
        GameRules rules = new GameRules();
        ChessPiece b = new Bishop(4,4, true);
        b.getMoves(rules.board);
        for(ChessMove m : b.moves) {
            System.out.println(m.x + " " + m.y);
        }
    }
}