package com.hipravin.javapuzzle.puzzle7;

import com.hipravin.javapuzzle.PuzzleAssert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Puzzle7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean passed = test(Integer.parseInt(input));

        System.out.println(
                passed ? "passed" : "failed");
    }

    static boolean test(int year) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        String formatted = dtf.format(LocalDate.of(year, 2,29));

        System.out.println(formatted);

        return formatted.contains(String.valueOf(year));
    }
}
