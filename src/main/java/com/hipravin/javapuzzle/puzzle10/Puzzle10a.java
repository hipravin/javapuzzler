package com.hipravin.javapuzzle.puzzle10;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.HashMap;
import java.util.Map;

public class Puzzle10a {

    //add code puzzle
    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<>();

        map.put(1L, "One1");
        map.put(1L, "One2");
        map.put(1000L, "Thousand1");
        map.put(1000L, "Thousand2");
        map.put(1000L, "Thousand3");

        /**
        map.put(1001L, "Thousand");map.put(1002L, "Thousand");*/

        boolean condition = map.size() == 4;
        PuzzleAssert.assertTrue(condition);
    }
}
