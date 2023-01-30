/*this program grades simple class results
 * developed by Bahati308
 * Mon Jan 30, 2023
 */

 //this imports the java.util which will be usefull later on
import java.util.*;

public class Grading {
    public static void main(String[] args) {
        try (// the above java.util helps us use this 
                // and enables us get input from the keyboard
        Scanner scan = new Scanner(System.in)) {
            //simply declaring varibles
            float eng, math, sci, prog;

   //Prompting the user to enter the data

            System.out.println("PLEASE ENTER RESULTS ");
            System.out.print("Programming: " );
            prog = scan.nextFloat();
            System.out.print("Science: ");
            sci = scan.nextFloat();
            System.out.print("Math: ");
            math =scan.nextFloat();
            System.out.print("English: ");
            eng =scan.nextFloat();

   //we are finding out the averages
            float average = ((eng+math+sci+prog)/4);
            System.out.println("Total Averages = "+average);

            if(average == 100){
                System.out.println("Excellent Work");
            }
            else if(average >=85 ){
                System.out.println("Impressive");
            }
            else if(average >= 65){
                System.out.println("You did great");
            }
            else {
                System.out.println("Do not settle for less");
            }
        }
    }
}
