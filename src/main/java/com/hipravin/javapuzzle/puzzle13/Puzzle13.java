package com.hipravin.javapuzzle.puzzle13;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.stream.Stream;

public class Puzzle13 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3,3,3);

        long value = stream
                .reduce(0, /**/ (a, b) -> a+b /**/);
//                .reduce(0, /**/ (a, b) -> 10 /**/); // solution

        System.out.println(value);

        boolean condition = value == 10;

        PuzzleAssert.assertTrue(condition);
    }


}
