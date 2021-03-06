package com.hipravin.javapuzzle.puzzle6;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Scanner;

public class Puzzle6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(input);

        System.out.println(
                passed ? "passed" : "failed");
    }

    static boolean test(String s) {
        String s2 = (s + s).replaceAll(s, s);

        System.out.println("s2: " + s2);

        return !s.isEmpty() && s.equals(s2);
    }

    //".+"
    //plural of regexp is regrets
}
