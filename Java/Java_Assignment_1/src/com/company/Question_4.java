package com.company;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        if(sub1 > 60 && sub2 > 60 && sub3 > 60){
            System.out.println("Passed");
        } else if ((sub1 > 60 && sub2 > 60) || (sub2 > 60 && sub3 > 60) || (sub3 > 60 && sub1 > 60)){
            System.out.println("Promoted");
        } else {
            System.out.println("Failed");
        }
    }
}
