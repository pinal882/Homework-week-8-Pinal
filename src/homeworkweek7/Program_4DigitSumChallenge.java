package homeworkweek7;

// write a method with name sumDigits that has one int parameter called number.
//if parameter is >=10 then the method should process the number and return sum of all digits.
//otherwise return -1 to indicate an invalid value.
//the numbers from 0-9 have 1 digit ,so we don't want to process them,also we don't want to process negative numbers.
//also return -1 for negative numbers.
// for e.g, calling the method sumDigits(125) should return 8 since 1+2+5 =8.
//calling the method sumDigits(1) should return -1 as per the requirement above.
public class Program_4DigitSumChallenge {
    static int sumDigits(int number) {


        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number>0){
            int digit =number % 10;
            sum +=digit;
            number/=10;
        }
        return  sum;

    }

    public static void main (String[]args){
        //should return 8 since  1+2+5=8
         System.out.println(sumDigits(125));
         System.out.println(sumDigits(1));
         System.out.println(sumDigits(-6));
         System.out.println(sumDigits(12345));

    }
   }




