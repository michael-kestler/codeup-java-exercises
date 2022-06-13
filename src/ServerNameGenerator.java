import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"funny", "serious", "cute", "handsome", "beautiful", "mysterious", "fortunate",
            "responsible", "prosperous"};

    public static String[] nouns = {"earth", "sun", "moon", "water", "wind", "fire", "platinum", "gold", "copper",
            "silver"};

    public static String randomName() {
        String randomAdj = (adjectives[new Random().nextInt(adjectives.length)]);
        String randomNoun = (nouns[new Random().nextInt(nouns.length)]);
        return (randomAdj + "-" + randomNoun);

    }



    public static void main(String[] args) {

        System.out.println("Here is your server name: ");
        System.out.println(randomName());


    }

}