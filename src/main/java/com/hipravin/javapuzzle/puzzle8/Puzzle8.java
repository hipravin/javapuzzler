package com.hipravin.javapuzzle.puzzle8;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Puzzle8 {
    public static void main(String[] args) {
        String zoneId = "UTC"; //Answer: "Europe/London"

        ZonedDateTime zdt1 = LocalDate.of(2021, Month.JANUARY, 1)
                .atStartOfDay(ZoneId.of(zoneId));

        ZonedDateTime zdt2 = LocalDate.of(2021, Month.JULY, 1)
                .atStartOfDay(ZoneId.of(zoneId));

        System.out.println(zdt1 + " " + zdt2);

        boolean condition = zdt1.getOffset().equals(zdt2.getOffset());
        PuzzleAssert.assertFalse(condition);
    }
}
