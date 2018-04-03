package com.airmanbzh.euler.problem;

import com.airmanbzh.euler.utils.PrimeNumber;

import java.util.HashMap;
import java.util.List;

public class Problem5 {

    /**
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     * <p>
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     *
     * @param max
     * @return
     */
    public static Long ex(Integer max) {
        HashMap<Long, Integer> primeMap = new HashMap<Long, Integer>();
        Long result = 1L;

        for (Integer i = 2; i <= max; i++) {
            HashMap<Long, Integer> subMap = new HashMap<Long, Integer>();
            List<Long> primeNumbers = PrimeNumber.getPrimeFactors((long) i);

            for (Long primeNumber : primeNumbers) {
                subMap.put(primeNumber, subMap.containsKey(primeNumber) ? subMap.get(primeNumber) + 1 : 1);
            }

            for (Long key : subMap.keySet()) {
                if (!primeMap.containsKey(key)) {
                    primeMap.put(key, 0);
                }

                primeMap.put(key, Math.max(primeMap.get(key), subMap.get(key)));
            }
        }

        for (Long key : primeMap.keySet()) {
            result *= (long) Math.pow(key, primeMap.get(key));
        }

        return result;
    }
}
