package homeworkweek7;

import java.util.Scanner;

// input any number and check if it is Armstrong number or not
//153=(1*1*1)+(5*5*5)+(3*3*3)
//where
//(1*1*1)=1
//(5*5*5)=125
//(3*3*3)=27
//so:
//1+125+27 =153
public class Program_10ArmstrongNumber {

    static void armstrong(int num){
        int newNum =153,remainder,originalNumber,result = 0;
        originalNumber = num;
        //find sum of all digit's cube of the number
        while (originalNumber !=0){
            remainder=originalNumber %10;
            result+= Math.pow(remainder, 3);
            originalNumber/=10;
        }
        //Check if sum of all digit's cube of the number is equal to the given number or not.
        if (result==num){
            System.out.println(num +" is armtstrong. ");
        }else {
            System.out.println(num + " is not armstrong.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int newNum = scanner.nextInt();
        armstrong(153);

        scanner.close();
    }
}
