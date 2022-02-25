package com.teksystems;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        problemOne();
//        problemTwo();
//        problemThree();
//        problemFour();
//        problemFive();
//        problemSix();
//        problemSeven();
//        problemEight();
        problemNine();
    }

    public static void problemOne() {
        /*Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.*/
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void problemTwo() {
        /*Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.*/
        int count = 0;
        while (count < 101) {
            System.out.println(count);
            count += 10;
        }
    }

    public static void problemThree() {
        /*Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.*/
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void problemFour() {
        /*Write a program that uses a for-loop to loop through the numbers 1-100.
        Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75.
        Use the “continue” statement to accomplish this. */
        for (int i = 1; i <= 100; i++) {
            if (i > 25 && i < 75) {
                continue;
            } if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void problemFive() {
        /*Write a program that uses a for-loop to loop through the numbers 1-100.
        Print out each number if is a multiple of 5, but do not print out any numbers greater than 50.
        Use the “break” keyword to accomplish this.*/
        for (int i = 1; i <= 100; i++) {
            if (i > 50) {
                break;
            }
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void problemSix () {
        /* Write a program that uses nested for-loops to output the following:
            Week 1:
            Day 1
            Day 2
            Day 3
            Day 4
            Day 5
            Week 2:
            Day 1
            Day 2
            Day 3
            Day 4
            Day 5*/
        for(int i = 1; i <= 2; i++){
            System.out.printf("Week %d:\n",i);
            for(int j = 1; j <=5; j++){
                System.out.printf("Day %d\n", j);
            }
        }

    }

    public static void problemSeven () {
        /* Write a program that returns all the available palindromes within 10 and 200.
        The following output will be produced:
                11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,*/

        for(int i = 10; i < 200; i++){
            String s = String.valueOf(i);
            int l = s.length();
             char first = s.charAt(0);
             char last = s.charAt(l-1);
             if(first == last){
                 System.out.println(i);
             }
        }
    }

    public static void problemEight () {
        /* Write a program that prints the Fibonacci Sequence from 0 to 50.
        The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,*/



    }

    public static void problemNine () {
        /* Write a program that nests a for-loop inside another.
        Print out the inner and outer variable (e.g., i or j)
        in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).*/

        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 5; j++){
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }
    }
}


