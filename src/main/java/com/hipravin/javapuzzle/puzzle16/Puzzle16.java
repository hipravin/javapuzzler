package com.hipravin.javapuzzle.puzzle16;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Random;
import java.util.function.Supplier;

public class Puzzle16 {

    public static void main(String[] args) {
        //--
        boolean b = true;

        b = b && !b && b && !b;
//        b |= b && !b && b && !b; //solution (add 1 symbol)

        System.out.println("b is " + b);
        //--
        PuzzleAssert.assertTrue(b);
    }
// comment: my colleague once used bitwise operation b &= other rather than b = b && other
// this replacement is less text but not equivalent because first expression doesn't use short computation logic.
// however I remembered that this is possible.

}
