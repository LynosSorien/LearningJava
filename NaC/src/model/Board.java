/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author juanma
 */
public class Board {
    private Cell[][] board;
    
    public Board () {
        init();
    }
    
    public void init(){
        for (int i=0;i<2;i++)
            for (int j=0;j<2;j++)
                board[i][j] = new Cell();
    }
}
