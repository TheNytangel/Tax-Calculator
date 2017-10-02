package me.chrisp.taxes;


public class MarriedSeparately extends TaxBracket
{
    public MarriedSeparately(double income)
    {
        super(income);

        fifteenPercentMin = 8351;
        twentyFivePercentMin = 33951;
        twentyEightPercentMin = 68525;
        thirtyThreePercentMin = 104426;
        thirtyFivePercentMin = 186476;
    }
}
