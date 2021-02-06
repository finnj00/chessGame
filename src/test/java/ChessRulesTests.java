import board.Bishop;
import board.ChessPiece;
import game.ChessMove;
import game.GameRules;
import org.junit.Test;
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

}