package control;

import model.Board;
import model.Constants;
import model.GameConfig;
import model.VictoryConditions;
import model.model.lt.BoardListener;
import model.model.lt.GameListener;
import model.model.lt.TurnListener;

/**
 * Created by david on 25/08/14.
 */
public class Core extends Thread{
    private Board board;
    private TurnListener listener;

    public Core() {
    }

    public void startGame() {
        this.board = new Board();
        this.start();
    }

    public void addListener(GameListener listener) {
        if (listener instanceof BoardListener) this.board.addListener((BoardListener)listener);
        if (listener instanceof TurnListener) this.listener = (TurnListener)listener;
    }

    @Override
    public void run() {
        int turn = GameConfig.instance().whoStarts();
        int move;
        while(!VictoryConditions.endGameState(this.board)) {
            if (turn == Constants.START_AGENT) {
                this.board.place(board.getCellList().get((int)Math.random()*board.getCellList().size()).index(),turn);
                turn*=-1;
            } else {
                move = this.listener.onPlayerTurnEventListener(board);
                this.board.place(move, turn);
                turn*=-1;
            }
        }
    }
}
