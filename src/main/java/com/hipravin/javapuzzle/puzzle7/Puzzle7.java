package com.hipravin.javapuzzle.puzzle7;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Puzzle7 {
    public static void main(String[] args) {
        int year = 2021; //changeit, answer: 2019, 2024

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd");

        String formatted = dtf.format(LocalDate.of(year, 12,31));

        System.out.println(formatted);

        PuzzleAssert.assertFalse(formatted.contains(String.valueOf(year)));
    }

}
