package utilities;

import model.Game;
import model.GameDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] strArray) {
        int choice = 1;
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(choice + ") " + strArray[i]);
            choice++;
        }
        System.out.println(choice + ") Exit");
        return UserInput.getInt(scanner, "Choose an option", 1, strArray.length + 1);
    }

    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString(scanner, "Press enter to continue");
    }

    public static void printArray(ArrayList<Game> games) {
        for (Game game: games) {
            System.out.println("Title: " + game.getTitle());
            System.out.println("Number of Copies Sold: " + game.getNumCopySold());
            System.out.println("Release Date: " + game.getReleaseDate());
            System.out.println("Played?: " + game.isPlayed());
            System.out.println("Price: " + game.getPrice());
            System.out.println();
        }
    }
}
