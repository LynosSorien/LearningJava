package view;

import java.util.Scanner;
import java.io.IOException;


/**
 * Created by hell on 25/08/14.
 */
public class MainStage{


    public int StartScreen() {
        try {
            Runtime.getRuntime().exec("cls");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int startnum=0;
        System.out.println("---------------BETA 3 en Raya---------------\n");
        System.out.println("--1-Start Game--\n");
        System.out.println("--2-Score Historic--\n");
        System.out.println("--3-How To Play--\n");
        System.out.println("--4-Exit--\n");
        System.out.println("-----------------Java Is OP!----------------\n");
        System.out.println("Insert Option: ");
        Scanner startScan=new Scanner(System.in);
        startnum = startScan.nextInt();
        Selector(startnum);
        return startnum;


    }

    private void Selector(int num) {
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
            default:
                System.out.println("Error, Please make a correct number");
                break;
        }
    }
}
