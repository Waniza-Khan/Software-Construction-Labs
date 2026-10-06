package com.hitms.lms.util;

public final class AreaCalculator {

    private AreaCalculator() {
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @param length rectangle length
     * @param width rectangle width
     * @return rectangle area
     */
    public static int calculateArea(final int length, final int width) {
        int area = length * width;
        return area;
    }
}
