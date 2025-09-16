// Gloria Merino
//9-15-2025
// creating a code program to help track compound interest using user input
// convert interest rate from percentage to decimal
//Final Value will be computed as A = P * (1+r)^t

import java.math.BigDecimal;
import java.util.Scanner; //first, and allows user input 
public class CompoundInterest_Gloria_Merino 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring the following variables
        double inHome;
        int years;
        double interest;
        double finHome; 
        System.out.print("Enter the initial value of the home: $");//prompting user
        inHome = input.nextDouble();
        System.out.print("Enter the number of years elapsed: ");
        years = input.nextInt();
        System.out.print("Enter the interest rate: ");
        int percentage = input.nextInt();
        interest = percentage / 100.0; //converting percentage to decimals
        // System.out.print(interest); <-- used to test if interest was calculated correctcly
        finHome = inHome * Math.pow((1+interest), years);//compound interest formula
        double finprice = Math.round(finHome*100)/100;

        System.out.print("The Final Value of the home is $"+finprice+".");
    }
}
