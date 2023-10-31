package homeworkweek7;
// write a java program that takes the user to provide a single character from the alphabet.
// print vowel of consonant
//if user input is not a letter between a-z or A-Z or length>1 print an error message.
//input an alphabet:p
//Expected output: input letter is consonant
import java.util.Scanner;

public class Program_3VowelOrConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet");
        String input = scanner.next().toLowerCase();
        boolean uppercase = input.charAt(0)>=65 && input.charAt(0)<=90;
        boolean lowercase = input.charAt(0)>=97 && input.charAt(0) <=122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")||input.equals("o") || input.equals("u");
        if (input.length() > 1){
            System.out.println("Error. Not a single character.");
        }else if (!(uppercase || lowercase)){
            System.out.println("Error. Not a letter.Enter uppercase or lowercase");
        }else  if (vowels){
            System.out.println("Input letter is Vowel");
        }else {
            System.out.println("Input letter is Consonant");
        }

    }
}
