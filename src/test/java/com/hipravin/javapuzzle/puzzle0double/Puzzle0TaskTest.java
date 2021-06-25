package com.hipravin.javapuzzle.puzzle0double;

import org.junit.jupiter.api.Test;

class Puzzle0TaskTest {

    @Test
    void testOutWorking() {
        Puzzle0Task puzzle0Task = new Puzzle0Task();

        for (int i = -2000; i < 1000; i++) {
             if(puzzle0Task.checkNumber(i)) {
                 System.out.println(i);
             }

        }

    }
}