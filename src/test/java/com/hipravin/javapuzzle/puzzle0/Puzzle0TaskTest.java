package com.hipravin.javapuzzle.puzzle0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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