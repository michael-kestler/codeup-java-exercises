import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Say something to Bob: ");
            String userString;

            userString = scanner.nextLine();
            if (userString.endsWith("?")){
                System.out.println("Sure.");
            } else if (userString.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (userString.equals(" ")){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
    }
}


