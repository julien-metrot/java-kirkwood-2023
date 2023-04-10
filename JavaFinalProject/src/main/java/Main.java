import model.Game;
import model.GameDAO;
import tasks.Sort;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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
                    "Sort games by date",
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
                        // Sort games by date
                        Sort.handleTask(scanner);
                        break;
                    case 3:
                        // Get a single record
                        break;
                    case 4:
                        // Add a new record
//                        Book book1 = new Book("Java for Web Application", 850,
//                                49.99, true,
//                                LocalDate.of(2019, 8, 15));
//                        System.out.println(book1.getTitle());
//                        System.out.println(book1.getNumPages());
//                        Book book2 = new Book("Java a Beginner's Guide", 680,
//                                34.5, true,
//                                LocalDate.of(2020, 9, 1));
//                        System.out.println(book2.getTitle());
//                        System.out.println(book2.getNumPages());
//                        System.out.println(Book.getBookCount());
//                        Book book3 = book1;
//                        book3.setTitle("Python Programming");
//                        System.out.println(book1.getTitle());
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