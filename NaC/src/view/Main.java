package view;

import control.Control;

public class Main {
    public Control ctrl;
    public Main() {
    	ctrl = new Control();
    	ctrl.selectPiece(true);
    }
    	
	public static void main(String[] args) {
            new Main();
	}

}
