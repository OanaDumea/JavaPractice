

/*
 *
 * MyCircle
 *
 */

public class MyCircle extends MyShape {

    public MyCircle(int radius) {
        super(radius);
    }

    public double calculateArea(){
        return(radius*radius*Math.PI);
    }

    public String toString(){
        return "I am a Circle and my area is" + radius;
    }

	//
	// ToDo:
	//
	// Add a constructor which takes ONLY 1 argument1: radius
	// THATS 1 ARGUMENTS NOT 2 !
    // You can pass it into the superclass constructor twice







	//
	// ToDo:
	//
	// Implement the calculateArea() method defined in the superclass.
	//
	//







}
