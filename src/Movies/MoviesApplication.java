package Movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();


        int userChoice;
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            userChoice = Input.getInt(0, 5);

            switch (userChoice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    MoviesArray.fullList(movies);
                    break;
                case 2:
                    MoviesArray.listByCategory(movies, "animated");
                    break;
                case 3:
                    MoviesArray.listByCategory(movies, "drama");
                    break;
                case 4:
                    MoviesArray.listByCategory(movies, "horror");
                    break;
                case 5:
                    MoviesArray.listByCategory(movies, "scifi");
                    break;

            }
        } while (userChoice != 0);

    }
}


