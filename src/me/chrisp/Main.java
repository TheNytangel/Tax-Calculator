package me.chrisp;

import me.chrisp.taxes.HeadOfHousehold;
import me.chrisp.taxes.MarriedJointly;
import me.chrisp.taxes.MarriedSeparately;
import me.chrisp.taxes.Single;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for filing status
	    System.out.println("Choose your filing status:");
	    System.out.println();
	    System.out.println("\t0) Single");
	    System.out.println("\t1) Married Filing Jointly");
	    System.out.println("\t2) Married Filing Separately");
	    System.out.println("\t3) Head of Household");
	    System.out.println();

	    System.out.print("> ");
	    int filingStatus = input.nextInt();
	    // Get income from user
	    System.out.print("Enter your amount of taxable income: ");
	    double taxableIncome = input.nextDouble();

	    // For whatever number the user entered, do that respective tax filing status
        boolean goodAnswer = true;
        double tax = 0;
	    switch(filingStatus)
        {
            case 0:
                Single single = new Single(taxableIncome);
                tax = single.computeTax();
                break;
            case 1:
                MarriedJointly marriedJointly = new MarriedJointly(taxableIncome);
                tax = marriedJointly.computeTax();
                break;
            case 2:
                MarriedSeparately marriedSeparately = new MarriedSeparately(taxableIncome);
                tax = marriedSeparately.computeTax();
                break;
            case 3:
                HeadOfHousehold headOfHousehold = new HeadOfHousehold(taxableIncome);
                tax = headOfHousehold.computeTax();
                break;
            default:
                goodAnswer = false;
                System.out.println("Error! Choose a correct filing status");
                break;
        }

        // If the user entered 0-3, display their tax
        if(goodAnswer)
        {
            System.out.printf("Your tax is $%,.2f%n", tax);
        }
    }
}
