package homeworkweek7;

import java.util.Scanner;
/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers
 * Use hasNextInt() method from the scanner to check if the user entered  an int value
 * if hasNextInt() returns false, print the message "Invalid number", continue reading until you have read 10 numbers
 *
 * Before the user enter each number, print the message "Enter number #X:" where X represent the count 1, 2, 3 ...
 */

public class Program_1ReadingUserInputChallenge {

    public static void main(String[] args) {
        int count =1;
        int sum =0;

        Scanner scanner = new Scanner(System.in);

        while (count<=10){
            System.out.println("Please Enter  number " + count);
            boolean validatenumber  =scanner.hasNextInt();

            if (validatenumber){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                System.out.println("Invalid number");
            }
            //Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
        scanner.close();
    }

}
