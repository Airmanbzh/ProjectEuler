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

    @DataProvider
    public static Object[][] exTwoDataProvider() {
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
    @UseDataProvider("exTwoDataProvider")
    public void testExTwo(Integer n, Integer result) {
        assertEquals(result, Project.exTwo(n));
    }
}
