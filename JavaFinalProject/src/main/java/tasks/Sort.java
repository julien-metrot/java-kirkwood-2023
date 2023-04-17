package tasks;

import model.Game;
import model.GameDAO;
import utilities.Helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort implements TaskHandler {
    public void handleTask(Scanner scanner) {
        int choice = 0;
        String[] options = {
                "Sort by title (A to Z)",
                "Sort by title (Z to A)",
                "Sort by release date (old to new)",
                "Sort by release date (new to old)",
                "Sort by number of copies sold (low to high)",
                "Sort by number of copies sold (high to low)",
                "Sort by price (low to high)",
                "Sort by price (high to low)"
        };
        sort_program: while(true) {
            System.out.println("\n** SORT MENU **");
            choice = Helpers.getChoice(scanner, options);
            ArrayList<Game> games = GameDAO.getGames();
            switch(choice) {
                case 1:
                    // Sort title A-Z
                    Collections.sort(games, (a, b) -> a.getTitle().compareTo(b.getTitle()));
                    break;
                case 2:
                    // Sort title Z-A
                    Collections.sort(games, (a, b) -> a.getTitle().compareTo(b.getTitle()) * -1);
                    break;
                case 3:
                    // Sort date old-new
                    Collections.sort(games, (a, b) -> a.getReleaseDate().compareTo(b.getReleaseDate()));
                    break;
                case 4:
                    // Sort date new-old
                    Collections.sort(games, (a, b) -> a.getReleaseDate().compareTo(b.getReleaseDate()) * -1);
                    break;
                case 5:
                    // Sort number of copies sold 0-9
                    Collections.sort(games, (a, b) -> Integer.compare(a.getNumCopySold(), b.getNumCopySold()));
                    break;
                case 6:
                    // Sort number of copies sold 9-0
                    Collections.sort(games, (a, b) -> Integer.compare(a.getNumCopySold(), b.getNumCopySold()) * -1);
                    break;
                case 7:
                    // Sort price 0-9
                    Collections.sort(games, (a, b) -> Double.compare(a.getPrice(), b.getPrice()));
                    break;
                case 8:
                    // Sort price 9-0
                    Collections.sort(games, (a, b) -> Double.compare(a.getPrice(), b.getPrice()) * -1);
                    break;
                default:
                    // exit
                    break sort_program;
            } // close of switch
            Helpers.printArray(games);
            Helpers.pressEnterToContinue(scanner);
        } // close of while
    }
}
