package control;

import model.Board;
import model.model.lt.BoardListener;
import model.model.lt.GameListener;

/**
 * Created by david on 25/08/14.
 */
public class Core {
    private Board board;

    public Core() {
    }

    public void startGame() {
        this.board = new Board();
    }

    public void addListener(GameListener listener) {
        if (listener instanceof BoardListener) this.board.addListener((BoardListener)listener);
    }
}
