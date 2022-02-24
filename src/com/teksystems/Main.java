package com.teksystems;

public class Main {

    public static void main(String[] args) {
        problemOne();
        problemTwo();
    }
    public static void problemOne () {
        /*Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.*/
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }

    public static void problemTwo () {
        /*Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.*/
        int count = 0;
        while (count < 101) {
            System.out.println(count);
            count+=10;
        }
    }
}
