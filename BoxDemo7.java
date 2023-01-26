/*here, Box uses a parameterized constructor 
 * initialize the dimensions of the box
*/
class Box {
    double width;
    double height;
    double depth;

    //this is the constructor for Box

    Box (double w, double h, double d){
        width = w;
        height =h;
        depth =d;


    }    
    // compute and return volume
    double volume(){
        return width*depth*height;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
    //declaring, allocating and initializing Box objects
    Box mybox1 = new Box(2, 3, 4);
    Box mybox2 = new Box(5, 6, 7);
    
    double vol;

    // volume of the first box
    vol = mybox1.volume();
    System.out.println("volume is "+ vol);

    // volume of the second box
    vol = mybox2.volume();
    System.out.println("volume is "+ vol);
    
    }
}
