package com.airmanbzh.euler.problem;

import com.airmanbzh.euler.utils.MultNumber;

public class Problem9 {

    /**
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     * <p>
     * a2 + b2 = c2
     * For example, 32 + 42 = 9 + 16 = 25 = 52.
     * <p>
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     *
     * @param tripletSum
     * @return
     */
    public static Long ex(Integer tripletSum) {
        for (Integer a = 2; a < tripletSum - 2 * a; a++) {
            for (Integer b = a; b < tripletSum - a; b ++) {
                Integer c = tripletSum - a -b;
                if (Math.pow(c,2) == Math.pow(a, 2) + Math.pow(b,2)) {
                    return (long) a * (long) b * (long) c;
                }
            }
        }

        return 0L;
    }
}