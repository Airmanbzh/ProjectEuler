package com.airmanbzh.euler.problem;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class Problem10Test {
    @DataProvider
    public static Object[][] exDataProvider() {
        return new Object[][]{
                {5L, 5L},
                {6L, 10L},
                {8L, 17L},
                {10L, 17L},
//                {2000000L, 142913828922L} // Can take a lot of time because the complexity of calculating the prime number list (O(n^2))
        };
    }

    @Test
    @UseDataProvider("exDataProvider")
    public void testEx(Long maxPrimeBelow, Long primeSum) {
        assertEquals(primeSum, Problem10.ex(maxPrimeBelow));
    }
}
