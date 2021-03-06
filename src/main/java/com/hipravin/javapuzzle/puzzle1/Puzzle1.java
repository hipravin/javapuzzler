package com.hipravin.javapuzzle.puzzle1;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Scanner;

public class Puzzle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(Integer.parseInt(input));

        System.out.println(
                passed ? "passed" : "failed");
    }

    static boolean test(int i) {
        Long l1 = (long) i;
        Long l2 = (long) i;
        Long l3 = (long) i - 1;
        Long l4 = (long) i - 1;

        System.out.println("l1!=l2:" + (l1 != l2));
        System.out.println("l3==l4:" + (l3==l4));

        return l1 != l2
                && l3 == l4;
    }

    //answer: 128, check sources for Long.valueOf
}
