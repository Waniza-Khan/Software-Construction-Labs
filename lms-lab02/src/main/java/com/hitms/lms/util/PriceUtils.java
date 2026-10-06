package com.hitms.lms.util;

public final class PriceUtils {

    private PriceUtils() {
    }

    /**
     * Calculates the sum of the supplied prices.
     *
     * @param prices prices to add
     * @return sum of the prices
     */
    public static double total(final double[] prices) {
        double sum = 0;
        for (final double price : prices) {
            sum += price;
        }
        return sum;
    }

    /**
     * Calculates the average of the supplied prices.
     *
     * @param prices prices to average
     * @return average price
     */
    public static double average(final double[] prices) {
        return total(prices) / prices.length;
    }
}
