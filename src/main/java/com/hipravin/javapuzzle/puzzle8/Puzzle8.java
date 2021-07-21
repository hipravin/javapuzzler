package com.hipravin.javapuzzle.puzzle8;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Puzzle8 {
         //Answer: "Europe/London"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(input);

        System.out.println(
                passed ? "passed" : "failed");
    }

    static boolean test(String zoneId) {
        ZonedDateTime zdt1 =
                LocalDate.of(2021, Month.JANUARY, 1)
                .atStartOfDay(ZoneId.of(zoneId));

        ZonedDateTime zdt2 =
                LocalDate.of(2021, Month.JULY, 1)
                .atStartOfDay(ZoneId.of(zoneId));

        System.out.println(
                "ztd1offset:" + zdt1.getOffset());
        System.out.println(
                "ztd2offset:" + zdt2.getOffset());

        return !zdt1.getOffset().equals(zdt2.getOffset());
    }
}
