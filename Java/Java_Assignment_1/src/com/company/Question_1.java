package com.company;

import java.util.Scanner;

public class Question_1 {

    public boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while(n != 0){
            sum += Math.pow((n % 10), 3);
            n /= 10;
        }
        return (sum == temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question_1 ob = new Question_1();
        
        if(ob.isArmstrong(n)){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
