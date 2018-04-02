package com.airmanbzh.euler;

import com.sun.org.glassfish.gmbal.Description;

public class Project {

    @Description("If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9." +
            "The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000")
    public static Integer exOne(Integer n) {
        Integer sum = 0;

        if (n > 0) {
            for (Integer i = 0; i < n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
        }

        return sum;
    }
}
