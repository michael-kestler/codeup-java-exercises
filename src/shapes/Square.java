package shapes;

public class Square extends Rectangle {

    public double side;

    Square(double side) {
        this.side = side;

    }

    Square(){
        this.side = 5;

    }


    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return (4 * side);
    }
}










//create a class named Square inside of shapes package

//define a constructor that accepts one argument side

//Square should define a constructor that accepts one argument, side, and calls
// the parent's constructor to
// set both the length and width to the value of side.
