/*Developed by Bahati Brian Patrick
Demonstrate if-else-if statements

This program shows the seasons of the year.
 * 
*/

public class IfElse {
    public static void main(String[] args) {
        int month =4; //April
        String season;
        if (month ==12 || month ==1 || month==2)
        season ="Winter";
        else if (month==3 || month==4 || month==5)
        season = "Spring";
        else if (month==6 || month==7 || month==8)
        season = "Summer";
        else if (month==9 || month== 10 ||month==11)
        season= "Autumn";
        else 
        season ="Bogus month";

    System.out.println("April is the "+ season);

    }
}
