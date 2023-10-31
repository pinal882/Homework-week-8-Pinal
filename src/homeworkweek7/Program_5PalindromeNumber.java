package homeworkweek7;

//write a

import java.util.Scanner;

public class Program_5PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println(isPalindrome(-1221));
        System.out.println(707);
        System.out.println(11212);
        System.out.println(523);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int rev = 0;


        while (number != 0) {
            int lastDigit = number % 10;
            rev = rev * 10 + lastDigit;
            number /= 10;
        }


        return originalNumber == rev;
    }



}
