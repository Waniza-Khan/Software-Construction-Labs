package com.hitms.lms;

import com.hitms.lms.util.AreaCalculator;
import com.hitms.lms.util.PriceUtils;

public final class App {

    /** Sample rectangle length. */
    private static final int SAMPLE_LENGTH = 5;
    /** Sample rectangle width. */
    private static final int SAMPLE_WIDTH = 4;
    /** Sample price value. */
    private static final double SAMPLE_PRICE = 100.0;

    private App() {
    }

    /**
     * Runs the application example.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        int area = AreaCalculator.calculateArea(SAMPLE_LENGTH, SAMPLE_WIDTH);
        System.out.println("Area (5 x 4) = " + area);

        double[] prices = {SAMPLE_PRICE, SAMPLE_PRICE, SAMPLE_PRICE};
        double totalSum = PriceUtils.total(prices);
        double avgPrice = PriceUtils.average(prices);

        System.out.println("Total = " + totalSum);
        System.out.println("Average = " + avgPrice);
    }
}
