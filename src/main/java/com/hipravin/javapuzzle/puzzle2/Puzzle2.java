package com.hipravin.javapuzzle.puzzle2;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle2 {
    public static void main(String[] args) {
        int i = 1000000000 ;

        PuzzleAssert.assertTrue(checkNumber(i));
    }

    public static boolean checkNumber(int i) {
        return i != 0 && i * i == 0;
    }

    //answer: 65536 or i % 65536 == 0
}
