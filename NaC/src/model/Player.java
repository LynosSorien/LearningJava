/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author juanma
 */
public class Player {
    //public String pieceType;
    private boolean piece;
    /**
     * @param op False = Cross, Circle else.
     */ 
    public Player(boolean op){
        /*if (op) this.pieceType = "O";
        else    this.pieceType = "X";*/
        this.piece = op;
    }
    
    public String getPieceType(){
        return piece ? "O" : "X";
    }
    
    public boolean isCircle() { return piece; }
}
