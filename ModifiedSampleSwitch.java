/*
 * this example shoes that we can 
 * make the previous program simple 
 * by simply having the break statements 
 * reduced as follows 
 */
public class ModifiedSampleSwitch {
    public static void main(String[] args) {
        //in the switch, break statements are optional
        for (int i=0; i<12; i++)
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
            System.out.println("i is less than 5");
                break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
            System.out.println("i is greater than 10"); 
                break;
                default:
                System.out.println("i is more than 10");       
            }
    }
}
