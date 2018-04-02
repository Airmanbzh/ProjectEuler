package com.airmanbzh.euler;

import static org.junit.Assert.*;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class ProjectTest {

    @DataProvider
    public static Object[][] ex1DataProvider() {
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
    @UseDataProvider("ex1DataProvider")
    public void testEx1(Integer n, Integer result) {
        assertEquals(result, Project.ex1(n));
    }

    @DataProvider
    public static Object[][] ex2DataProvider() {
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
    @UseDataProvider("ex2DataProvider")
    public void testEx2(Integer n, Integer result) {
        assertEquals(result, Project.ex2(n));
    }

    @DataProvider
    public static Object[][] ex3DataProvider() {
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
    @UseDataProvider("ex3DataProvider")
    public void testEx3(Long n, Long result) {
        assertEquals(result, Project.ex3(n));
    }
}
