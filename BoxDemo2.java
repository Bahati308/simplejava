/*
this program declares two Box objects
*/

class Box{
    double width;
    double height;
    double depth;
}
public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //assigning values to mybox1 instance variables
        mybox1.depth= 15;
        mybox1.height=20;
        mybox1.width=10;

        /*
         * assigning different values to mybox2 instance
         * variables
         */
        mybox2.depth=3;
        mybox2.height=6;
        mybox2.width=9;

        //computing volume of th first box
        vol=mybox1.depth*mybox1.height*mybox1.width;
        System.out.println("volume is "+ vol);

        //volume of the second box

        vol=mybox2.depth*mybox2.height*mybox2.width;
        System.out.println("volume is "+ vol);

    }
}
