package com.hipravin.javapuzzle.tutorial;

import java.util.Scanner;

public class Puzzle0Tutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(input);

        System.out.println(passed ? "passed" : "failed");
    }

    static boolean test(String s) {
        return s.equals("Tutorial");
    }
}
