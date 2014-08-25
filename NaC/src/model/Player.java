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
     * @param isCircle False = Cross, Circle else.
     */ 
    public Player(boolean isCircle){
        /*if (op) this.pieceType = "O";
        else    this.pieceType = "X";*/
        this.piece = isCircle;
    }
    
    public String getPieceType(){
        return piece ? "O" : "X";
    }
    
    public void setPieceType(boolean isCircle){
        this.piece = isCircle;
    }
    
    public boolean isCircle() { return piece; }
}
