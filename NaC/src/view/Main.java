package view;

import control.Control;
import java.util.Scanner;

public class Main {
    public Control ctrl;
    public Scanner sc;
    public boolean myTurn;
    
    public Main() {
        int option = -1;
    	ctrl = new Control();
        sc = new Scanner(System.in);
        while (option<0 || option >1){
            System.out.println("choose piece X(0), O(1)?");
            option = Integer.parseInt(sc.nextLine());
        }
        if (option == 1)ctrl.selectPiece(true);
        else    ctrl.selectPiece(false);
        System.out.println("player piece: "+ctrl.getPieceType());
        System.out.println("BOARD");
        System.out.println(ctrl.getBoard());
        option = -1;
        while (option<0 || option >1){
            System.out.println("Who starts me(0), cpu(1)?");
            option = Integer.parseInt(sc.nextLine());
        }
        if (option == 0){
            myTurn = ctrl.whoStarts(true);
            System.out.println("Starts the player");
        }else{
            myTurn = ctrl.whoStarts(false);
            System.out.println("Starts the cpu");
        }
        startGame();
    }
    
    public void startGame(){
        boolean notFinished = false;
        int row = -1,col = -1;
        while (!notFinished){
            if (myTurn){
                System.out.println("turn of player");
                System.out.println("make a movement");
                System.out.println("introduce row (0,1,2)");
                row = Integer.parseInt(sc.nextLine());
                System.out.println("introduce column (0,1,2)");
                col = Integer.parseInt(sc.nextLine());
                notFinished = ctrl.setPlay(row, col);
                myTurn = !myTurn;
            }else{
                System.out.println("turn of CPU");
                notFinished = ctrl.cpuPlay();
                myTurn = !myTurn;
            }
            System.out.println("BOARD");
            System.out.println(ctrl.getBoard());
        }
    }
    	
    public static void main(String[] args) {
        new Main();
    }

}
