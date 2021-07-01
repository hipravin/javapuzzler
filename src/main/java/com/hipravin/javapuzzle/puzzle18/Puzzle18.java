package com.hipravin.javapuzzle.puzzle18;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle18 {
    public static int throwException() {
        try {
            throw new RuntimeException("failed");
        } catch (RuntimeException e) {
            throw e;
        }
//        finally {            return 1;        } //solution

    }

    public static void main(String[] args) {
        boolean condition = throwException() == 1;
        PuzzleAssert.assertTrue(condition);
    }
}
