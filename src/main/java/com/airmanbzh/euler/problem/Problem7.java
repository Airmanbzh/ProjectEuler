package com.airmanbzh.euler.problem;

import com.airmanbzh.euler.utils.PrimeNumber;

public class Problem7 {

    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * <p>
     * What is the 10 001st prime number?
     *
     * @param primeNumberIndex
     * @return
     */
    public static Long ex(Integer primeNumberIndex) {
        Long lastNotPrime = 0L;

        while (PrimeNumber.primes.size() <= primeNumberIndex - 1) {
            PrimeNumber.getNextPrime();
        }

        return PrimeNumber.primes.size() >= primeNumberIndex ? PrimeNumber.primes.get(primeNumberIndex - 1) : 0;
    }
}
