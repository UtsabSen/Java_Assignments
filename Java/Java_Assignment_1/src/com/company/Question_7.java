package com.company;

public class Question_7 {
    public boolean findInArr(int[] arr, int n){
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Question_7 ob = new Question_7();
        int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int value = 19;
        if(ob.findInArr(arr, value)){
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }
    }
}
