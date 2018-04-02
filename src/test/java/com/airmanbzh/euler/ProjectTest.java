package com.airmanbzh.euler;

import static org.junit.Assert.*;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class ProjectTest {

    @DataProvider
    public static Object[][] exOneDataProvider() {
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
    @UseDataProvider("exOneDataProvider")
    public void testExOne(Integer n, Integer result) {
        assertEquals(result, Project.exOne(n));
    }
}
