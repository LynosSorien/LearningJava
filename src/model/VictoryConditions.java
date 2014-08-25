package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by david on 25/08/14.
 */
public final class VictoryConditions {
    public static boolean endGameState(Board board) {
        if (hasVictory(board, Constants.START_AGENT)) return true;
        if (hasVictory(board, Constants.START_PLAYER)) return true;
        if (getPossibleActions(board).size() == 0) return true;
        return false;
    }

    public static boolean hasVictory(Board board, int agent) {
        boolean victory = false;
        int[][] matrix = board.getSimpleBoard();
        int count = 0;

        // ROWS
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                count+=matrix[i][j];
                if (count == 3*agent) return true;
            }
            count  = 0;
        }

        count = 0;
        //COLUMNS
        for (int j = 0; j<matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                count+=matrix[i][j];
                if (count == 3*agent) return true;
            }
            count  = 0;
        }

        count= 0;
        // CROSSES
        for (int ij = 0; ij<matrix.length; ij++) {
            count+=matrix[ij][ij];
            if (count == 3*agent) return true;
        }
        for (int ij = matrix.length-1; ij>=0; ij--) {
            count+=matrix[ij][ij];
            if (count == 3*agent) return true;
        }
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
