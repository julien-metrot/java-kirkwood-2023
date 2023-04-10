package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameDAO {
    private static ArrayList<Game> games;
    public static void retrieveData() {
        try (Scanner scanner = new Scanner(new File("JavaFinalProject\\src\\main\\resources\\games.csv"))){
            games = new ArrayList<>();
            scanner.nextLine(); // read in the header row and don't do anything with it.
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                Game game = new Game();
                game.setTitle(values[0]);
                game.setNumCopySold(Integer.parseInt(values[1]));
                game.setPrice(Double.parseDouble(values[2]));
                game.setPlayed(Boolean.parseBoolean(values[3]));
                game.setReleaseDate(LocalDate.parse(values[4]));
                // set remaining values here
                games.add(game);
            }
            Collections.sort(games);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Game> getGames() {
        return games;
    }
}
