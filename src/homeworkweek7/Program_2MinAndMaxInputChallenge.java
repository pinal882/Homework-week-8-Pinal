package homeworkweek7;

import java.util.Scanner;


public class Program_2MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largeNumber = Integer.MIN_VALUE;
        int smallNumber = Integer.MAX_VALUE;
        int number;
        do {
            System.out.println("Please enter a number, or enter -111 to stop entering:");
            number = scanner.nextInt();
            if (number == -111) {// will break out of the loop if -111 entered
                break;
            } else {
                if (number > largeNumber) {
                    largeNumber = number;
                } else {
                    if (number < smallNumber) {
                        smallNumber = number;

                    }
                }

            }

        }while (number != -111);
        System.out.println("The smallest number is:" + smallNumber);
        System.out.println("The largets number is:" +largeNumber);
        scanner.close();
    }

        }


