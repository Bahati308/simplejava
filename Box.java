/*
 * this program introduces us to classes
 * 
 */
 class DemoBox {
    double width;
    double height;
    double depth;

 }
 //this class declares an object of type DemoBox.
public class Box {
    public static void main(String[] args) {
        DemoBox mybox = new DemoBox();
        double vol;

        // assigning values to mybox's instance variables
        mybox.width=10;
        mybox.depth=20;
        mybox.height=15;

        // compute volume of box

        vol= mybox.depth*mybox.height*mybox.width;
            System.out.println("volume is "+ vol);
        }
}
