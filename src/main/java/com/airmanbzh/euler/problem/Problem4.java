package com.airmanbzh.euler.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
    /**
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static Long ex(Integer numberOfDigit) {
        Long result = 0L;

        if (numberOfDigit > 0) {
            Long maxNumber = (long) (Math.pow(10, numberOfDigit) - 1);
            Long minNumber = (long) (Math.pow(10, numberOfDigit - 1));

            List<Long> palindromeList = new ArrayList<Long>();

            for (Long i = maxNumber; i >= minNumber; i--) {
                for (Long j = i; j >= minNumber; j--) {
                    Long mult = i * j;

                    if (mult.toString().equals((new StringBuilder(mult.toString())).reverse().toString())) {
                        palindromeList.add(mult);
                    }
                }
            }

            if (palindromeList.size() > 0) {
                result = Collections.max(palindromeList);
            }
        }

        return result;
    }
}
