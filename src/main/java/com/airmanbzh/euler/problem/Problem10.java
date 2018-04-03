package com.airmanbzh.euler.problem;

import com.airmanbzh.euler.utils.PrimeNumber;

public class Problem10 {

    /**
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * <p>
     * Find the sum of all the primes below two million.
     *
     * @param primeBelow
     * @return
     */
    public static Long ex(Long primeBelow) {
        while (PrimeNumber.primes.size() == 0 || PrimeNumber.primes.get(PrimeNumber.primes.size() - 1) < primeBelow) {
            PrimeNumber.getNextPrime();
        }

        Long result = 0L;
        for (Integer i=0; i < PrimeNumber.primes.size() - 1 && PrimeNumber.primes.get(i) < primeBelow; i++) {
            result += PrimeNumber.primes.get(i);
        }

        return result;
    }
}