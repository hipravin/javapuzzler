package com.hipravin.javapuzzle.puzzle14;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.stream.Stream;

public class Puzzle14 {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

        long value = stream
                .max(
                        Long::compare  // edit this line
//                        (a, b) -> a == 2 ? 1 : ((b == 2) ? -1 : Long.compare(a, b))
                ).get();

        System.out.println(value);
        boolean condition = value == 2;

        PuzzleAssert.assertTrue(condition);
    }
    //we write a comparator that makes 2 bigger than other numbers

}
