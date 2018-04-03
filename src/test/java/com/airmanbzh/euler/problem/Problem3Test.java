package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem3Test {

    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {0L, 0L},
                {1L, 0L},
                {2L, 2L},
                {3L, 3L},
                {4L, 2L},
                {5L, 5L},
                {6L, 3L},
                {7L, 7L},
                {8L, 2L},
                {9L, 3L},
                {10L, 5L},
                {11L, 11L},
                {12L, 3L},
                {13L, 13L},
                {14L, 7L},
                {15L, 5L},
                {16L, 2L},
                {17L, 17L},
                {18L, 3L},
                {121L, 11L},
                {600851475143L, 6857L}
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Long n, Long result) {
        assertEquals(result, Problem3.ex(n));
    }
}
