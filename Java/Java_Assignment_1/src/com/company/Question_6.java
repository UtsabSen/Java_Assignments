package com.company;

import java.util.Scanner;

public class Question_6 {
    public boolean login(String username, String password){
        if(username.equals("utsab") && password.equals("pass123")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question_6 ob = new Question_6();
        int count = 0;
        while (count < 3){
            String user = sc.next();
            String pass = sc.next();
            if(ob.login(user, pass)){
                System.out.println("Welcome " + user);
                break;
            } else {
                System.out.println("Wrong login credentials");
                count++;
            }
        }
        if(count == 3){
            System.out.println("Contact Admin");
        }
    }
}
