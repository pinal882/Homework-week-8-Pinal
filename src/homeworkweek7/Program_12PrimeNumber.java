package homeworkweek7;

import java.util.Scanner;

public class Program_12PrimeNumber {
    //input any number and check if it is prime or not
    //number>1 and divided by 1 or itself only

    public static void main(String[] args) {
        int number = 3;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        number = scanner.nextInt();

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime number");
            }
scanner.close();
        }

    }
}














