package com.hipravin.javapuzzle.puzzle20;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.stream.Stream;

public class Puzzle20 {


    public static void main(String[] args) {
        Stream<Integer> ints = Stream.of(1,1,1,0,0,1,1);

        int value = ints.reduce(0,
                (a,b) -> /**/a + b/**/
//                (a,b) -> /**/(a << 1) + b/**/ //solution
        );

        System.out.println(value);

        boolean condition = value == 115;

        PuzzleAssert.assertTrue(condition);
    }
    //a << 1 + b doesn't work because of operator priority

}
