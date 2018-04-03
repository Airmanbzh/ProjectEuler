package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem5Test {

    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {2, 2L},
                {3, 6L},
                {10, 2520L},
                {20, 232792560L}
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Integer n, Long result) {
        assertEquals(result, Problem5.ex(n));
    }
}
