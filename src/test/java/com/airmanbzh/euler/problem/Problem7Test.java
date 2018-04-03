package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem7Test {
    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {1, 2L},
                {2, 3L},
                {3, 5L},
                {4, 7L},
                {5, 11L},
                {6, 13L},
                {10001, 104743L}
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Integer n, Long result) {
        assertEquals(result, Problem7.ex(n));
    }
}
