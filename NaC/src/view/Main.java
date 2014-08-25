package view;

import control.Control;
import java.util.Scanner;

public class Main {
    public Control ctrl;
    public Scanner sc;
    public Main() {
    	ctrl = new Control();
        sc = new Scanner(System.in);
    	ctrl.selectPiece(true);
        System.out.println("BOARD");
        System.out.println(ctrl.getBoard());
        System.out.println("player piece"+ctrl.getPieceType());
       
    }
    	
	public static void main(String[] args) {
            new Main();
	}

}
