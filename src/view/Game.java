package view;

/**
 * Created by hell on 25/08/14.
 */
import java.util.Scanner;
import controller.PositionController;

public class Game {
    public void Screen(){
        GameScreen screen = new GameScreen();
        PositionController position= new PositionController();
        int gamefield[][];
        int fieldpos;
        int player=2;
        boolean finished=false;
        gamefield = CreateMatrix();
        int score;

        do {
            player = ChangePlayer(player);
            do {
                screen.PrintField(gamefield, player);
                Scanner startScan = new Scanner(System.in);
                fieldpos = startScan.nextInt();
                position.CorrectPos(fieldpos);
            }while (fieldpos == 0);
            screen.PrintField(gamefield, player);
            position.MakePosition(gamefield, fieldpos, player);
            finished=position.WinCheck(gamefield);
        }while(!finished);
    }
    private int[][] CreateMatrix() {
        int matrix[][] = new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matrix[i][j]=0;
            }
        }
        return matrix;
    }
    private int ChangePlayer(int player){
        switch (player) {
            case 1:
                player++;
                break;
            case 2:
                player--;
                break;

        }
        return player;
    }
}
