package com.hitms.lms;

import org.fusesource.jansi.Ansi;

/**
 * Colors class for styling console output.
 */
public final class Colors {

    private Colors() {
        // Private constructor
    }

    /**
     * Main method.
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println(
            Ansi.ansi()
                .fg(Ansi.Color.MAGENTA)
                .a("Hello, Software Construction!")
                .reset()
        );
    }
}
