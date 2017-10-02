package me.chrisp.taxes;


public abstract class TaxBracket
{
    private final double income;
    private double tempIncome;
    private double taxToPay;

    // These are all package private
    double tenPercentMin = 0;
    double fifteenPercentMin;
    double twentyFivePercentMin;
    double twentyEightPercentMin;
    double thirtyThreePercentMin;
    double thirtyFivePercentMin;

    TaxBracket(double income)
    {
        this.income = income;
    }

    public final double computeTax()
    {
        // Use a temporary variable to store the income in case the computeTax method is called twice
        // Also reset the amount of tax to pay otherwise it will just increase the previous tax each time
        tempIncome = income;
        taxToPay = 0;

        // 35% and above tax bracket
        if (tempIncome > thirtyFivePercentMin)
        {
            reduceIncome(thirtyFivePercentMin, 0.35);
        }

        // 33% tax bracket
        if (tempIncome > thirtyThreePercentMin)
        {
            reduceIncome(thirtyThreePercentMin, 0.33);
        }

        // 28% tax bracket
        if (tempIncome > twentyEightPercentMin)
        {
            reduceIncome(twentyEightPercentMin, 0.28);
        }

        // 25% tax bracket
        if (tempIncome > twentyFivePercentMin)
        {
            reduceIncome(twentyFivePercentMin, 0.25);
        }

        // 15% tax bracket
        if (tempIncome > fifteenPercentMin)
        {
            reduceIncome(fifteenPercentMin, 0.15);
        }

        // 10% tax bracket
        if (tempIncome > tenPercentMin)
        {
            reduceIncome(tenPercentMin, 0.10);
        }

        return taxToPay;
    }

    private void reduceIncome(double minimumPercentAmount, double percentage)
    {
        double amountToTax = tempIncome - minimumPercentAmount;
        tempIncome -= amountToTax;
        taxToPay += amountToTax * percentage;
    }
}
