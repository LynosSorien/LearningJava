package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by david on 25/08/14.
 */
public final class VictoryConditions {
    public static boolean endGameState(Board board) {
        if (hasVictory(board)) return true;
        if (getPossibleActions(board).size() == 0) return true;
        return false;
    }

    public static boolean hasVictory(Board board) {
        boolean victory = false;

        return victory;
    }

    public static List<Integer> getPossibleActions(Board board) {
        ArrayList<Integer> actions = new ArrayList();
        ArrayList<Cell> cells = (ArrayList<Cell>) board.getCellList();
        for (Cell c : cells)
            if (c.getCellType()==Cell.PIECE_VOID) actions.add(c.index());
        return actions;
    }
}
