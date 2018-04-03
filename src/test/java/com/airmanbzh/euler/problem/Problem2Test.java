package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem2Test {

    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {0, 0},
                {1, 0},
                {2, 2},
                {3, 2},
                {4, 2},
                {5, 2},
                {6, 2},
                {7, 2},
                {8, 10},
                {4000000, 4613732},
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Integer n, Integer result) {
        assertEquals(result, Problem2.ex(n));
    }
}
