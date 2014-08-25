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
    private String[][] board;
    
    public Board () {
        for (int i=0;i<2;i++)
            for (int j=0;j<2;j++)
                board[i][j] = "_";
    }

    public void setPiece(int i, int j, String piece){
        this.board[i][j] = piece;
    }
    
    @Override
    public String toString(){
        String b = "";
        for (int i=0;i<2;i++)
            for (int j=0;j<2;j++){
                b += board[i][j];
                if (i<3)b+="|";
            }
        return b;
    }
}
