package com.hipravin.javapuzzle.puzzle12;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Random;
import java.util.stream.Stream;

public class Puzzle12 {

    //i18n
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Internationalization");

        long count = stream
//                .flatMap(s -> s.chars().boxed())
//                .flatMap(s -> Stream.generate(() -> 1).limit(20))
//                .flatMap(s -> Stream.of(1,2,3,4,5,6,7,8,9,10, 1,2,3,4,5,6,7,8,9,10))
                .count();

        System.out.println(count);

        boolean condition = count == 20;

        PuzzleAssert.assertTrue(condition);
    }

    //answer: add .flatMap(s -> s.chars().boxed())
    //
}
