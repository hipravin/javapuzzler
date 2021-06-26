package com.hipravin.javapuzzle.puzzle6;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle6 {
    public static void main(String[] args) {
        String s = "^abc$"; //answer: .+
        String s2 = (s + s).replaceAll(s, s);

        System.out.println(s + "\t" + s2);
        boolean condition = !s.isEmpty() && s.equals(s2);

        PuzzleAssert.assertTrue(condition);
    }
    //plural of regexp is regrets
}
