package homeworkweek7;

public class Program_7FirstAndLastDigitSum {

    public static  int sumFirstAndLastDigit(int number){
        int lastDigit = number%10;
        int firstDigit = number;

        while (firstDigit>=10) {
            firstDigit = firstDigit / 10;

        }
        System.out.println("First Digit="+ firstDigit);
        System.out.println("Last Digit=" + lastDigit);
        System.out.println("Sum=" +(firstDigit+lastDigit));

        return lastDigit;
    }

    public static void main(String[] args) {

        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);


    }
}
