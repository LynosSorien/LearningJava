package model;

import model.model.lt.BoardListener;
import model.model.lt.CellListener;

/**
 * Created by david on 25/08/14.
 */
public class Cell extends Constants{
    private int type;
    private CellListener listener;
    private int index;
    public Cell(int index, CellListener listener) {
        this.type = PIECE_VOID;
        this.index = index;
        this.listener = listener;
    }

    public int index() { return index; }

    public int getCellType() {
        return type;
    }

    public void putPiece(int piece) {
        this.type = piece;
        this.listener.onCellOccupiedListener(this);
    }

    @Override
    public String toString() {
        if (type == PIECE_O) return "O";
        if (type == PIECE_X) return "X";
        return " ";
    }
}
