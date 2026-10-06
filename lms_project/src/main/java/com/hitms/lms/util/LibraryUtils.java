package com.hitms.lms.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryUtils {

    /** Cleans up a book title and returns it in Title Case. */
    public static String formatTitle(String title) {
        String[] words = title.strip().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.isEmpty()) {
                continue;
            }
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1))
              .append(' ');
        }
        return sb.toString().strip();
    }

    /** Whole days between two dates, in either order. */
    public static long daysBetween(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
}
