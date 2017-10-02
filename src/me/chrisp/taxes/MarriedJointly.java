package me.chrisp.taxes;


public class MarriedJointly extends TaxBracket
{
    public MarriedJointly(double income)
    {
        super(income);

        fifteenPercentMin = 16701;
        twentyFivePercentMin = 67901;
        twentyEightPercentMin = 137051;
        thirtyThreePercentMin = 208851;
        thirtyFivePercentMin = 372951;
    }
}
