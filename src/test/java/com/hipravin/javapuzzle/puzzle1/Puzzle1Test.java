package com.hipravin.javapuzzle.puzzle1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Puzzle1Test {

    @Test
    void testMin() {
        for (int i = 0; i < 10000; i++) {
            if(Puzzle1.test(i)) {
                System.out.println(i);
            }

        }
    }
}