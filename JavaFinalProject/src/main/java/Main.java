import model.Game;
import model.GameDAO;
import tasks.Add;
import tasks.Sort;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // write other methods here

    public static void main(String[] args) {
        GameDAO.retrieveData();
        // Only one user input Scanner allowed
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            String[] options = {
                    "Get all games",
                    "Sort games",
                    "Get one game",
                    "Add a game",
                    "Update a game",
                    "Delete a game"
            };
            main_program: while(true) {
                System.out.println("\n** MAIN MENU **");
                choice = Helpers.getChoice(scanner, options);
                switch(choice) {
                    case 1:
                        // Get all records
                        Helpers.printArray(GameDAO.getGames());
                        break;
                    case 2:
                        // Sort games
                        new Sort().handleTask(scanner);
                        break;
                    case 3:
                        // Get a single record
                        break;
                    case 4:
                        // Add a new record
                        new Add().handleTask(scanner);
                        break;
                    case 5:
                        // Update a single record
                        break;
                    case 6:
                        // Delete a single record
                        break;
                    default:
                        // exit
                        break main_program;
                } // close of switch
                Helpers.pressEnterToContinue(scanner);
            } // close of while
            System.out.println("Good bye!");
        } // close of Scanner
    } // close of main method

    // write other methods here

} // close of Main class