package com.airmanbzh.euler.problem;

import com.airmanbzh.euler.utils.PrimeNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {

    public static List<Long> primes = new ArrayList<Long>();
    public static Long lastNotPrime = 1L;

    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     */
    public static Long ex(Long number) {

        Long result = 0L;

        List<Long> listResults = PrimeNumber.getPrimeFactors(number);

        if (listResults.size() > 0) {
            result = Collections.max(listResults);
        }

        return result;
    }
}
