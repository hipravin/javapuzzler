package com.hipravin.javapuzzle.puzzle17;

import com.hipravin.javapuzzle.PuzzleAssert;

public class Puzzle17 {

    public static void main(String[] args) {
        int len = 28;//answer 25

        String s = "\t\u2000Hello,\u00A0nbsp\u00A0";

        String trim = s.trim();
        String strip = s.strip();

        System.out.println("s     = '" + s + "'");
        System.out.println("trim  = '" + trim + "'");
        System.out.println("strip = '" + strip + "'");

        boolean condition = len == trim.length() + strip.length();

        PuzzleAssert.assertTrue(condition);
    }
    //even if you use strip or trim, you can see whitespaces data

}
