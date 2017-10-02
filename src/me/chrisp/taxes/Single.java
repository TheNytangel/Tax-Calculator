package me.chrisp.taxes;


public class Single extends TaxBracket
{
    public Single(double income)
    {
        super(income);

        fifteenPercentMin = 8351;
        twentyFivePercentMin = 33951;
        twentyEightPercentMin = 82251;
        thirtyThreePercentMin = 171551;
        thirtyFivePercentMin = 372951;
    }
}
