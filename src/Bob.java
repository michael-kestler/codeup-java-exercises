import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
//        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Say something to Bob: ");
            String userString = sc.next();


            if (userString.endsWith("?")){
                System.out.println("Sure.");
            } else if (userString.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (userString.equals("")){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

//            switch ((userString.endsWith(userString + "?")) ? 0 :
//                    (userString.endsWith(userString + "!")) ? 1 :
//                    (userString.equals("")) ? 2 : 3){
//                case 0:
//                    System.out.println("Sure.");
//                    break;
//                case 1:
//                    System.out.println("Whoa, chill out!");
//                    break;
//                case 2:
//                    System.out.println("Fine. Be that way!");
//                    break;
//                case 3:
//                    System.out.println("Whatever");
//                    break;
////                case 4:
////                    System.out.println("You got an F loser");
////                    break;
////                case 5:
////            }
////            System.out.print("Continue? [y/N] ");
////            String goAgain = sc.next();
////            if (!goAgain.equals("y")) {
////                break;
////            }
//        }
    }
}


