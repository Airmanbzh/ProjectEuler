package com.airmanbzh.euler.utils;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static List<Long> primes = new ArrayList<Long>();
    private static Long lastNotPrime = 1L;

    public static Long getNextPrime() {
        Boolean find = false;
        Long lastNumber = 0L;

        while (!find) {
            lastNumber = Math.max(primes.size() > 0 ? primes.get(primes.size() - 1) : 0, lastNotPrime) + 1;

            find = isPrime(lastNumber);

            if (find) {
                primes.add(lastNumber);
            } else {
                lastNotPrime = lastNumber;
            }
        }

        return lastNumber;
    }

    /**
     * Test if a number is divisible by one the known prime numbers
     *
     * @param number
     * @return Boolean
     */
    public static Boolean isPrime(Long number) {
        if (primes.contains(number)) {
            return true;
        }

        if (number < 2) {
            return false;
        }

        Integer i = 0;
        while (i < primes.size() && number % primes.get(i) != 0) {
            i++;
        }

        return i.equals(primes.size());
    }

    public static List<Long> getPrimeFactors(Long number) {
        List<Long> listResults = new ArrayList<Long>();
        Integer lastIndex = 0;

        if (number > 1) {
            if (primes.contains(number)) {
                listResults.add(number);
                return listResults;
            }

            while (!primes.contains(number) && number >= 2) {
                Boolean divided = false;
                for (Integer i = lastIndex; i < primes.size(); i++) {
                    if (number % primes.get(i) == 0) {
                        number = number / primes.get(i);
                        listResults.add(primes.get(i));
                        divided = true;
                    }
                }

                if (!divided) {
                    getNextPrime();
                }
            }

            if (primes.contains(number)) {
                listResults.add(number);
            }
        }

        return listResults;
    }
}
