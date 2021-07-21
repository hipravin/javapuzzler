package com.hipravin.javapuzzle.puzzle4;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Puzzle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(input);

        System.out.println(
                passed ? "passed" : "failed");
    }

    static boolean test(String s) {
        String s2 = new String(s.getBytes(), StandardCharsets.US_ASCII);

        System.out.println("s2: " + s2);

        return !s.equals(s2);
    }

    //answer - add any non ASCII symbol e.g. euro sign String s = "abc123€";
}
