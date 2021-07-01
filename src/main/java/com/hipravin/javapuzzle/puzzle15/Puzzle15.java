package com.hipravin.javapuzzle.puzzle15;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Puzzle15 {

    public static void main(String[] args) {
        //--
        Supplier<Integer> ints = () -> new Random(0).nextInt();

        int i1 = ints.get();
        int i2 = ints.get();
        int i3 = ints.get();

        System.out.println(i1 + " " + i2 + " " + i3);

        boolean condition = i1 == i2 && i2 == i3;
        //--
        PuzzleAssert.assertTrue(condition);
    }
    //add one symbol to make assert pass
    //solution add 0 to random

}
