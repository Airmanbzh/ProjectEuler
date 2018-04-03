package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem8Test {
    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {"01234567890", 1, 9L},
                {"000", 1, 0L},
                {"000", 2, 0L},
                {"000", 4, 0L},
                {"111", 4, 0L},
                {"1111", 4, 1L},
                {"12345678987654321", 2, 72L},
                {"12345678987654321", 3, 576L},
                {Problem8.getDefaultBigNumber(), 3, 648L},
                {Problem8.getDefaultBigNumber(), 4, 5832L},
                {Problem8.getDefaultBigNumber(), 13, 23514624000L}
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(String bigStringNumber, Integer n, Long result) {
        assertEquals(result, Problem8.ex(bigStringNumber, n));
    }
}
