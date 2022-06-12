package Movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
     Movie[] movies = MoviesArray.findAll();
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            int userChoice = Input.getInt(0, 5);

        switch(userChoice){
            case 0:
                System.exit(0);
            case 1:
                MoviesArray.fullList(movies);
            case 2:





        }




    }
}
