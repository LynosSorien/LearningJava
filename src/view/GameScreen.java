package view;

/**
 * Created by hell on 25/08/14.
 */
public class GameScreen {

    public void PrintField(int[][] matrix, int player) {
        System.out.println("---------------BETA 3 en Raya---------------\n");
        switch (player) {
            case 1:
                System.out.println("Player Circle\n");
            case 2:
                System.out.println("Player Cross\n");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (matrix[i][j]) {
                    case 0:
                        System.out.println("  ");
                        break;
                    case 1:
                        System.out.println("O ");
                        break;
                    case 2:
                        System.out.println("X ");
                        break;
                }
            }
            System.out.println("\n");
        }
        System.out.println("Please Make Position: ");
    }
}