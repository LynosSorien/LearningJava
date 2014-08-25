/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author juanma
 */
public class Cell {
    private Piece piece;
    
    public Cell(){
        this.piece = null;
    }
    
    public void setCell(Piece p){
        this.piece = p;
    }
    
    public Piece getPiece(){
        return this.piece;
    }
}
