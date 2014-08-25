package view;

import control.Core;
import model.Board;
import model.Constants;
import model.GameConfig;
import model.model.lt.BoardListener;
import model.model.lt.TurnListener;

import java.util.Scanner;

/**
 * Created by david on 25/08/14.
 */
public class NaC
    implements BoardListener, TurnListener {
    private Core core;
    private Scanner sc;
    private boolean end;

    public NaC() {
        GameConfig.instance().configureStart(GameConfig.START_RANDOM);
        this.core = new Core();
        this.core.addListener(this);
        this.end = false;
    }

    public void start() {
        this.core.startGame();
        int choice = 0;
        sc = new Scanner(System.in);
        do {
            if (end) {
                System.out.println("End? "+Constants.END_GAME);
                choice = Integer.parseInt(sc.nextLine());
                if (choice!=Constants.END_GAME) {
                    this.end = false;
                    this.core.startGame();
                }
            }
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

    @Override
    public int onPlayerTurnEventListener(Board board) {
        System.out.println("Player Turn, put the index of the cell");
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public void onEndStateEventListener(Board board) {
        this.end = true;
    }
}
