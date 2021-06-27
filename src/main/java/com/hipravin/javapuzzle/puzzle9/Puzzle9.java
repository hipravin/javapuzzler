package com.hipravin.javapuzzle.puzzle9;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.stream.Stream;

public class Puzzle9 {
    public static void main(String[] args) {
        String qValue = "e/f";//answer /e/f or .. or any other not normalized path

        Path p = Paths.get("/a/b/c");
        Path q = Paths.get(qValue);
        Path qq = p.relativize(p.resolve(q));

        System.out.println(qq);

        boolean condition = q.equals(qq);

        PuzzleAssert.assertFalse(condition);
        //For any two normalized paths p and q, where q does not have a root component,
        //p.relativize(p.resolve(q)).equals(q)
    }
}
