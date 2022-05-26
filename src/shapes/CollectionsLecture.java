package shapes;

import java.util.ArrayList;
import java.util.List;

public class CollectionsLecture {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        ArrayList<Integer> collectionOfNums = new ArrayList<>();
        collectionOfNums.add(16);
        collectionOfNums.add(44);
        collectionOfNums.add(53);
        collectionOfNums.add(32);

//        for (Integer num : collectionOfNums){
//            System.out.println(num);
//        }

//        System.out.println(numbers); // get list but also location in memory unless you use toString
//        //RETURNS
//        //16
//        //44
//        //53
//        //32
//        //[I@129a8472
//
//
//        System.out.println(collectionOfNums);

        //RETURNS
        //16
        //44
        //53
        //32
        //[16, 44, 53, 32]

        System.out.println(collectionOfNums.contains(53));

//        List<Square> squares = new ArrayList<>();
//        Square specialOne = new Square(4);//should be side check your code
//        squares.add(specialOne);
//        System.out.println(squares.contains(specialOne));
//        System.out.println(squares.contains(new Square(8)));
//
//        for(Square square : squares){
//            if (square.getLength() == 8) {
//                System.out.println("true, Square found with a side length of 8");
//            }
//
//    }

        ArrayList<String> names = new ArrayList<>();
        names.add("Beatrice");
//        if (names.isEmpty()) {
//            System.out.println("Hey you ain't got not names in there");
//        } else {
//            System.out.println("Cool names, boss!");
//
//        }

//        boolean resultOfRemove = names.remove("Beatrice");
//        System.out.println(resultOfRemove);

//        boolean didWeRemoveThatSquare = squares.remove(new Square(8));
//        System.out.println(didWeRemoveThatSquare);



    }
}

