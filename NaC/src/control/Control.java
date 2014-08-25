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
     * @param isCircle if true = circle, else cross
     */
    public void selectPiece(boolean isCircle){
        this.player = new Player(isCircle);
        this.cpu = new Player(!isCircle);
    }

    /**
     * 
     * @param op if true is the player turn, else is the cpu turn.
     * @return returns true if is the players turn otherwise returns false;
     */
    public boolean whoStarts(boolean op){
        if (op){
            turn = TURN.player;
            return true;
        }else{
            turn = TURN.cpu;
            return false;
        }
    }
    
    public boolean cpuPlay(){
        int row = -1,col = -1;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (this.board.isEmpty(i,j)){
                    row = i;
                    col = j;
                }
            }
        }
        if  (row != -1 && col != -1)    return setPlay(row,col);
        else return false;
    }
    
    public boolean setPlay(int row, int col){
        boolean finish = false;
        int finished;
        if (turn.equals(TURN.player))    this.board.setPiece(row,col,player.getPieceType());
        else    this.board.setPiece(row, col, cpu.getPieceType());
        finished = this.checkBoard();
        System.out.println(finished);
        if (finished != -1){
            finish = true;
        }else   this.changeTurn();
        return finish;
    }
    
    public void changeTurn(){
        if (this.turn.equals(TURN.player))  this.turn = TURN.cpu;
        else this.turn = TURN.player;
    }
    
    /**
     * 
     * @return if 1 the player have won, if 0 the winner is the cpu, else if -1
     * the game is not finished.
     */
    public int checkBoard(){
        String[] check = new String[3];
        int winner = -1;
        
        check = this.board.getRow(0);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;

        check = this.board.getRow(1);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;
        
        check = this.board.getRow(2);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;

        check = this.board.getColumn(0);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;
        
        check = this.board.getColumn(1);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;
        
        check = this.board.getColumn(2);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;
        
        check = this.board.getDiagonal(0);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;
        
        check = this.board.getDiagonal(1);
        if (check[0].equals(check[1]) && check[1].equals(check[2]) && !check[0].equals("-"))
            if (check[0].equals(this.player.getPieceType()))    winner = 1;
            else    winner = 0;
        
        return winner;
    }
    
    public String getBoard(){
        return this.board.toString();
    }
    
    public String getPieceType(){
        return this.player.getPieceType();
    }
}
