package shapes;

public class ShapesTest {
    public static void main (String [] args){
        Rectangle box1 = new Rectangle();
        Rectangle box2 = new Square ();

        box1.set(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

//        box2.set(side, side);



    }

}
