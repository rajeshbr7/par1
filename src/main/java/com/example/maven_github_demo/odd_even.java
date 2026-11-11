package com.example.maven_github_demo;


public class odd_even {

    public String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        odd_even obj = new odd_even();

        int number = 10;

        System.out.println(number + " is " + obj.checkEvenOdd(number));
    }
}
