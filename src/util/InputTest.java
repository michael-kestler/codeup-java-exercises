package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args){

        Input sc1 = new Input(new Scanner(System.in));
        Input sc2 = new Input(new Scanner(System.in));
        Input sc3 = new Input(new Scanner(System.in));
        Input sc4 = new Input(new Scanner(System.in));
        Input sc5 = new Input(new Scanner(System.in));

        System.out.println(sc1.getString());
        System.out.println(sc2.yesNo());
        System.out.println(sc3.getInt(25, 50));






        //        System.out.println(sc1.getString());

//        System.out.println(sc1.yesNo());
//
//        System.out.println(sc1.getInt(25, 100));


//        Input input1 = new Input()


//        Scanner sc = new Scanner(System.in);




    }
}
