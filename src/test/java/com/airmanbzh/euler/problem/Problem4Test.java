package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem4Test {

    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {0, 0L},
                {1, 9L},
                {2, 9009L},
                {3, 906609L}
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Integer n, Long result) {
        assertEquals(result, Problem4.ex(n));
    }
}
