package homeworkweek7;

import java.util.Scanner;
 //     *
 //    ***
//    *****
//   *******
//  *********
//  ***********
// *************
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *

public class Program_14DisplayDiamondPattern {

    public static void main(String[] args) {
        int i, j, r;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows(half of the diamond) :");
        r = scanner.nextInt();
        for (i=0;i<=r;i++) {
            for (j=1;j<=r-i;j++)
                System.out.print(" ");
            for (j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (i=r-1;i>=1;i--) {

            for (j=1;j<=r-i;j++)
                System.out.print(" ");
            for (j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        scanner.close();
    }

}
