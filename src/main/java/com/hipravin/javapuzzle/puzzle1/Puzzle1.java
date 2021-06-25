package com.hipravin.javapuzzle.puzzle1;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle1 {
    public static void main(String[] args) {
        int i = 1000;

        PuzzleAssert.assertTrue(checkNumber(i));
    }

    public static boolean checkNumber(int i) {
        Long l1 = (long) i;
        Long l2 = (long) i;
        Long l3 = (long) i - 1;
        Long l4 = (long) i - 1;

        return l1 != l2
                && l3 == l4;
    }

    //answer: 128, check sources for Long.valueOf
}
