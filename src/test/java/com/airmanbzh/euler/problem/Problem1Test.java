package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem1Test {

    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {0, 0},
                {3, 0},
                {4, 3},
                {5, 3},
                {6, 8},
                {9, 14},
                {10, 23},
                {1000, 233168},
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Integer n, Integer result) {
        assertEquals(result, Problem1.ex(n));
    }
}
