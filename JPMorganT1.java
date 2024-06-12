package main.java;

public class JPMorganT1
{
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private double milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles)
    {
        if (isMiles)
        {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        }
        else
        {
            this.cashValue = milesValue;
            this.milesValue = milesValue / MILES_TO_CASH_RATE;
        }
    }

    // Method to get cash value
    public double getCashValue()
    {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue()
    {
        return milesValue;
    }
}
