package com.hipravin.javapuzzle.puzzle2;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Scanner;

public class Puzzle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(Integer.parseInt(input));

        System.out.println(
                passed ? "passed" : "failed");
    }

    public static boolean test(int i) {
        System.out.println("i*i: " + i * i);
        return i != 0 && i * i == 0;
    }

    //answer: 65536 or i % 65536 == 0
}
