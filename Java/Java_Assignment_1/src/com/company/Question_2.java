package com.company;

public class Question_2 {
    public static void main(String[] args) {
        Question_1 ob = new Question_1();
        for(int i = 100; i < 1000; i++){
            if(ob.isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
