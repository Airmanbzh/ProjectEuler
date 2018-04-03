package com.airmanbzh.euler.problem;

public class Problem2 {
    /**
     * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * <p>
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     */
    public static Integer ex(Integer max) {
        Integer sum = 0;
        Integer lastPrev = 0;
        Integer prev = 1;
        Integer currentValue = 1;
        Integer i = 0;

        while (currentValue <= max) {
            if (currentValue % 2 == 0) {
                sum += currentValue;
            }

            currentValue = lastPrev + prev;

            lastPrev = prev;
            prev = currentValue;

            i++;
        }

        return sum;
    }
}
