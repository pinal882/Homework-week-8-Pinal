package homeworkweek7;

import java.util.Scanner;
//Display pattern like a triangle with a number.
// input number of rows:10
// Expected output:
//1
//12
//123
//1234
//12345
//123456
//1234567
//12345678
//123456789
//12345678910

public class Program_6DisplayTrianglePatternWithNumber {

    public static void main(String[] args) {
        int i, j, row;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        row = scanner.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
                System.out.println(" ");
                scanner.close();
            }
        }
    }
