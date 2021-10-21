package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        int[][] st1 = new int[3][3];
        int[][] st2 = new int[3][3];
        int[][] st3 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                st1[i][j]= sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                st2[i][j]= sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                st3[i][j]= sc.nextInt();
            }
        }

        System.out.println("Student 1");
        double total = 0;
        for(int i = 0; i < 3; i++){
            int s = 0;
            for(int j = 0; j < 3; j++){
                s += st1[i][j];
            }
            total += s;
            System.out.println("Subject " + i + " total = " + s);
        }
        System.out.println("Average " + total/3);

        System.out.println("Student 2");
        total = 0;
        for(int i = 0; i < 3; i++){
            int s = 0;
            for(int j = 0; j < 3; j++){
                s += st2[i][j];
            }
            total += s;
            System.out.println("Subject " + i + " total = " + s);
        }
        System.out.println("Average " + total/3);

        System.out.println("Student 3");
        total = 0;
        for(int i = 0; i < 3; i++){
            int s = 0;
            for(int j = 0; j < 3; j++){
                s += st3[i][j];
            }
            total += s;
            System.out.println("Subject " + i + " total = " + s);
        }
        System.out.println("Average " + total/3);

        System.out.println("Subject 1");
        double s = 0;
        for(int i = 0; i < 3; i++){
            s += (st1[0][i] + st2[0][i] + st3[0][i]);
        }
        System.out.println("Average = " + s/3);

        System.out.println("Subject 2");
        s = 0;
        for(int i = 0; i < 3; i++){
            s += (st1[1][i] + st2[1][i] + st3[1][i]);
        }
        System.out.println("Average = " + s/3);

        System.out.println("Subject 3");
        s = 0;
        for(int i = 0; i < 3; i++){
            s += (st1[2][i] + st2[2][i] + st3[2][i]);
        }
        System.out.println("Average = " + s/3);

    }
}
