package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem6Test {

    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {2, 4L},
                {3, 22L},
                {10, 2640L},
                {100, 25164150L}
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Integer n, Long result) {
        assertEquals(result, Problem6.ex(n));
    }
}
