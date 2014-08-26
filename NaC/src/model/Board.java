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
    
    public boolean isEmpty(int i, int j){
        return this.board[i][j].equals("-");
    }
    
    public String[] getColumn(int col){
        String[] ret = new String[3];
        for (int i=0;i<3;i++){
            ret[i] = this.board[i][col];
        }
        return ret;
    }
    
    public String[] getRow(int row){
        String[] ret = new String[3];
        for (int i=0;i<3;i++){
            ret[i] = this.board[row][i];
        }
        return ret;
    }
    
    /**
     * 
     * @param diag if 1 if the diagonal is the decreassing diagonal, else if 0 
     * the diagonal is the increassing diagonal.
     * @return 
     */
    public String[] getDiagonal(int diag){
        String[] ret = new String[3];
        if (diag == 1)
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    if (i==j)
                        ret[i] = this.board[i][j];
                }
            }
        else{
            ret[0] = this.board[2][0];
            ret[0] = this.board[1][1];
            ret[0] = this.board[0][2];
        }
            
        return ret;
    }
    
    public boolean isFull(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (this.board[i][j].equals("-"))return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString(){
        String b = "";
        b+="  0|1|2\n";
        for (int i=0;i<3;i++){
            b+=i+" ";
            for (int j=0;j<3;j++){
                b += board[i][j];
                if (j<2)b+="|";
                else if (j==2)b+="\n";
            }
        }
        return b;
    }
}
