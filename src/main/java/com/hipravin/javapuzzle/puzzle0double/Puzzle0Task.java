package com.hipravin.javapuzzle.puzzle0double;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle0Task {


    public static void main(String[] args) {
        int i = 10;
        PuzzleAssert.assertTrue(checkNumber(i));
    }

    public static boolean checkNumber(int i) {
        double x = i / 1000.0 - i / 1000;

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
