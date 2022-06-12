

/*
 *
 * MyRectangle
 *
 */

public class MyRectangle extends MyShape {

    public MyRectangle(int width, int height) {
        super(width, height);
    }

    public double calculateArea() {
        return (width * height);
    }

    public String toString() {
        return "I am a Rectangle and my area is" + width * height;

        //
        // ToDo:
        //
        // Add a constructor which takes 2 arguments: width and height
        //
        // You will need to pass these on to the constructor of the superclass
        // Remember how to call a superclass constructor?


        //
        // ToDo:
        //
        // Implement the calculateArea() method defined in the superclass.
        //


    }
}