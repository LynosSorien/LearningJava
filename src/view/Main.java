package view;

import java.io.IOException;
import view.MainStage;
import java.awt.event.KeyEvent;



public class Main{
	public static void main(String[] args) {
        MainStage start = new MainStage();
        int selector = 0;
        while (selector != 4 || selector != 1 || selector != 2 || selector != 3) {
            selector = start.StartScreen();
        }
    }
}
