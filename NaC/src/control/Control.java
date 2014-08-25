/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Board;
import model.Player;

/**
 *
 * @author juanma
 */
public class Control {
    private Board board;
    private Player player;
    private Player cpu;
    
    private enum TURN {player,cpu};
    private TURN turn;
    
    public Control(){
        this.board = new Board();
    }
    
    /**
     * 
     * @param isCircle  is true = circle, else cross
     */
    public void selectPiece(boolean isCircle){
        this.player = new Player(isCircle);
        this.cpu = new Player(!isCircle);
    }

    /**
     * 
     * @param op if true is the player turn, else is the cpu turn.
     */
    public void whoStarts(boolean op){
        if (op) turn = TURN.player;
        else    turn = TURN.cpu;
    }
    
    public void setPlay(int row, int col){
        if (turn.equals(TURN.player))    this.board.setPiece(row,col,player.getPieceType());
        else    this.board.setPiece(row, col, cpu.getPieceType());
    }
}
