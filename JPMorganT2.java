package main.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JPMorganT2
{

    // Existing tests
    @Test
    public void testCashConstructor()
    {
        RewardValue reward = new RewardValue(100);
        assertEquals(100, reward.getCashValue(), 0.001);
    }

    @Test
    public void testMilesConstructor()
    {
        RewardValue reward = new RewardValue(100, true);
        assertEquals(100, reward.getMilesValue(), 0.001);
    }

    // New test for cash to miles conversion
    @Test
    public void testCashToMilesConversion()
    {
        double cashValue = 100;
        double expectedMiles = cashValue / 0.0035;
        RewardValue reward = new RewardValue(cashValue);
        assertEquals(expectedMiles, reward.getMilesValue(), 0.001);
    }

    // New test for miles to cash conversion
    @Test
    public void testMilesToCashConversion()
    {
        double milesValue = 100;
        double expectedCash = milesValue * 0.0035;
        RewardValue reward = new RewardValue(milesValue, true);
        assertEquals(expectedCash, reward.getCashValue(), 0.001);
    }
}
