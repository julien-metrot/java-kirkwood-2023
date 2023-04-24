package utilities;

import model.Game;
import model.GameDAO;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        System.out.println(Game.getHeaderRow());
        for (Game game: games) {
            System.out.println(game);
        }
    }

    public static String formatDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = date.format(format);
        return formattedDate;
    }

    public static String formatCurrency(double amount) {
        DecimalFormat formatter = new DecimalFormat("$#,###.00");
        return formatter.format(amount);
    }

    public static String formatCopySold(int amount) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(amount);
    }
}
