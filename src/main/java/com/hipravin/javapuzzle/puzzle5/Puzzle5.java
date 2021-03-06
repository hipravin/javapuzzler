package com.hipravin.javapuzzle.puzzle5;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Scanner;

public class Puzzle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(input);

        System.out.println(
                passed ? "passed" : "failed");
    }

    static boolean test(String s) {
        String s1 = new StringBuilder(s).reverse().toString();

        System.out.println("s1: " + s1);

        return s.length() > 3
                && s.intern() == s1.intern();
    }
}
