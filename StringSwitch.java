/*
 * you can use string to control the switch statement
 * just as follows
 */
public class StringSwitch {
    public static void main(String[] args) {
        String str ="one";
        switch(str){
            case "one":
            System.out.println("one");
            break;
            case "two":
            System.out.println("two");
            break;
            case "three":
            System.out.println("three");
            break;
        default:
            System.out.println("no match");
            break;
        }
    }
}
