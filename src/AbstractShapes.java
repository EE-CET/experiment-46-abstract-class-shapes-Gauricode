abstract class Shape {
    // TODO: Abstract method numberOfSides()
   abstract void numberOfSides();
}

class Rectangle extends Shape{
	void numberOfSides(){
		System.out.println("Rectangle has 4 sides");
	}
}
class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("Hexagon has 6 sides");
	}
}
// Implement numberOfSides() to print "Rectangle has 4 sides"

// TODO: Create class Triangle extends Shape
// Implement numberOfSides() to print "Triangle has 3 sides"

// TODO: Create class Hexagon extends Shape
// Implement numberOfSides() to print "Hexagon has 6 sides"

public class AbstractShapes {
    public static void main(String[] args){
	Rectangle r=new Rectangle();
	Triangle t=new Triangle();
	Hexagon h=new Hexagon();
	r.numberOfSides();
	t.numberOfSides();
	h.numberOfSides();
        // TODO: Create objects for Rectangle, Triangle, and Hexagon
        // TODO: Call numberOfSides() for each object in the order: Rectangle, Triangle, Hexagon
    }
}
