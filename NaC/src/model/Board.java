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
        board = new String[3][3];
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                board[i][j] = "-";
    }

    public void setPiece(int i, int j, String piece){
        this.board[i][j] = piece;
    }
    
    @Override
    public String toString(){
        String b = "";
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++){
                b += board[i][j];
                if (j<2)b+="|";
                else if (j==2)b+="\n";
            }
        return b;
    }
}
