package com.company;

public class Question_8 {

    public void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void display(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Question_8 ob = new Question_8();
        int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        ob.bubbleSort(arr);
        ob.display(arr);
    }
}
