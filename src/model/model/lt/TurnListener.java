package model.model.lt;

import model.Board;

/**
 * Created by david on 25/08/14.
 */
public interface TurnListener {
    public int onPlayerTurnEventListener(Board board);
    public void onEndStateEventListener(Board board);
}
