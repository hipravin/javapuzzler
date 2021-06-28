package com.hipravin.javapuzzle.puzzle0double;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle0a {


    public static void main(String[] args) {
        long l = 123456789; //answer: any negative

        long l2 = l >> 63;

        System.out.println("l2: " + l2);

        boolean condition = l >> 63 != 0;

        PuzzleAssert.assertTrue(condition);
    }

}
