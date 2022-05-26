package shapes;

public class Square extends Quadrilateral{
    protected int length;
    protected int width;
    private int side;

    Square(int length, int width) {
        super(length, width);
    }

    public void setSide(int side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }
//    Square myShape;
}

//    public double side;
//
//
//
//    Square() {
//        this.side = 5;
//        Rectangle(side, side);
//    }
//
//
//
//
//    public double getArea() {
//        return side * side;
//    }
//
//    public double getPerimeter() {
//        return (4 * side);
//    }
//}










//create a class named Square inside of shapes package

//define a constructor that accepts one argument side

//Square should define a constructor that accepts one argument, side, and calls
// the parent's constructor to
// set both the length and width to the value of side.
