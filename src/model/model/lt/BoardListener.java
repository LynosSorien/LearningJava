package model.model.lt;

import model.Board;
import model.Cell;

/**
 * Created by david on 25/08/14.
 */
public interface BoardListener extends GameListener{
    public void onCellOccupiedListener(Board board);
}
