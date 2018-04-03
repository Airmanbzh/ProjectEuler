package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem9Test {
    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {12, 60L},
                {24, 480L},
                {40, 2040L},
                {1000, 31875000L}
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Integer tripletSum, Long tripletMultiplication) {
        assertEquals(tripletMultiplication, Problem9.ex(tripletSum));
    }
}
