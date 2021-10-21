package com.company;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ctc = sc.nextDouble();
        double result = 0;
        if(0 <= ctc && 1_80_000 >= ctc){
            result = 0;
        } else if(1_80_001 <= ctc && 3_00_000 >= ctc){
            result = ctc * 0.1;
        } else if(3_00_001 <= ctc && 5_00_000 >= ctc){
            result = ctc * 0.2;
        } else if(5_00_001 <= ctc && 10_00_000 >= ctc){
            result = ctc * 0.3;
        }
        System.out.println("Tax = " + result);
    }
}
