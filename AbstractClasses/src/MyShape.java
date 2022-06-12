import java.awt.*;

/*
 *
 * MyShape
 *
 */

public abstract class MyShape
{
	public static boolean calculateArea;
	// Instance variables for width and height of a shape.
	// Note use of protected modifier to allow direct access by a subclass
	//
	protected int  width, height;

	protected double radius;

	public MyShape(double radius) {
		this.radius = radius;
	}

	public MyShape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public abstract double calculateArea();

//
	// ToDo:
	//
	// Add a Constructor. This should initialise all of
	// the instance variables to the values passed in.
	//




	//
	// ToDo:
	//
	// Add an abstract calculateArea method which does not take any parameters.
	// This will force all subclasses of MyShape to implement this method
	// This method will return the area of a shape, choose a suitable return type


}
