// we are adding a method to our classsuch that
// the volume () returns the volume of the box.

class Box {
    double width;
    double height;
    double depth;

    // compute and return volume.

    double volume() {
        return width*depth*height;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

// mybox1 values
        mybox1.depth=1;
        mybox1.height=2;
        mybox1.width=3;

// mybox2 values 
        mybox2.depth=4;
        mybox2.height=5;
        mybox2.width=6;

// getting volume of the first box

        vol =mybox1.volume();
        System.out.println("volume is "+ vol);

// getting volume of the second box

        vol = mybox2.volume();
        System.out.println("volume is "+ vol);
    }
}
