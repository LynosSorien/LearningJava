/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author juanma
 */
public class Piece {
    private String piece;
    
    /**
     * 
     * @param isCircle IF this parameter value is false then the piece value will be
     * "X", otherwise it will be "O".
     */
    public Piece(boolean isCircle){
        if (isCircle) this.piece="O";
        else    this.piece = "X";
    }
}