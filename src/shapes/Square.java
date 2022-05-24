package shapes;

public class Square extends Rectangle {
    protected double width;
    protected double length;

        public Square (double side) {
            set(side, side);
        };

}


//create a class named Square inside of shapes package

//define a constructor that accepts one argument side

//Square should define a constructor that accepts one argument, side, and calls
// the parent's constructor to
// set both the length and width to the value of side.
