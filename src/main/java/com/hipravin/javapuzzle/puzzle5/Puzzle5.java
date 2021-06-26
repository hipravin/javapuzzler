package com.hipravin.javapuzzle.puzzle5;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle5 {
    public static void main(String[] args) {
        String s = "aba"; // answer: any palindrome

        String s1 = new StringBuilder(s).reverse().toString();

        boolean condition = s.length() > 3 && s == s1.intern();

        PuzzleAssert.assertTrue(condition);

    }
}
