import java.util.Scanner;
import java.lang.Math;
public class TipCalculator {
    public static void main(String[] args){
        //scanner
        Scanner input = new Scanner(System.in);
        //asking user for the bill, percentage that they want to tip, and the people in their party
        System.out.println("Please enter the total bill");
        double bill = input.nextDouble();
        System.out.println("Please enter the tip percentage as an integer");
        int tipPercentage = input.nextInt();
        double tip = tipPercentage*0.01;
        System.out.println("Please enter the number of people in the party");
        int people = input.nextInt();
        //the tip amount
        double tipAmount = bill*tip;
        //the total bill including tip
        double totalBill = (tipAmount+bill);
        //the tip each person has to pay
        double tipPerPerson = (tipAmount/people);
        //the total per person (bill and tip together
        double totalPerPerson = (totalBill/people);

        //rounding all variables
        //I forgot how to round decimals so I searched it up on google
        tipAmount = (Math.round(tipAmount*100));
        tipAmount /= 100;
        totalBill = (Math.round(totalBill*100));
        totalBill /= 100;
        tipPerPerson = (Math.round(tipPerPerson*100));
        tipPerPerson /= 100;
        totalPerPerson = (Math.round(totalPerPerson*100));
        totalPerPerson /= 100;

        //printing out all necessary information
        System.out.println("Total tip amount: " + tipAmount);
        System.out.println("Total bill including tip: " + totalBill);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total per person: " + totalPerPerson);

    }
}
