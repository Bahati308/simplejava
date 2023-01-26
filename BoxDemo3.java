// this program includes a method inside the Box class.
class Box {
    double width;
    double height;
    double depth;

    // display volume of the box
    void volume (){
        System.out.print("Volume is ");
        System.out.println(width*depth*height);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

    // assigning values to mybox1 instance variables

    mybox1.depth=10;
    mybox1.height=20;
    mybox1.width=30;

    // assigning values to mybox2 instance variables

    mybox2.depth=3;
    mybox2.height=6;
    mybox2.width=9;

        //display volume of the first box

        mybox1.volume();

        //display volume of the second box

        mybox2.volume();
    }
}
