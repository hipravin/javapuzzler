package com.hipravin.javapuzzle.puzzle7;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Puzzle7 {
    //changeit, answer: 2019, 2024

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(Integer.parseInt(input));

        System.out.println(
                passed ? "passed" : "failed");
    }

    static boolean test(int year) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        String formatted = dtf.format(
                LocalDate.of(year, 12, 30));

        System.out.println(formatted);

        return !formatted.contains(
                String.valueOf(year));
    }
}
