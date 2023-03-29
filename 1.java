package week_1;

import static input.InputUtils.*;



/**
 * Ask the user how many miles they live from MCTC.
 *
 * Once the user has typed in their response,
 * • Display "You live more than 10 miles from MCTC" if they live more than 10 miles away,
 * • Display "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
 * • Display "You live less than 10 miles from MCTC" if they live less than 10 miles away.
 *
 * Use if – else if – else statements.
 */

public class Question_1_Miles_From_MCTC {

   public static void main(String[] args) {

       double miles = doubleInput("How many miles do you live from MCTC? ");

       if (miles > 10) {
           System.out.println("You live more than 10 miles from MCTC");
       } else if (miles == 10) {
           System.out.println("You live exactly 10 miles from MCTC");
       } else {
           System.out.println("You live less than 10 miles from MCTC");
       }
   }
}
