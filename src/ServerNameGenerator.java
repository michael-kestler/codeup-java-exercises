import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"funny", "serious", "cute", "handsome", "beautiful", "mysterious", "fortunate",
                "responsible", "prosperous"};

        String[] nouns = {"earth", "sun", "moon", "water", "wind", "fire", "platinum", "gold", "copper", "silver"};


        String randomAdj = (adjectives[new Random().nextInt(adjectives.length)]);
        String randomNoun = (nouns[new Random().nextInt(nouns.length)]);

        System.out.println(randomAdj + randomNoun);


    }

}