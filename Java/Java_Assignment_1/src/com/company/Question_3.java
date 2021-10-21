package com.company;

import java.util.Scanner;

public class Question_3 {
    public double simpleInterest(double p, double r, int t){
        return (p*r*t)/100;
    }
    public double compoundInterest(double p, double r, int t){
        return p * Math.pow((1 + (r / 100)), t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question_3 ob = new Question_3();
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        System.out.println("Simple Interest " + ob.simpleInterest(p, r, t));
        System.out.println("Compound Interest " + ob.compoundInterest(p, r, t));
    }
}
