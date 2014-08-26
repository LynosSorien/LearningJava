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
        this.board = new Board();
    }

    public void startGame() {
        this.start();
    }

    public void restartGame() {
        this.board = new Board();
        run();
    }

    public void reload(GameListener listener) {
        this.board = new Board();
        addListener(listener);
        run();
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
            System.out.println((int)(Math.random()*VictoryConditions
                    .getPossibleActions(board)
                    .size()));
            if (turn == Constants.START_AGENT) {
                this.board.place(VictoryConditions.getPossibleActions(board)
                        .get((int) (Math.random() * VictoryConditions
                                .getPossibleActions(board)
                                .size())),
                        turn);
                turn*=-1;
            } else {
                move = this.listener.onPlayerTurnEventListener(board);
                this.board.place(move, turn);
                turn*=-1;
            }
        }
        this.listener.onEndStateEventListener(board);
    }
}
