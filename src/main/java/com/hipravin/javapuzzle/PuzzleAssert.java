package com.hipravin.javapuzzle;

public abstract class PuzzleAssert {
    private PuzzleAssert() {
    }

    public static void assertTrue(boolean condition) {
        if(!condition) {
            throw new AssertFailedException();
        }
    }
}
