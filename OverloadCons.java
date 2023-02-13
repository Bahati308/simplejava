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

    Box( ){
        width = -1;
        height = -1;
        depth = -1;
    }
}



public class OverloadCons {
    public static void main(String[] args) {
        
    }
}
