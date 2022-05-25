package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}





    //    protected double width;
//    protected double length;
//
//    public void Rectangle(double l, double w) {
//        length = l;
//        width = w;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }
//}



