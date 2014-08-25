package controller;

/**
 * Created by hell on 25/08/14.
 */
public class PositionController {
    public int CorrectPos(int num) {
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            default:
                System.out.println("Error, Please make a correct number");
                num = 0;
                break;
        }
        return num;
    }

    public int[][] MakePosition(int[][] matrix, int position, int player) {
        switch (position) {
            case 1:
                matrix[0][0] = player;
                break;
            case 2:
                matrix[0][1] = player;
                break;
            case 3:
                matrix[0][2] = player;
                break;
            case 4:
                matrix[1][0] = player;
                break;
            case 5:
                matrix[1][1] = player;
                break;
            case 6:
                matrix[1][2] = player;
                break;
            case 7:
                matrix[2][0] = player;
                break;
            case 8:
                matrix[2][1] = player;
                break;
            case 9:
                matrix[2][2] = player;
                break;
        }
        return matrix;
    }
    public boolean WinCheck(int[][]matrix){
        boolean winner=false;

        return winner;
    }
}
