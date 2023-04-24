package tasks;

import model.Game;
import model.GameDAO;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Add implements TaskHandler {

    @Override
    public void handleTask(Scanner scanner) {
        Game game = new Game();
        String title = UserInput.getString(scanner, "Enter the game's title");
        game.setTitle(title);
        LocalDate releaseDate = UserInput.getDate(scanner, "Enter the release date");
        game.setReleaseDate(releaseDate);
        int numCopySold = UserInput.getInt(scanner, "How many copies were sold?", 0);
        game.setNumCopySold(numCopySold);
        boolean played = UserInput.getBoolean(scanner, "Have you played this game?");
        game.setPlayed(played);
        double price = UserInput.getDouble(scanner, "How much is this?");
        game.setPrice(price);
        GameDAO.addGame(game);
    }
}