package homeworkweek7;

import java.util.Scanner;

//Display right angle triangle of @ using nested for loops
//Expected Result:
//@
//@@
//@@@
//@@@@
//@@@@@
public class Program_8DisplayRightAngelTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Right Angles triangle pattern rows = ");
        int rows = scanner.nextInt();
        System.out.println("Printing right angles triangle @ pattern");
        for (int i = 1; i<=rows; i++){
            for (int j =1; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
            scanner.close();
        }
    }
}
