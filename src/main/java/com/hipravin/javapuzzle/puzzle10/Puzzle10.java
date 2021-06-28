package com.hipravin.javapuzzle.puzzle10;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.util.HashMap;
import java.util.Map;

public class Puzzle10 {

    //add code puzzle
    //previous one was easy, right?
    public static void main(String[] args) {
        //--
        Map<Long, String> map = new /*java.util.Identity*/HashMap<>();
        //--
        map.clear();
        map.put(1L, "One1");
        map.put(1L, "One2");
        map.put(1000L, "Thousand1");
        map.put(1000L, "Thousand2");
        map.put(1000L, "Thousand3");

        boolean condition = map.size() == 4;

        PuzzleAssert.assertTrue(condition);
    }
}
