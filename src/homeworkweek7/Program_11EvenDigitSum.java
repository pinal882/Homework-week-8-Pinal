package homeworkweek7;

import java.util.Scanner;

public class Program_11EvenDigitSum {

    public static void main(String[] args) {
        //declare variables
        int number = 0;
        int sumOfEvenDigits = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: :");
        number = scanner.nextInt();
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(-22);
        scanner.close();

    }

    public static int getEvenDigitSum(int number) {
        //declaring variables
        int lastDigit = 0;
        int eveDigitSum = 0;
        //loop to repeat the process
        while (number != 0) {
            //find last digit
            lastDigit = number % 10;

            //check last digit even?
            if (lastDigit % 2 == 0) {//add it to sum
                eveDigitSum += lastDigit;
            }
            //remove last digit of number
            number = number / 10;
        }
        //return sum value
        return eveDigitSum;

    }

}





