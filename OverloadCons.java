/* here, box defines three constructors to initialize
 * the dimensions of a box various ways
 */
class Box {
    double width;
    double height;
    double depth;

    //constructor used when all dimensions specifird 

    Box (double w, double h, double d){
        width= w;
        height =h;
        depth =d;

    }

    // constructor used when no dimensions specified 

    Box(){
        width = -1; // use -1 to indicate an 
        height = -1;// uninitialized box
        depth = -1;
    }

    // contructor used when a cube is created 
    Box(double len){
        width=depth=height=len;
    }

    // compute and return volume
    double volume(){
        return width*depth*height;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        // creating boxes using different constructors

        Box mybox1 =new Box(10, 20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;
        // get volume of the first box
            vol = mybox1.volume();
            System.out.println("Volume is :" + vol);

        // 2nd box
        vol = mybox2.volume();
        System.out.println("Volume is :"+vol);

        //3rd box
        vol = mycube.volume();
        System.out.println("Volume of mycube is :"+vol);
    }
}
