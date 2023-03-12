import utilities.UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Only one user input Scanner allowed
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            main_program: while(true) {
                // To Do: Prompt user for all options
                choice = UserInput.getInt(scanner, "Choose an option", 1, 7);
                switch(choice) {
                    case 1:
                        // Get all records
                        break;
                    case 2:
                        // Sort all records
                        break;
                    case 3:
                        // Get a single record
                        break;
                    case 4:
                        // Add a new record
                        String title = UserInput.getString(scanner, "Enter the title");
                        boolean isHardCover = UserInput.getBoolean(scanner, "Is this a hard cover book?");
                        int numPages = UserInput.getInt(scanner, "How many pages?", 1);
                        int temperature = UserInput.getInt(scanner, "What temperature is it today?");
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
            } // close of while
            System.out.println("Good bye!");
        } // close of Scanner
    } // close of main method
} // close of Main class