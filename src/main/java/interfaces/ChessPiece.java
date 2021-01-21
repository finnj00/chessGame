package interfaces;

import java.util.Set;

public abstract class ChessPiece {

    private int[] position;

    private Set<int[]> moves;

    public abstract void move(int x, int y);
}
