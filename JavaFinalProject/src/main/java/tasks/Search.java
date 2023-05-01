package tasks;

import model.Game;
import model.GameDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Search implements TaskHandler{
    @Override
    public void handleTask(Scanner scanner) {
        while(true) {
            String titleSearch = UserInput.getString(scanner, "Search by title [~ to exit]");
            if (titleSearch.equals("~")) {
                break;
            }
            // Example 1 : Linear Search
//            ArrayList<Game> games = GameDAO.getGames();
//            ArrayList<Game> filteredGames = new ArrayList<>();
//            for (Game game: games) {
//                if (game.getTitle().toLowerCase().contains(titleSearch.toLowerCase())) {
//                    filteredGames.add(game);
//                }
//            }

            // Example 2 : Declarative approach
            ArrayList<Game> filteredGames = new ArrayList<>(GameDAO.getGames());
            filteredGames.removeIf((game) -> !game.getTitle().toLowerCase().contains(titleSearch.toLowerCase()));
            if (filteredGames.size() >= 1) {
                Helpers.printArray(filteredGames);
            } else {
                System.out.println("No games found.");
            }

            Helpers.pressEnterToContinue(scanner);
        }
    }
}
