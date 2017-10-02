package me.chrisp.taxes;


public class HeadOfHousehold extends TaxBracket
{
    public HeadOfHousehold(double income)
    {
        super(income);

        fifteenPercentMin = 11951;
        twentyFivePercentMin = 45501;
        twentyEightPercentMin = 117451;
        thirtyThreePercentMin = 190201;
        thirtyFivePercentMin = 372951;
    }
}
