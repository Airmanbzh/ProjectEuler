package com.airmanbzh.euler.problem;

public class Problem6 {

    /**
     * The sum of the squares of the first ten natural numbers is,
     * 12 + 22 + ... + 102 = 385
     * <p>
     * The square of the sum of the first ten natural numbers is,
     * (1 + 2 + ... + 10)2 = 552 = 3025
     * <p>
     * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
     * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     *
     * @param number
     * @return
     */
    public static Long ex(Integer number) {
        Long sum = 0L;
        Long squarredSum = 0L;

        for (Integer i = 1; i <= number; i++) {
            sum += i;
            squarredSum += (long) Math.pow(i, 2);
        }

        return (long) Math.pow(sum, 2) - squarredSum;
    }
}
