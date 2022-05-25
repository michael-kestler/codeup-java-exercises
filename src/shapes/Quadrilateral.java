package shapes;

public abstract class Quadrilateral extends Shape {
    protected double length;
    protected double width;

    //a constructor that accepts two numbers for length and width and sets those properties
    Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }


    //methods for getting the length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    //abstract methods for setting length and width






    //    public Quadrilateral(double l, double w){
//        length = l;
//        width = w;
//    }



}
