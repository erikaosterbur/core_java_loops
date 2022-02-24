package com.teksystems;

public class Main {

    public static void main(String[] args) {
        problemOne();
        problemTwo();
        problemThree();
        problemFour();
        problemFive();
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

}
