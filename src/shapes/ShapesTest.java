package shapes;

public class ShapesTest {
    public static void main (String [] args){
        Rectangle box1 = new Rectangle();

        box1.set(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

    }

}