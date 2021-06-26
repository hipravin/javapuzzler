package com.hipravin.javapuzzle.puzzle4;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.nio.charset.StandardCharsets;

public class Puzzle4 {
    public static void main(String[] args) {
        String s = "abc123";
        String s2 = new String(s.getBytes(), StandardCharsets.US_ASCII);

        System.out.println(s + "\t" + s2);

        boolean condition = !s.equals(s2);

        PuzzleAssert.assertTrue(condition);
    }

    //answer - add any non ASCII symbol e.g. euro sign String s = "abc123€";
}
