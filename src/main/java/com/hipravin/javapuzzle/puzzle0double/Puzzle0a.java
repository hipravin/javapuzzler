package com.hipravin.javapuzzle.puzzle0double;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Scanner;

public class Puzzle0a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(Long.parseLong(input));

        System.out.println(passed ? "passed" : "failed");
    }

    static boolean test(long l) {
        long l2 = l >> 63;

        System.out.println("l bin: " + Long.toBinaryString(l));
        System.out.println("l2 bin: " + Long.toBinaryString(l2));

        return l2 != 0;
    }

}
