package model;

import model.model.lt.BoardListener;
import model.model.lt.CellListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 25/08/14.
 */
public class Board implements CellListener{
    private Cell[][] board;

    private BoardListener listener;

    public Board() {
        int counter = 0;
        this.board = new Cell[3][3];
        for (int i=0;i < board.length;i++)
            for (int j =0;j<board[i].length;j++)
                board[i][j] = new Cell(counter++,this);
    }

    public Cell getCell(int index) {
        return board[index/3][index%3];
    }
    public void place(int index, int agent) { getCell(index).putPiece(agent); }

    public List<Cell> getCellList() {
        ArrayList<Cell> cells = new ArrayList();
        for (int i=0;i < board.length;i++)
            for (int j =0;j<board[i].length;j++)
                cells.add(board[i][j]);
        return cells;
    }

    public void addListener(BoardListener listener) {
        this.listener = listener;
    }

    @Override
    public String toString() {
        String toReturn = new String("");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                toReturn += "| " + board[i][j] + " |";
            }
            if (i < board.length - 1) toReturn += '\n';
        }
        return toReturn;
    }
    
    public int[][] getSimpleBoard() {
        int[][] matrix = new int[3][3];
        for (int i=0;i < board.length;i++)
            for (int j =0;j<board[i].length;j++)
                matrix[i][j] = board[i][j].getCellType();
        return matrix;
    }

    @Override
    public void onCellOccupiedListener(Cell cell) {
        this.listener.onCellOccupiedListener(this);
    }
}
