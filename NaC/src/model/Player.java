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
    public String pieceType;
    
    public Player(boolean op){
        if (op) this.pieceType = "O";
        else    this.pieceType = "X";
    }
    
    public String getPieceType(){
        return this.pieceType;
    }
}
