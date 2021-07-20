package com.hipravin.javapuzzle.puzzle0double;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Scanner;

public class Puzzle0Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(Integer.parseInt(input));

        System.out.println(
                passed ? "passed" : "failed");
    }

    public static boolean test(int i) {
        double x = i / 1000.0 - i / 1000;

        System.out.println("x: " + x);

        return x != 0 && (float) x == x;
    }

    //answers:
//    125
//    250
//    375
//    500
//    625
//    750
//    875
//
}
