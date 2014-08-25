package view;

import control.Core;
import model.Board;
import model.Constants;
import model.GameConfig;
import model.model.lt.BoardListener;
import model.model.lt.CellListener;

import java.util.Scanner;

/**
 * Created by david on 25/08/14.
 */
public class NaC extends Thread
    implements BoardListener {
    private Core core;
    private Scanner sc;

    public NaC() {
        GameConfig.instance().configureStart(GameConfig.START_RANDOM);
        this.core = new Core();
        this.core.addListener(this);
    }

    @Override
    public void run() {
        this.core.startGame();
        int choice = 0;
        sc = new Scanner(System.in);
        do {
            choice = Integer.parseInt(sc.nextLine());
        }while(choice!= Constants.END_GAME);
    }

    public static void main(String[] args) {
        new NaC().start();
    }

    @Override
    public void onCellOccupiedListener(Board board) {
        System.out.println("----------------NAC----------------");
        System.out.println(board);
        System.out.println("-----------------------------------");
    }
}
