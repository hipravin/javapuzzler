package com.hipravin.javapuzzle.puzzle11;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class Puzzle11 {

    //coins
    public static void main(String[] args) {
        //mining
        final Random random = new Random();
        double lt = 0.8; // edit lt, but irrespective of this result is random

        Stream<Double> data = Stream.generate(() -> random.nextDouble());
        long count = data.limit(10000).takeWhile(v -> v < lt).count();

        System.out.println(lt + " " + count);
        boolean condition = count == 5;

        PuzzleAssert.assertTrue(condition);
    }
}
