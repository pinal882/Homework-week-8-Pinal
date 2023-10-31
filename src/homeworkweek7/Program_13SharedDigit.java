package homeworkweek7;

//write a method named hasSharedDigit with two parameters of type int
//Each Number should be within the range of 10 -99(inclusive), if one of the numbers is not within the range,method should return false.
public class Program_13SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int firstnumber, int secondnumber) {
        if ((firstnumber < 10 || firstnumber > 99) || (secondnumber < 10) || secondnumber > 99) {
            return false;
        }
        int testFirstNumber = firstnumber;
        int testSecondNumber = secondnumber;
        while (testFirstNumber != 0) {
            while (testSecondNumber != 0) {
                if ((testFirstNumber % 10) == (testSecondNumber)) {
                    return true;
                }
                testSecondNumber /= 10;
            }
            testFirstNumber /= 10;
        }
        return false;
    }


    }




