package shapes;

public class Rectangle {
    protected double width;
    protected double length;

    public void set(double l, double w){
        length = l;
        width = w;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }
}


