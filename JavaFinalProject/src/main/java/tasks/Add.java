package tasks;

import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Add implements TaskHandler {

    @Override
    public void handleTask(Scanner scanner) {
        String title = UserInput.getString(scanner, "Enter the game's title");
        LocalDate releaseDate = UserInput.getDate(scanner, "Enter the release date");
        int numCopySold = UserInput.getInt(scanner, "How many copies were sold?", 0);
//        double price = UserInput.getDouble();
    }
}
